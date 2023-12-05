package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuprincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	public String nombre;
	public int id;
	public String carrera;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuprincipal frame = new menuprincipal("hola",0,"");
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
	public menuprincipal(String nombre, int id, String carrera) {
		this.nombre = nombre;
		this.id = id;
		this.carrera = carrera;
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
		
		JLabel lblNewLabel_5 = new JLabel("APGE");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 57));
		lblNewLabel_5.setBounds(154, 40, 202, 149);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblIndice = new JLabel("Indice: ");
		lblIndice.setForeground(new Color(255, 255, 255));
		lblIndice.setBounds(645, 245, 100, 14);
		contentPane.add(lblIndice);
		
		btnNewButton = new JButton("Ver Materias");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//boton ver materias
			}
		});
		btnNewButton.setBackground(new Color(0, 44, 83));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		btnNewButton.setBounds(28, 289, 185, 63);
		contentPane.add(btnNewButton);
		
		JButton btnVerCalificaciones = new JButton("Consultar Calificacion");
		btnVerCalificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//boton consultar calificacion
			}
		});
		btnVerCalificaciones.setBackground(new Color(0, 44, 83));
		btnVerCalificaciones.setForeground(new Color(255, 255, 255));
		btnVerCalificaciones.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		btnVerCalificaciones.setBounds(28, 392, 185, 63);
		contentPane.add(btnVerCalificaciones);
		
		JButton btnVerMaestros = new JButton("Ver Maestros");
		btnVerMaestros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//boton ver maestros
			}
		});
		btnVerMaestros.setBackground(new Color(0, 44, 83));
		btnVerMaestros.setForeground(new Color(255, 255, 255));
		btnVerMaestros.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnVerMaestros.setBounds(291, 289, 185, 63);
		contentPane.add(btnVerMaestros);
		
		JButton btnRetirarMaterias = new JButton("Retirar Materias");
		btnRetirarMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//boton retirar materia
			}
		});
		btnRetirarMaterias.setBackground(new Color(0, 44, 83));
		btnRetirarMaterias.setForeground(new Color(255, 255, 255));
		btnRetirarMaterias.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		btnRetirarMaterias.setBounds(291, 392, 185, 63);
		contentPane.add(btnRetirarMaterias);
		
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

