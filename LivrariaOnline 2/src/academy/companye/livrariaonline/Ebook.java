package academy.companye.livrariaonline;

public class Ebook extends Livro {
	private double tamanhoEmMb;
	
	public Ebook(String titulo, String autor, double preco, double tamanhoEmMb) {
		super(titulo, autor, preco);
		this.setTamanhoEmMb(tamanhoEmMb);		
	}

	public double getTamanhoEmMb() {
		return tamanhoEmMb;
	}

	public void setTamanhoEmMb(double tamanhoEmMb) {
		this.tamanhoEmMb = tamanhoEmMb;
	}
	
	@Override
	public String toString() {
		return "\n"
				+ "Ebook:\n"
				+ "Título: " +  getTitulo() + ". \n"
				+ "Autor: " +  getAutor() + ". \n"
				+ "Código: " +  getIsbn() + ". \n"
				+ "Tamanho do arquivo: " +  getTamanhoEmMb() + "Mb. \n"
				+ "Preço: R$" + getPreco() + ".\n";
	}
}
