package juegoEstrategia;

public class Punial extends Item {

	public Punial(Unidad unidad) {
		super(unidad);

	}

	@Override
	public void atacar(Unidad u) {
		this.unidad.atacar(u);
	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return this.unidad.puedeAtacar(u);
	}

	public void infringirDanio(double danio) {
		this.unidad.recibirDanio(danio + 3);
	}

	public void recibirDanio(double danio) {
		this.unidad.recibirDanio(danio + 3);
	}

	@Override
	public String toString() {
		return "Punial [unidad=" + unidad.toString() + "]";
	}

	
}
