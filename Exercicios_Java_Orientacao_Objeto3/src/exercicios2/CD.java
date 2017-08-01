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
		dados += "\nN�mero de Faixas: "+ getNumeroFaixas();
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
