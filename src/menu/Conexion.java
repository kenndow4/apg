package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

	String bd = "apgee2";
	String url = "jdbc:mysql://localhost:3306/";
	String user = "root";
	String password = "";
	String driver = "com.mysql.cj.jdbc.Driver";
	Connection cx;
	
	public Conexion() {
		
		
	}
	
	public Connection conectar() {
		
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url+bd,user,password);
			System.out.println("Se conecto a la base de datos");
		} catch (ClassNotFoundException |SQLException ex) {
			 
			 System.out.println("No se conecto a la BSD  " + bd);
		  }
		return cx;
	}
	
	public void desconectar() {
		try {
			cx.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PreparedStatement prepareStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
}
