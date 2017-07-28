package exercicios2;

import java.text.DecimalFormat;

public abstract class Produto {
	
	DecimalFormat df = new DecimalFormat("#0.00");	
	
	private String nome;
	private double preco;
	private String codigoBarras;
	
	Produto(String nome, double preco, String codigoBarras){
		setNome(nome);
		setPreco(preco);
		setCodigoBarras(codigoBarras);
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
		dados = "\nNome: "+ getNome();
		dados += "\nPreço: R$"+ df.format(getPreco());
		return dados;
	}
	
	
}
