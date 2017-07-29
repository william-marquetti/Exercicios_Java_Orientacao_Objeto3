package exercicios2;

import java.util.Vector;

public interface IComparacao {
	
	/**
	 *  Método criado para realizar pesquisa de produtos pelo nome.
	 *  
	 *  Foi utilizado como "static" porque a classe loja não é uma classe de objeto,
	 *  portanto ela não pode ser instanciada.
	 *  Ao definir o método como "static", o método passa a existir sem ter a necessidade
	 *  de instaciar um objeto da classe. 
	 *  Esta é a única maneira de acessar um método de uma classe que não pode ser 
	 *  instaciada.
	 *  
	 * @param vetorProdutos é a lista de produtos (ArrayList)
	 * @param produtoPesquisado é o termo (item, nome, etc) pesquisado (String)
	 * 
	 * O método buscaProduto, realizará buscas na lista (ArrayList) de produtos,
	 * retornando as informações do produto, se encontrado.
	 * A pesaquisa é feita através do método "equals()", onde o termo pesquisado
	 * só retornará os dados nos casos em que o nome seja EXATAMENTE igual ao termo da 
	 * pesquisa.
	 */
	public static void buscaProdutoNomeCodBarras(Vector<Produto> vetorProdutos, String produtoPesquisado){
		
		int tamanhoVetor = vetorProdutos.size();
		int posicao = 0;
		boolean encontrado = false;
				
		for (Produto produtos : vetorProdutos) {
			posicao++; 
			if ( (produtos.getNome().equals(produtoPesquisado) || produtos.getCodigoBarras().equals(produtoPesquisado))){
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
