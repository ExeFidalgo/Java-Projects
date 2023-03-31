package ejercicio;

public class Ejercicio4 {
	public static void darVueltaLaFecha(int fecha) {
		int dia;
		int mes; 
		int anio;
		
		anio = fecha / 10000;
		dia = fecha % 100;
		mes = fecha / 100 % 100;
		System.out.println("Dia " + dia + ", Mes " + mes + ", Año " + anio);			
	}
	public static void main(String[] args) {
		
		darVueltaLaFecha(20220316);
		darVueltaLaFecha(19770603);
		darVueltaLaFecha(19850925);
	}

	}


