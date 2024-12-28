package academy.companye.livrariaonline;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoDeCompras {
	    private static ArrayList<Livro> carrinho = new ArrayList<>();

	    public static void adicionarCarrinho() {
	    	Scanner input = new Scanner(System.in);
	    	Biblioteca.listarLivros();
	    	try {
				System.out.println("Qual livro deseja adicionar ao carrinho?");
				int posicao = input.nextInt();
				if(carrinho.contains(Biblioteca.buscarLivros(posicao))) {
					System.out.println("Este livro já está no carrinho.");
				} else {
					carrinho.add(Biblioteca.buscarLivros(posicao));
					System.out.println("Adicionado ao carrinho.");
				}
			} catch (Exception e) {
				System.out.println("Opção inválida.");
			}
	    }

	    public static double calcularTotal() {
	        double total = 0.0;

	        for (Livro livro : carrinho) {
	            total += livro.calcularPrecoTotal();
	            if (livro instanceof LivroFisico) {
	                total += ((LivroFisico) livro).calcularFrete();
	            }
	        }

	        return total;
	    }

	    public static void removerCarrinho() {
	    	Scanner input = new Scanner(System.in);
			listarCarrinho();
			try {
				if (carrinho.size() > 0) {
					System.out.println("Qual livro deseja remover?");
					int posicao = input.nextInt();
					carrinho.remove(posicao - 1);
					System.out.println("Removido com sucesso.");
				}
			} catch (Exception e) {
				System.out.println("Opção inválida.");
			}
		}
	    
	    public static void listarCarrinho() {
	        if (carrinho.size() > 0) {
	            double totalLivros = 0.0;
	            double totalFrete = 0.0;

	            System.out.println("Seu Carrinho:");
	            for (int i = 0; i < carrinho.size(); i++) {
	                Livro livro = carrinho.get(i);
	                System.out.println((i + 1) + "- " + livro);

	                if (livro instanceof LivroFisico) {
	                    totalFrete += ((LivroFisico) livro).calcularFrete();
	                }

	                totalLivros += livro.calcularPrecoTotal();
	            }
	            System.out.println("Valor total dos livros: R$" + totalLivros);
	            System.out.println("Valor total do frete: R$" + totalFrete);
	            System.out.println("Valor total final: R$" + (totalLivros + totalFrete));
	        } else {
	            System.out.println("O seu carrinho está vazio.");
	        }
	    }
	    
	    public static void finalizarCompra() {
	    	Scanner input = new Scanner(System.in);
	    	if (carrinho.size() > 0) {
	    		System.out.println("O valor total do pedido é: R$" + calcularTotal());
	    		System.out.println("Tem certeza que deseja finalizar o pedido?" +
	    				"\n1- Sim" +
	    				"\n2- Não");	    	
	    		int op = -1;	    	
	    		try {
	    			op = input.nextInt();
	    			if(op == 1) {
	    				for (Livro livro : carrinho) {
	    					Biblioteca.removerLivros(livro);
	    				}
	    				Biblioteca.addHistorico();
	    				carrinho = new ArrayList<>();
	    				System.out.println("Obrigado por comprar conosco!");
	    			} else if(op == 2) {
	    				System.out.println("Voltando ao menu.");
	    			} else {
	    				System.out.println("Opção inválida!");
	    			}
	    		} catch (Exception e) {
	    			System.out.println("Opção inválida.");
	    		}
	    	} else {
	    		System.out.println("O seu carrinho está vazio.");
	    	}
	    }
}
