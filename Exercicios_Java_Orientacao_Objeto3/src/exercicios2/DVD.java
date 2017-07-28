package exercicios2;

public class DVD extends Produto{
	
	private int duracao;
	
	DVD(String nome, double preco, int duracao, String codigoBarras){
		super(nome, preco, codigoBarras);
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
	
	
}
