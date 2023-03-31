package juegoEstrategia;

public class Capa extends Item {

	public Capa(Unidad unidad) {
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
		this.unidad.recibirDanio(danio * 0.90);
	}

	public void duplicaEnergia() {
		if (unidad.getClass().equals(Soldado.class)) {

		}
	}

	@Override
	public String toString() {
		return "Capa [unidad=" + unidad.toString() + "]";
	}

}
