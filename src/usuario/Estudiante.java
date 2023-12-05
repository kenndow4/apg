package usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante extends Usuario {

	int Calificacion;
	String Carrera;
		
	
	
	//Agregar estudiante
	public void agregarEstudiante() {
		System.out.print("Agregue el nombre: ");
		super.setNombre();
		System.out.print("Agregue su Correo electronico: ");
		super.setCorreo();
		System.out.print("Agregue un password: ");
		super.setPassword();
		System.out.println("");
		super.setID();
		
		
	}
		
	@Override
	public void ObtenerInformacion() {
		System.out.print("Nombre: "+super.getNombre());
		System.out.println(" ");
		System.out.print("Correo Electronico: "+super.getCorreo());
		System.out.println(" ");
		System.out.print("Matricula: "+super.getID());
		System.out.println(" ");
		
		
		
	}

	@Override
	public boolean Autentificar(String password) {
		if(Autentificar(password)) {
			System.out.println("Correct.");
		}else {
			System.out.println("Incorrect.");
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Estudiante n = new Estudiante();
		
		n.agregarEstudiante();
		n.ObtenerInformacion();
		
	}
}