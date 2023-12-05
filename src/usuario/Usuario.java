package usuario;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

abstract class Usuario implements InformacionUsuario , Autentificacion {

	
	String nombre;
	String correo;
	String password;
	String rol;
	int id;
	
	//Getters y setters
	public void setNombre() {
		Scanner entry = new Scanner(System.in);
		String nombre;
		nombre = entry.nextLine();
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setCorreo() {
		Scanner entry = new Scanner(System.in);
		String correo;
		correo = entry.nextLine();
		this.correo = correo;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setPassword() {
		Scanner entry = new Scanner (System.in);
		String password;
		password = entry.nextLine();
		this.password = password;
		
	}
	
	public String getPassword() {
		
		return password;
	}
	
	public void setRol() {
		Scanner entry = new Scanner(System.in);
		String rol;
		rol = entry.nextLine();
		this.rol = rol;
		
	}
	
	public String getRol() {
		
		return rol;
	}
	
	public void setID() {
		Random random = new Random();
		int id = random.nextInt(8999) + 1000;
		this.id = id;
	}
	
	public int getID() {
		
		return id;
	}
	//Fin de getter y setters
	
	//---
	
	//Agregar usuario
	
	public void agregarUsuario() {
		
		
		
	}
}

