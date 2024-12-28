package academy.companye.livrariaonline;

public class LivroFisico extends Livro {
	private double peso;
	private double frete;
	
	public LivroFisico(String titulo, String autor, double preco, double peso, double frete) {
		super(titulo, autor, preco);
		this.setPeso(peso);
		this.frete = frete;		
	}
	
	public double calcularFrete() {
		return this.frete;		
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getFrete() {
		return frete;
	}
	
	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	@Override
	public String toString() {
		return "\n"
				+ "Livro Físico:\n"
				+ "Título: " +  getTitulo() + ". \n"
				+ "Autor: " +  getAutor() + ". \n"
				+ "Código: " +  getIsbn() + ". \n"
				+ "Peso: " +  getPeso() + "g. \n"
				+ "Frete: R$" +  getFrete() + ". \n"
				+ "Preço: R$" + getPreco() + ".\n";
	}
}
