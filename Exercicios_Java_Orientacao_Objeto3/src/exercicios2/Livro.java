package exercicios2;

import java.text.DecimalFormat;

public class Livro extends Produto {

	DecimalFormat df = new DecimalFormat("#0.00");	
		
	private String autor;

	public Livro(String nome, String autor, double preco, String codigoBarras) {
		super(nome, preco, codigoBarras, "Livro");
		setAutor(autor);	
	}
	

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		String dados = super.toString();
		dados += "\nAutor: " + getAutor();
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
