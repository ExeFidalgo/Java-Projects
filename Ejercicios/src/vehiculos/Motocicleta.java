package vehiculos;

public class Motocicleta extends Vehiculo {
	private Persona acompaniante;
	
	public Motocicleta (int kms, Persona chofer) {
		super(kms, chofer);
	}
	public boolean agregarAcompañanate(Persona acompaniante) {
		if(!hayAcompaniante()) {
		this.acompaniante = acompaniante;
		return true;
	}return false;
	}
	@Override
	public void cambiarChofer(Persona nuevoChofer) {
		if(!hayAcompaniante())
			super.asignarChofer(nuevoChofer);
	}
	private boolean hayAcompaniante() {
		return this.acompaniante != null;
	}
	
}
