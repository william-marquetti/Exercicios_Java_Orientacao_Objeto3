package exercicios2;

public class CD extends Produto{

	private int numeroFaixas;

	public CD(String nome, double preco, int numeroFaixas, String codigoBarras) {
		super(nome, preco, codigoBarras);
		setNumeroFaixas(numeroFaixas);
	}
	
	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}
	
	@Override
	public String toString() {
		String dados =  super.toString();
		dados += "\nNúmero de Faixas: "+ getNumeroFaixas();
		return dados;
	}
	

}
