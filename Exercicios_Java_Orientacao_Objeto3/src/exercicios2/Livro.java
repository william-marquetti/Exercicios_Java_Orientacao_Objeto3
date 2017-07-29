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
	
}
