package menu;
import java.sql.Connection;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import usuario.Estudiante;

import javax.swing.border.Border;
import javax.swing.JComboBox;
//a
public class registro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txt_email;
    private JTextField txt_nombre;
    private JTextField txt_password;
    private JTextField txt_autentipassword;
    private Estudiante estudiante;
    private JButton SignUp = new JButton("SIGN UP");
    JComboBox seleccionCarrera = new JComboBox();
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    registro frame = new registro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public registro() {
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(registro.class.getResource("/Image/kenedi.jpg")));
        setTitle("APGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 370, 521);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 20, 44));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
      //a
        JLabel lblNewLabel = new JLabel("Full Name:");
        lblNewLabel.setForeground(new Color(255, 182, 83));
        lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel.setBounds(40, 103, 85, 27);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Email:");
        lblNewLabel_1.setForeground(new Color(255, 182, 83));
        lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel_1.setBounds(40, 173, 85, 25);
        contentPane.add(lblNewLabel_1);

        // Crear Border redondeado
        

        txt_email = new JTextField();
        txt_email.setForeground(new Color(0, 0, 0));
        txt_email.setBounds(40, 200, 274, 34);

        contentPane.add(txt_email);
        txt_email.setColumns(10);

        
        SignUp.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
        SignUp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent el) {
        		
        		if(txt_nombre.getText().isEmpty() || txt_email.getText().isEmpty() || txt_password.getText().isEmpty() || seleccionCarrera.getActionCommand().isEmpty()) {
        		    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, complete todos los campos.");
        		} else {
        		    // Los campos no están vacíos, ahora procedemos con la conexión y la inserción en la base de datos
        		    try {
        		        String url = "jdbc:mysql://localhost:3306/apgee";
        		        String usuario = "root";
        		        String password = "";

        		        Connection cn = DriverManager.getConnection(url, usuario, password);
        		        PreparedStatement pst = cn.prepareStatement("INSERT INTO usuario(nombre, email, contraseña, carrera) VALUES(?,?,?,?)");
        		        pst.setString(1, txt_nombre.getText());
        		        pst.setString(2, txt_email.getText());
        		        pst.setString(3, txt_password.getText());
        		        pst.setString(4, seleccionCarrera.getActionCommand());
        		        pst.executeUpdate();

        		        JOptionPane.showMessageDialog(null, "Registro realizado con éxito");

        		    } catch (SQLException e1) {
        		        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar registrar en la base de datos");
        		        e1.printStackTrace(); 
        		    }
        		}

        	}
        });
        SignUp.setForeground(new Color(255, 255, 255));
        SignUp.setBackground(new Color(255, 98, 99));
        SignUp.setBounds(219, 437, 125, 34);
        contentPane.add(SignUp);

       
        JLabel lblNewLabel_2 = new JLabel();
        ImageIcon imageIcon = new ImageIcon(registro.class.getResource("/Image/kenedi.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(130, 105, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(image));
        lblNewLabel_2.setBounds(10, 11, 98, 81);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("REGISTER");
        lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 36));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setBounds(118, 29, 170, 37);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("APGE ALWAYS FOR YOU");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(10, 444, 146, 27);
        contentPane.add(lblNewLabel_4);
        
        txt_nombre = new JTextField();
        txt_nombre.setForeground(Color.BLACK);
        txt_nombre.setColumns(10);
        txt_nombre.setBounds(40, 128, 274, 34);
        contentPane.add(txt_nombre);
        
        JLabel lblNewLabel_1_1 = new JLabel("Password:");
        lblNewLabel_1_1.setForeground(new Color(255, 182, 83));
        lblNewLabel_1_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel_1_1.setBounds(40, 245, 85, 25);
        contentPane.add(lblNewLabel_1_1);
        
        txt_password = new JTextField();
        txt_password.setForeground(Color.BLACK);
        txt_password.setColumns(10);
        txt_password.setBounds(40, 268, 274, 34);
        contentPane.add(txt_password);
        
        
        seleccionCarrera.setBounds(10, 411, 140, 22);
        contentPane.add(seleccionCarrera);
        
        seleccionCarrera.addItem("Seleccionar Carrera");
        seleccionCarrera.addItem("Software");
        seleccionCarrera.addItem("Multimedia");
        seleccionCarrera.addItem("Seguridad Informatica");
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Confirm Password");
        lblNewLabel_1_1_1.setForeground(new Color(255, 182, 83));
        lblNewLabel_1_1_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel_1_1_1.setBounds(40, 324, 146, 25);
        contentPane.add(lblNewLabel_1_1_1);
        
        txt_autentipassword = new JTextField();
        txt_autentipassword.setForeground(Color.BLACK);
        txt_autentipassword.setColumns(10);
        txt_autentipassword.setBounds(40, 348, 274, 34);
        contentPane.add(txt_autentipassword);
        
    }
}
