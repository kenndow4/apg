package materia;

public class Materia {

		String nombre;
		String codigo;
		int creditos;
		
	public Materia(String nombre, String codigo, int creditos) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.creditos = creditos;
	};
	
	public String getNombre(){
		return nombre;
		
	};
	
	public String getCodigo() {
		
		return codigo;
	}
	
	public int getCreditos() {
		
		return creditos;
	}
	
	public static void main(String[] args) {
		
		Materia programacion = new Materia("programacion","TDS-001", 4 );
		Materia precalculo = new Materia("precalculo","MAT-001",5);
		Materia fundamento_del_computador = new Materia("Fundamentos del computador", "TI-101",4);
		Materia base_de_datos = new Materia("Base de datos", "TDS-101", 4);
		Materia dibujo = new Materia("Dibujo","TMM-02",4);
		Materia fundamento_de_seguridad = new Materia("fundamentos de seguridad","TSI-102",4);
		
		
		
	}
}