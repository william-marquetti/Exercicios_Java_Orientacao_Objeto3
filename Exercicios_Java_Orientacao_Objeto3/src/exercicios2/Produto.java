package exercicios2;

import java.text.DecimalFormat;

/**
 * 
 * Declara��o da classe "public abstract class Produto implements Comparable<Produto>".
 * A implementa��o da interface Comparable, passando Produto como Par�metro � utilizada
 * para comparar objetos. A implementa��o desta interface foi necess�ria para que fosse
 * poss�vel utilizar o m�todo Collections.sort(lista), onde o m�todo necessita de um par�metro 
 * para efetuar a compara��o. Ao implementar a interface Comparable, foram definidos um m�todo para
 * cada classe que extende ao produto. 
 * 
 * @author William Gustavo Marquetti
 *
 */
public abstract class Produto implements Comparable<Produto>{
	
	DecimalFormat df = new DecimalFormat("#0.00");	
	
	private String nome;
	private double preco;
	private String codigoBarras;
	private final String tipo;
	


	Produto(String nome, double preco, String codigoBarras, String tipo){
		setNome(nome);
		setPreco(preco);
		setCodigoBarras(codigoBarras);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	@Override
	public String toString() {
		String dados;
		dados = "\nC�digo de Barras: "+ getCodigoBarras();
		dados += "\nTipo: "+ getTipo();
		dados += "\nNome: "+ getNome();
		dados += "\nPre�o: R$"+ df.format(getPreco());
		return dados;
	}
	
	/**
	 * 
	 * Object obj � a representa��o gen�rica de um objeto.
	 * Para acessar a var�avel obj como um objeto do tipo produto,
	 * foi necess�rio realizar o CAST informando o tipo do objeto conforme exemplo:
	 * 
	 * Produto outro = (Produto) obj;
	 * 
	 * O CAST � feito ao declarar entre par�nteses o tipo do objeto/vari�vel antes da vari�vel selecionada
	 * Neste caso, o objeto "obj" foi convertido para um objeto do tipo "Produto".
	 * 
	 */
	
	@Override
	public boolean equals(Object obj) {
		Produto outro = (Produto) obj;
		return this.codigoBarras.equals(outro.getCodigoBarras());
	}
	
	
}
