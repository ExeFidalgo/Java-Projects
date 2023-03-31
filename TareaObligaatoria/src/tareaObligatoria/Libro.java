package tareaObligatoria;

public class Libro {
	private String titulo;
	private String autor;
	private int paginas;
	
	public Libro(String titulo, String autor, int paginas) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setPaginas(paginas);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
}
