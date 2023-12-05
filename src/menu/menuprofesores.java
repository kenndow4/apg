package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

import usuario.Estudiante;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuprofesores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton MostrarEstudiante;
	private Estudiante estudiante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuprofesores frame = new menuprofesores();
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
	public menuprofesores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 20, 44));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//a
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(635, 172, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(802, 172, 33, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Profesor");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(715, 172, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("APGE");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 57));
		lblNewLabel_5.setBounds(154, 40, 202, 149);
		contentPane.add(lblNewLabel_5);
		
		MostrarEstudiante = new JButton("Mostrar Estudiantes");
		MostrarEstudiante.setBackground(new Color(0, 44, 83));
		MostrarEstudiante.setForeground(new Color(255, 255, 255));
		MostrarEstudiante.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		MostrarEstudiante.setBounds(26, 348, 185, 63);
		contentPane.add(MostrarEstudiante);
		
		MostrarEstudiante.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				estudiante.ObtenerInformacion();
			}
			
		});		
		JButton btnVerMaestros = new JButton("Asignar Calificacion");
		btnVerMaestros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//boton asignar calificacion
			}
		});
		btnVerMaestros.setBackground(new Color(0, 44, 83));
		btnVerMaestros.setForeground(new Color(255, 255, 255));
		btnVerMaestros.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnVerMaestros.setBounds(279, 348, 185, 63);
		contentPane.add(btnVerMaestros);
		
        JLabel lblNewLabel_4 = new JLabel("");
        ImageIcon icon = new ImageIcon(menuprofesores.class.getResource("/image/user-286.png"));
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
        ImageIcon icon2 = new ImageIcon(menuprofesores.class.getResource("/image/kenedi.jpg"));
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

