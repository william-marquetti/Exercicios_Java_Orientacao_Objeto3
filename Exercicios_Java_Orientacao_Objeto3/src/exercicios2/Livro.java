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
