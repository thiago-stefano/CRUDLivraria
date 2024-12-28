package academy.companye.livrariaonline;

public class Livro {
	private String titulo;
	private String autor;
	private String isbn;
	private double preco;
	
	public Livro(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = (titulo.substring(0, 3) + 
				autor.substring(0, 2)).toUpperCase();
		this.preco = preco;
	}
	
	public double calcularPrecoTotal() {
		return this.preco;		
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
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
