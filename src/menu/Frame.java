package menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import javax.swing.JComboBox;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField;
    private JLabel span;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame frame = new Frame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Frame() {
       
    	Conexion conexion = new Conexion();
    	conexion.conectar();
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Frame.class.getResource("/Image/kenedi.jpg")));
        setTitle("APGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 370, 521);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 20, 44));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
      //a
        JLabel lblNewLabel = new JLabel("Email");
        lblNewLabel.setForeground(new Color(255, 182, 83));
        lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel.setBounds(40, 127, 85, 27);
        contentPane.add(lblNewLabel);

       

        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setForeground(new Color(255, 182, 83));
        lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
        lblNewLabel_1.setBounds(40, 197, 85, 25);
        contentPane.add(lblNewLabel_1);
        JLabel span = new JLabel("");
        span.setBounds(110, 270, 205,29);
        span.setForeground(new Color(255, 225, 225));
        span.setFont(new Font("Yu Gothic Light", Font.BOLD, 14));
        contentPane.add(span);

        // Crear Border redondeado
        

        textField_1 = new JTextField();
        textField_1.setForeground(new Color(0, 0, 0));
        textField_1.setBounds(40, 223, 274, 34);

        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("SIGN UP");
        btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
  
            
                
                
            }
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(255, 98, 99));
        btnNewButton.setBounds(116, 381, 125, 34);
        contentPane.add(btnNewButton);

       
        JLabel lblNewLabel_2 = new JLabel();
        ImageIcon imageIcon = new ImageIcon(Frame.class.getResource("/Image/kenedi.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(130, 105, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(image));
        lblNewLabel_2.setBounds(50, 28, 98, 81);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("APGE");
        lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 36));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setBounds(158, 49, 140, 37);
        contentPane.add(lblNewLabel_3);
        
        JButton btnLogIn = new JButton("LOG IN");
        btnLogIn.setForeground(Color.WHITE);
        btnLogIn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
         btnLogIn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String email = textField.getText();
                String pass = textField_1.getText();
                
                if(email.equals("") || pass.equals("")){
                     span.setText("Hay campos vacio");
        
                }else{
                   try{
                     Conexion conexion = new Conexion();
                     conexion.conectar();
                    
                     
                     PreparedStatement pst = conexion.conectar().prepareStatement("select * from usuario where email =? and contraseña =?");
                     pst.setString(1, email);
                     pst.setString(2, pass);

                     ResultSet rs = pst.executeQuery();
                     if(rs.next()){
                        span.setText("El usuario existe"+rs.getString("nombre"));
                     }else{
                        span.setText("El usuario no existe");
                     }

                   }catch(Exception ev){
                    System.out.println(ev);

                   }
                }

                
            }
        });
        btnLogIn.setBackground(new Color(10, 217, 233));
        btnLogIn.setBounds(83, 307, 194, 37);
        contentPane.add(btnLogIn);
        
        JLabel lblNewLabel_4 = new JLabel("APGE ALWAYS FOR YOU");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(116, 426, 146, 27);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("¿Don't have an account? ");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
       

        lblNewLabel_5.setBounds(116, 355, 146, 14);
        contentPane.add(lblNewLabel_5);
        
        textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setColumns(10);
        textField.setBounds(40, 152, 274, 34);
        contentPane.add(textField);
    }
}