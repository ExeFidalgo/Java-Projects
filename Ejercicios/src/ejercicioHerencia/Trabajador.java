package ejercicioHerencia;

public class Trabajador extends Persona {
	private double salario;
	private int antiguedad;
	
	public Trabajador(int dni, String nombre, double salario, int antiguedad) {
		super(dni, nombre);
		this.salario = salario;
		this.antiguedad = antiguedad;
		
	}
	public void trabajar() {
		System.out.println("Trabajador trabajando");
	}
	
}
