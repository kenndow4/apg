package usuario;

public class Profesor extends Usuario {

	
	//Agregar_estudiante
		public void agregarProfesor() {
			System.out.print("Introduzca su Correo electronico: ");
			super.setCorreo();
			System.out.print("Introduzca su password: ");
			super.setPassword();
			
			
			
		}
	
	
	@Override
	public void ObtenerInformacion() {
		
		System.out.print("Correo electronico: "+super.getCorreo());
		super.setID();
		System.out.println(" ");
		System.out.println("ID: "+super.getID());
		
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
		
		Profesor n1 = new Profesor();
		n1.agregarProfesor();
		n1.ObtenerInformacion();
	}

}
