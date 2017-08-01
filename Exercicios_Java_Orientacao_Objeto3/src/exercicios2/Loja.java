package exercicios2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loja {
	
	public static void main(String[] args) {
		
		//Vector<Produto> produtos = new Vector<Produto>();
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new CD("Nirvana - Bleach", 25.99d, 16, "01212689"));
		produtos.add(new CD("Raimundos - Lavô Tá Novo", 15.99d, 12, "01288989"));
		produtos.add(new CD("Raimundos - Lavô Tá Novo", 15.99d, 12, "01288989"));
		produtos.add(new CD("Raimundos - Lavô Tá Novo", 15.99d, 12, "555877888"));
		
		produtos.add(new DVD("Guia do Mochileiro das Galáxias", 59.9d, 180, "1478787"));
		produtos.add(new DVD("Contatos de 4º Grau", 65.9d, 130, "8998914"));
		
		produtos.add(new Livro("Como trabalhar para um idiota", "John Hoover", 36.85d, "14548777"));
		produtos.add(new Livro("Guia do Mochileiro das Galáxias - Volume 1", "Douglas Adams", 24.75d, "59595984"));
		produtos.add(new Livro("CADE", "Douglas Adams", 24.75d, "59595984"));
		
		DVD dvd1 = new DVD("Guia do Mochileiro das Galáxias", 59.9d, 180, "1478787");
		
		CD cd1 = new CD("Foo Fighters", 30.99, 15, "010106646");
		

		// pesquisando um produto utilizando um objeto como parâmetro
		//buscaProduto(produtos, dvd1);
		
//		System.err.println(produtos.get(1).equals(produtos.get(3)));
//		System.err.println(produtos.get(1).equals(produtos.get(2)));
		
		ComparacaoImpl  comparador = new ComparacaoImpl();
		
		//comparador.buscaProdutoNomeCodBarras(produtos, "Cota");
	
		for (Produto produto : produtos) {
			System.out.println(produto.toString());

		}
		
		Collections.sort(produtos);
		
		for (Produto produto : produtos) {
			System.err.println(produto.toString());

		}

	}
	
	
	public static void buscaProduto(List<Produto> vetorProdutos, Produto produtoPesquisado){
		
		int tamanhoVetor = vetorProdutos.size();
		int posicao = 0;
		boolean encontrado = false;
				
		for (Produto produtos : vetorProdutos) {
			posicao++; 
			if ( produtos.equals(produtoPesquisado) ){
				System.out.println("\nProduto encontrado. Posição: "+ (posicao-1));
				System.out.println("---------------------------------------");
				System.out.println(produtos.toString());
				encontrado = true;

			}else if ( (posicao == tamanhoVetor) && !encontrado) {
				
				System.out.println("Produto não encontrado");
			
			}
			
			
		}
	}

}
