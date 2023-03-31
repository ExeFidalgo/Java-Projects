package ejercicioHerencia;

public class Persona {
	private int dni;
	private String nombre;
	
	public Persona (int dni, String nombre) {
		 this.dni = dni;
		 this.nombre = nombre;
	}
	
	public void dormir() {
		System.out.println("persona durmiendo");
	}
	public void comer() {
		System.out.println("persona comiendo");
	}
}
