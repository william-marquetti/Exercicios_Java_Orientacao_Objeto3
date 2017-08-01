package exercicios2;

import java.util.List;

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
	public abstract  void buscaProdutoNomeCodBarras(List<Produto> vetorProdutos, String produtoPesquisado);
}
