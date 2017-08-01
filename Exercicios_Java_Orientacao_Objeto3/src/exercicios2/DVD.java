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
		dados += "\nDuração: "+ getDuracao() +" minutos";
		return dados;
	}

	/**
	 * Método utilizado para servir de parâmetro para a Interface Comparable.
	 * A interface Comparable utilizará o retorno deste método para faze a comparação entre 
	 * os objetos durante uma ordenação.
	 * 
	 */
	@Override
	public int compareTo(Produto o) {
		return this.getNome().compareTo(o.getNome());
	}
	
}
