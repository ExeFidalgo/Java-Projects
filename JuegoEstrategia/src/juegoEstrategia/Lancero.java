package juegoEstrategia;

public class Lancero extends Unidad {

	private static final int DANIO = 25;

	public Lancero(Punto posicion) {

		super(50, posicion);

	}

	@Override
	public void atacar(Unidad u) {
		if (this.puedeAtacar(u))
			this.infringirDanio(u);

	}


	public void infringirDanio(Unidad u) {

		u.recibirDanio(DANIO);
	}

	@Override
	public boolean puedeAtacar(Unidad u) {

		return (!u.estaMuerta() && u.distancia(u) >= 1 && u.distancia(u) <= 3);
	}
}
