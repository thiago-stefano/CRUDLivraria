package academy.companye.livrariaonline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gerente {

	private Scanner input = new Scanner(System.in);
	
	public void adicionarLivro() {
		int opcao = -1;
		
		try {
			System.out.println("Digite o nome do livro.");
			String nomeLivro = input.nextLine();
			System.out.println("Digite o nome do Autor.");
			String nomeAutor = input.nextLine();
			System.out.println("Digite o preço.");
			double precoLivro = input.nextDouble();
			System.out.println("Deseja adicionar um 'Livro fisico' ou 'Ebook'?" +
								"\n1- Livro físico," +
								"\n2- Ebook.");
			opcao = input.nextInt();
		
			if (opcao == 1) {
				System.out.println("Digite o peso.");
				double pesoLivro = input.nextDouble();
				System.out.println("Digite o valor do frete.");
				double freteLivro = input.nextDouble();
				
				Biblioteca.adicionarLivro(new LivroFisico(nomeLivro, nomeAutor, precoLivro, pesoLivro, freteLivro));
			} else if (opcao == 2) {
				System.out.println("Tamanho do arquivo em MB.");
				double tamanhoLivro = input.nextDouble();
				Biblioteca.adicionarLivro(new Ebook(nomeLivro, nomeAutor, precoLivro,tamanhoLivro));
			} else {
				throw new InputMismatchException();
			}
			input.nextLine();
		} catch (Exception e) {
			System.out.println("Opção inválida.");
			input.nextLine();
		}
	}
	
	public void removerLivro() {
		Biblioteca.listarLivros();
		try {
			System.out.println("Qual livro deseja remover?");
			int posicao = input.nextInt();
			Biblioteca.removerLivros(posicao);
			System.out.println("Removido com sucesso.");
			input.nextLine();
		} catch (Exception e) {
			System.out.println("Opção inválida.");
			input.nextLine();
		}
	}
	
	public void menu() {
		Scanner input = new Scanner(System.in);
		
		int opcao = -1;
		int senha = 1234;
		
		System.out.println("Digite a senha:" +
						"\n(A Senha é 1234)");
		senha = input.nextInt();
		
		if(senha == 1234) {
			while(opcao != 0) {
				System.out.println("Menu do Gerente");
				System.out.println("Digite:" +
						"\n1- Listar livros" +
						"\n2- Adicionar Livro" +
						"\n3- Remover livro" +
						"\n4- Histórico de vendas" +
						"\n0- Sair");
				try {
					opcao = input.nextInt();
					
					switch(opcao) {
					case 1:
						Biblioteca.listarLivros();
						break;			
					case 2:
						adicionarLivro();
						break;			
					case 3:
						removerLivro();
						break;
					case 4:
						Biblioteca.listarHistorico();
						break;
					case 0:
						System.out.println("Voltando ao menu.");
						break;
					default:
						System.out.println("Opção inválida!");	
					}
					input.nextLine();
				} catch(Exception e) {
					System.out.println("Opção inválida!");
					input.nextLine();
				}
			}			
		} else {
			System.out.println("Senha inválida!");
		}
	}
}
