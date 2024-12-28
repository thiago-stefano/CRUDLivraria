package academy.companye.livrariaonline;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private static List<Livro> listaLivros = new ArrayList<>();
	private static ArrayList<String> vendas = new ArrayList<>();
	
	public static void adicionarLivro(Livro livro) {
		listaLivros.add(livro);
	}
	
	public static void listarLivros() {
		if (listaLivros.size() < 1) {
			System.out.println("Não existem livros registrados.");
		}
		for (int i = 0; i < listaLivros.size(); i++) {
			System.out.println((i + 1) + "- " + listaLivros.get(i));
		}
	}
	
	public static void removerLivros(int posicao) throws ArrayIndexOutOfBoundsException{
		listaLivros.remove(posicao - 1);
	}
	
	public static void removerLivros(Livro livro) throws ArrayIndexOutOfBoundsException{
		listaLivros.remove(livro);
	}
	
	public static Livro buscarLivros(int posicao) {
		return listaLivros.get(posicao - 1);
	}
	
	public static void addHistorico() {
		vendas.add("Venda " + (vendas.size() + 1) + " no total de: R$" + CarrinhoDeCompras.calcularTotal());
	}
	
	public static void listarHistorico() {
		if (vendas.size() < 1) {
			System.out.println("Você não possui vendas.");
		}
		for (int i = 0; i < vendas.size(); i++) {
			System.out.println(vendas.get(i));
		}
	}
}