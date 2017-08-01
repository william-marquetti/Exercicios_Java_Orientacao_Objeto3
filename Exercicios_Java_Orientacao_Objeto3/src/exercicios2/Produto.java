package exercicios2;

import java.text.DecimalFormat;

/**
 * 
 * Declaração da classe "public abstract class Produto implements Comparable<Produto>".
 * A implementação da interface Comparable, passando Produto como Parâmetro é utilizada
 * para comparar objetos. A implementação desta interface foi necessária para que fosse
 * possível utilizar o método Collections.sort(lista), onde o método necessita de um parâmetro 
 * para efetuar a comparação. Ao implementar a interface Comparable, foram definidos um método para
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
		dados = "\nCódigo de Barras: "+ getCodigoBarras();
		dados += "\nTipo: "+ getTipo();
		dados += "\nNome: "+ getNome();
		dados += "\nPreço: R$"+ df.format(getPreco());
		return dados;
	}
	
	/**
	 * 
	 * Object obj é a representação genérica de um objeto.
	 * Para acessar a varíavel obj como um objeto do tipo produto,
	 * foi necessário realizar o CAST informando o tipo do objeto conforme exemplo:
	 * 
	 * Produto outro = (Produto) obj;
	 * 
	 * O CAST é feito ao declarar entre parênteses o tipo do objeto/variável antes da variável selecionada
	 * Neste caso, o objeto "obj" foi convertido para um objeto do tipo "Produto".
	 * 
	 */
	
	@Override
	public boolean equals(Object obj) {
		Produto outro = (Produto) obj;
		return this.codigoBarras.equals(outro.getCodigoBarras());
	}
	
	
}
