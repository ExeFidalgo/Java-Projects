package juegoEstrategia;

public class Caballero extends Unidad {
	private Caballo caballo;
	private static final int DANIO = 50;

	public Caballero(int salud, Punto posicion) {
		super(200, posicion);
		caballo = new Caballo();
	}

	@Override
	public void atacar(Unidad u) {
		if (this.puedeAtacar(u)) {
			this.infringirDanio(u);
		}
		caballo.incrementarAtaque();
	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (!u.estaMuerta() && u.distancia(u) >= 1 && u.distancia(u) <= 2 && caballo.isRebelde());
	}
	
	public void infringirDanio(Unidad u) {
		u.recibirDanio(DANIO);

	}
}
