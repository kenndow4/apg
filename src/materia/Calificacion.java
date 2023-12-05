package materia;

import java.util.Scanner;

public class Calificacion {

	int calificacion;
	
	public void agregarCalificacion() {
		int calificacion;
		Scanner entry = new Scanner(System.in);
		calificacion = entry.nextInt();
		this.calificacion = calificacion;
	}
	
	public void getnota() {
		
		if(calificacion <= 100 && calificacion >= 90 ) {
			System.out.println("A");
		}
		else if(calificacion <=89 && calificacion >=80) {
			System.out.println("B");
		}
		else if(calificacion <=79 && calificacion >=70) {
			System.out.println("C");
		}
		else if(calificacion <=69) {
			System.out.println("F");
		}
		
	}
	
	public static void main(String[] args) {
		
		Calificacion c1 = new Calificacion();
		
		c1.agregarCalificacion();
		c1.getnota();
	}
}