package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class menuprincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton verMaterias;
	public String nombre;
	public int id;
	public String carrera;
	public float indice;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuprincipal frame = new menuprincipal("APGE",0,"",0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menuprincipal(String nombre, int id, String carrera, float indice) {
		this.nombre = nombre;
		this.id = id;
		this.carrera = carrera;
		this.indice = indice;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 20, 44));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//a
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: " + nombre);
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(645, 175, 200, 24);
		contentPane.add(lblNombre);
		
		
		JLabel lblId = new JLabel("Matricula: 2023-" + String.valueOf(id));
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setBounds(645, 200, 100, 14);
		contentPane.add(lblId);
		
		JLabel lblTipoEstudiante = new JLabel("Estudiante");
		lblTipoEstudiante.setForeground(new Color(255, 255, 255));
		lblTipoEstudiante.setBounds(645, 162, 100, 14);
		contentPane.add(lblTipoEstudiante);
		
		JLabel lblCarrera = new JLabel("Carrera: " + carrera);
		lblCarrera.setForeground(new Color(255, 255, 255));
		lblCarrera.setBounds(645, 221, 200, 14);
		contentPane.add(lblCarrera);
		
		JLabel lblNewLabel_5 = new JLabel("Indice: "+ String.valueOf(indice));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 37));
		lblNewLabel_5.setBounds(154, 40, 252, 149);
		contentPane.add(lblNewLabel_5);
		
		// JLabel lblIndice = new JLabel("Indice: " + String.valueOf(indice));
		// lblIndice.setForeground(new Color(255, 255, 255));
		// lblIndice.setBounds(645, 221, 220, 14);
		// contentPane.add(lblIndice);
		
		verMaterias = new JButton("Ver Materias");
		verMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String url = "jdbc:mysql://localhost:3306/apgee2";
			    String usuario = "root";
			    String password = "";

			    try {
			        // Establecer la conexión
			        Connection conexion = DriverManager.getConnection(url, usuario, password);

			        // Consulta con JOIN para obtener el nombre de la materia y del profesor
			        String sql = "SELECT m.nombre_materia, p.nombre_profesor " +
			                     "FROM materia m " +
			                     "JOIN profesor p ON m.id_profesor = p.id_profesor " +
			                     "WHERE m.id_estudiante = ?";
			        PreparedStatement statement = conexion.prepareStatement(sql);
			        statement.setInt(1, 4);

			        // Ejecutar la consulta
			        ResultSet resultSet = statement.executeQuery();

			        StringBuilder materias = new StringBuilder("Materias del estudiante:\n");

			        // Recorrer los resultados y agregar las materias y profesores al StringBuilder
			        while (resultSet.next()) {
			            String nombreMateria = resultSet.getString("nombre_materia");
			            String nombreProfesor = resultSet.getString("nombre_profesor");

			            materias.append(nombreMateria).append(" - Profesor: ").append(nombreProfesor).append("\n");
			        }

			        resultSet.close();
			        statement.close();
			        conexion.close();

			        // Mostrar las materias en una ventana emergente
			        JOptionPane.showMessageDialog(null, materias.toString(), "Materias del Estudiante", JOptionPane.INFORMATION_MESSAGE);

			    } catch (SQLException ex) {
			        ex.printStackTrace();
			        JOptionPane.showMessageDialog(null, "Error al obtener la información de las materias", "Error", JOptionPane.ERROR_MESSAGE);
			    }
			}

			
		});
		verMaterias.setBackground(new Color(0, 44, 83));
		verMaterias.setForeground(new Color(255, 255, 255));
		verMaterias.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		verMaterias.setBounds(300, 310, 185, 63);
		contentPane.add(verMaterias);
		
		JButton btnVerCalificaciones = new JButton("Consultar Calificacion");
		btnVerCalificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String url = "jdbc:mysql://localhost:3306/apgee2";
			    String usuario = "root";
			    String password = "";

			    try {
			        // Establecer la conexión
			        Connection conexion = DriverManager.getConnection(url, usuario, password);

			        // Consulta para obtener el nombre de la materia y la calificación
			        String sql = "SELECT m.nombre_materia, c.total " +
			                     "FROM materia m " +
			                     "JOIN calificacion c ON m.id_materia = c.id_materia " +
			                     "WHERE m.id_estudiante = ?";
			        PreparedStatement statement = conexion.prepareStatement(sql);
			        statement.setInt(1, 4);

			        // Ejecutar la consulta
			        ResultSet resultSet = statement.executeQuery();

			        StringBuilder calificaciones = new StringBuilder("Calificaciones del estudiante:\n");

			        
			        while (resultSet.next()) {
			            String nombreMateria = resultSet.getString("nombre_materia");
			            double calificacion = resultSet.getDouble("total");

			            calificaciones.append(nombreMateria)
			                .append(" - Calificación: ").append(calificacion)
			                .append("\n");
			        }

			        resultSet.close();
			        statement.close();
			        conexion.close();

			      
			        JOptionPane.showMessageDialog(null, calificaciones.toString(), "Calificaciones del Estudiante", JOptionPane.INFORMATION_MESSAGE);

			    } catch (SQLException ex) {
			        ex.printStackTrace();
			        JOptionPane.showMessageDialog(null, "Error al obtener la información de las calificaciones", "Error", JOptionPane.ERROR_MESSAGE);
			    }
			}

		});
		btnVerCalificaciones.setBackground(new Color(0, 44, 83));
		btnVerCalificaciones.setForeground(new Color(255, 255, 255));
		btnVerCalificaciones.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		btnVerCalificaciones.setBounds(28, 310, 185, 63);
		contentPane.add(btnVerCalificaciones);
		

		

		
        JLabel lblNewLabel_4 = new JLabel("");
        ImageIcon icon = new ImageIcon(menuprincipal.class.getResource("/image/user-286.png"));
        Image image = icon.getImage().getScaledInstance(150, 125, Image.SCALE_SMOOTH);
        lblNewLabel_4.setIcon(new ImageIcon(image));
        lblNewLabel_4.setBounds(655, 28, 156, 133);
        contentPane.add(lblNewLabel_4);
        
        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel.setBackground(new Color(0, 21, 47));
                panel.setBounds(635, 28, 185, 133);
        contentPane.add(panel);
        
        JButton btnNewButton_1 = new JButton("Exit");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(ABORT);
        	}
        });
        btnNewButton_1.setBounds(714, 421, 108, 34);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel_7 = new JLabel("New label");
        ImageIcon icon2 = new ImageIcon(menuprincipal.class.getResource("/image/kenedi.jpg"));
        Image image2 = icon2.getImage().getScaledInstance(180, 125, Image.SCALE_SMOOTH);
        lblNewLabel_7.setIcon(new ImageIcon(image2));
        lblNewLabel_7.setBounds(0, 70, 141, 98);
        contentPane.add(lblNewLabel_7);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(229, 229, 229));
        panel_1.setBounds(0, 245, 845, 14);
        contentPane.add(panel_1);
	}
}

