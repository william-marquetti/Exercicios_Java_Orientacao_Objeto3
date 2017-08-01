package exercicios2;

import java.util.List;

public interface IComparacao {

	/**
	 *  M�todo criado para realizar pesquisa de produtos pelo nome.
	 *  
	 *  Foi utilizado como "static" porque a classe loja n�o � uma classe de objeto,
	 *  portanto ela n�o pode ser instanciada.
	 *  Ao definir o m�todo como "static", o m�todo passa a existir sem ter a necessidade
	 *  de instaciar um objeto da classe. 
	 *  Esta � a �nica maneira de acessar um m�todo de uma classe que n�o pode ser 
	 *  instaciada.
	 *  
	 * @param vetorProdutos � a lista de produtos (ArrayList)
	 * @param produtoPesquisado � o termo (item, nome, etc) pesquisado (String)
	 * 
	 * O m�todo buscaProduto, realizar� buscas na lista (ArrayList) de produtos,
	 * retornando as informa��es do produto, se encontrado.
	 * A pesaquisa � feita atrav�s do m�todo "equals()", onde o termo pesquisado
	 * s� retornar� os dados nos casos em que o nome seja EXATAMENTE igual ao termo da 
	 * pesquisa.
	 */
	public abstract  void buscaProdutoNomeCodBarras(List<Produto> vetorProdutos, String produtoPesquisado);
}
