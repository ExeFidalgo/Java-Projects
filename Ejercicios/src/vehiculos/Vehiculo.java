package vehiculos;

public abstract class Vehiculo {
	private int kilometrosRecorridos;
	private Persona chofer;

	public Vehiculo(int kms, Persona chofer) {
		this.kilometrosRecorridos = kms;
		asignarChofer(chofer);
	}

	public int getKilometroRecorridos() {
		return this.kilometrosRecorridos;
	}

	protected void asignarChofer(Persona chofer) {
		this.chofer = chofer;
	}

	public abstract void cambiarChofer(Persona nuevoChofer);
}
