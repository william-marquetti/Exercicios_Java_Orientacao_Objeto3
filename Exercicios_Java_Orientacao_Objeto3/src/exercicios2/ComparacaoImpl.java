package exercicios2;

import java.util.List;

public class ComparacaoImpl implements IComparacao{

	@Override
	public void buscaProdutoNomeCodBarras(List<Produto> vetorProdutos, String produtoPesquisado) {
		int tamanhoVetor = vetorProdutos.size();
		int posicao = 0;
		boolean encontrado = false;
		
		System.out.println("\n---------------------------------------");
		System.out.println("Comparador de Produtos");
		System.out.println("---------------------------------------");
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
