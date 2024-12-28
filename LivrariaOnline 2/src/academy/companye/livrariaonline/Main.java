package academy.companye.livrariaonline;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Scanner input = new Scanner(System.in);
		
		int opcao = -1;
		
		exemploLivro();
		
		System.out.println("Bem vindo a Livraria Online!");
		
		while(opcao != 0) {
			System.out.println("Digite:" +
								"\n1- Mostrar livros disponíveis" +
								"\n2- Adicionar ao carrinho" +
								"\n3- Remover do carrinho" +
								"\n4- Mostrar carrinho" +
								"\n5- Finalizar a compra" +
								"\n9- Gerenciar Livraria" +
								"\n0- Sair");
			try {
				opcao = input.nextInt();
				
				switch(opcao) {
				case 1:
					Biblioteca.listarLivros();
					break;			
				case 2:
					CarrinhoDeCompras.adicionarCarrinho();
					break;			
				case 3:
					CarrinhoDeCompras.removerCarrinho();
					break;
				case 4:
					CarrinhoDeCompras.listarCarrinho();
					break;
				case 5:
					CarrinhoDeCompras.finalizarCompra();
					break;
				case 9:
					Gerente gerente = new Gerente();
					gerente.menu();
					break;
				case 0:
					System.out.println("Saindo da livraria.");
					break;
				default:
					System.out.println("Opção inválida.");
				}				
			} catch(Exception e) {
				System.out.println("Opção inválida!");
				input.nextLine();
			}
		}
	}
	
	public static void exemploLivro() {
		Biblioteca.adicionarLivro(new LivroFisico("Governança de TI - tecnologia da informação",  "Peter Weill e Jeanne W. Ross", 85, 400, 10));
		Biblioteca.adicionarLivro(new LivroFisico("Inteligência Artificial - Do Zero ao Metaverso", "Martha Gabriel", 50.87, 350, 8));
		Biblioteca.adicionarLivro(new LivroFisico("Marketing 5.0: Tecnologia para a humanidade", "Philip Kotler, Hermawan Kartajaya e Iwan Setiawan", 44.90, 350, 8));
		Biblioteca.adicionarLivro(new Ebook("Informática: Conceitos e aplicações", "Marcelo Marçula e Pio Armando Benini Filho", 42.90, 90));
		Biblioteca.adicionarLivro(new Ebook("TI – tecnologia da informação: empresa pronta para o futuro", "Stephanie L. Woerner, Peter Weill e Sebastian Ina M", 62.10, 100));
	}
}
