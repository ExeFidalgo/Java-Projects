package maquinaDeCafe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MaquinaPremiumTest {
	MaquinaDeCafe maquina;
	
	@Before
	public void setup() {
		maquina = new MaquinaPremium();
	}
	
	@Test
	public void queDevuelveUnVasoAlServir() {
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertNotNull(vaso);
	}
	@Test
	public void quePuedeServirUnCafe() {
		Assert.assertTrue(maquina.puedeServir());
	}
}
