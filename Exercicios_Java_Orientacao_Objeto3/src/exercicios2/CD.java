package exercicios2;

import java.util.Vector;

public class CD extends Produto{

	private int numeroFaixas;

	public CD(String nome, double preco, int numeroFaixas, String codigoBarras) {
		super(nome, preco, codigoBarras, "CD");
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
