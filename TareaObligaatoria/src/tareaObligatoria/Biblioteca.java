package tareaObligatoria;

import java.util.ArrayList;

public class Biblioteca {
	private Libro[] libros;

	int librosAgregados = 0;

	public Biblioteca(int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
	}

	public int cuantosLibros() {
		int contadorLibros = 0;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null) {
				contadorLibros++;
			}
		}
		return contadorLibros;
	}

	public boolean agregarLibro(String titulo, String autor, int paginas) {
		Libro agregado = new Libro(titulo, autor, paginas);
		if (librosAgregados < libros.length) {
			libros[librosAgregados] = agregado;
			librosAgregados++;
			System.out.println("Agregaste exitosamente un libro a la biblioteca");
			return true;
		} else {
			System.out.println("Ha llegado allimite de libros");
			return false;
		}
	}

	public String libroEnLaPosicion(int posicion) {
		String retorno = libros[posicion - 1].getTitulo();
		return retorno;
	}

	public Libro libroConMasPaginas() {
		int maximo = libros[0].getPaginas();
		int posicion = 0;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null && libros[i].getPaginas() > maximo) {
				maximo = libros[i].getPaginas();
				posicion = i;
			}
		}
		System.out.println(libros[posicion].getTitulo());
		return libros[posicion];
	}

	public int cuantosLibrosDelAutor(String autor) {
		int acum = 0;

		for (int i = 0; libros.length > i; i++) {
			if (libros[i] != null) {
				if (libros[i].getAutor() == autor)
					acum++;
			}
		}
		return acum;
	}

	public ArrayList<Libro> librosDelAutor(String autor) {
		ArrayList<Libro> escritores = new ArrayList<Libro>();
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null) {
				if (libros[i].getAutor() == autor) {
					escritores.add(libros[i]);
				}
			}
		}
		return escritores;
	}

	public int tiempoEnLeetTodosLosLibros() {
		int acumulador = 0;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null) {
				acumulador = acumulador + libros[i].getPaginas();
			}
		}

		return acumulador;
	}

}
