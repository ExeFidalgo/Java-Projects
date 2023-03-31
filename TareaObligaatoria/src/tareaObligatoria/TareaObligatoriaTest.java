package tareaObligatoria;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class TareaObligatoriaTest {

	@Test
	public void agregarLibrosTest() {
		Biblioteca b1 = new Biblioteca(10);
		b1.agregarLibro("Cien años de soledad", "Garcia Marquez", 100);
		b1.agregarLibro("el amor en tiempos de colera", "Garcia Marquez", 200);
		b1.agregarLibro("el Aleph", "Borges", 300);
		Assert.assertNotNull (b1);
	}
	@Test
	public void cuantosLibrosDelAutorTest() {
		Biblioteca b1 = new Biblioteca(10);
		b1.agregarLibro("Cien años de soledad", "Garcia Marquez", 100);
		b1.agregarLibro("el amor en tiempos de colera", "Garcia Marquez", 200);
		b1.agregarLibro("el Aleph", "Borges", 300);
		assertEquals( b1.cuantosLibrosDelAutor("Garcia Marquez"), 2, 0);
	}
	@Test
	public void tiempoEnLeetTodosLosLibrosTest() {
		Biblioteca b1 = new Biblioteca(10);
		b1.agregarLibro("Cien años de soledad", "Garcia Marquez", 100);
		b1.agregarLibro("el amor en tiempos de colera", "Garcia Marquez", 200);
		b1.agregarLibro("el Aleph", "Borges", 300);
		int esperado = 600;
		int obtenido = b1.tiempoEnLeetTodosLosLibros();
		assertEquals(esperado, obtenido);
	}
}
