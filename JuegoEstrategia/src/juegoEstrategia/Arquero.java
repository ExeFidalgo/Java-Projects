package juegoEstrategia;

public class Arquero extends Unidad {

	private int carcaj;
	private static final int DANIO = 5;

	public Arquero(Punto posicion) {
		super(50, posicion);
		this.carcaj = 20;
	}

	@Override
	public void atacar(Unidad u) {
		if (this.puedeAtacar(u)) {
			this.infringirDanio(u);
		}

	}

	public void infringirDanio(Unidad u) {
		u.recibirDanio(DANIO);

	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (!u.estaMuerta() && u.distancia(u) >= 2 && u.distancia(u) <= 5 && this.carcaj > 0);
	}

	public int recargarCarcaj() {
		return this.carcaj += 6;
	}

}
