package exercicios2;

public class DVD extends Produto{
	
	private int duracao;
	
	DVD(String nome, double preco, int duracao, String codigoBarras){
		super(nome, preco, codigoBarras, "DVD");
		setDuracao(duracao);
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		String dados = super.toString();
		dados += "\nDura��o: "+ getDuracao() +" minutos";
		return dados;
	}

	/**
	 * M�todo utilizado para servir de par�metro para a Interface Comparable.
	 * A interface Comparable utilizar� o retorno deste m�todo para faze a compara��o entre 
	 * os objetos durante uma ordena��o.
	 * 
	 */
	@Override
	public int compareTo(Produto o) {
		return this.getNome().compareTo(o.getNome());
	}
	
}
