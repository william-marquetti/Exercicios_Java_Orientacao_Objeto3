package exercicios3;

import java.text.DecimalFormat;

public class Retangulo extends Formas {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private double base;
	private double altura;
	
	public Retangulo(){
		
	}
	
	public Retangulo(double altura, double base) {
		setBase(base);
		setAltura(altura);
		calculaArea();
		calculaPerimetro();
	}
		
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void calculaPerimetro() {
		
		setPerimetro( (( base * 2 ) + ( altura * 2 )) );
		
	}
	
	@Override
	public void calculaArea() {
		
		setArea( (base * altura) );
	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\n-------------------------";
		dados += "\nRetângulo:";
		dados += "\n-------------------------";
		dados += "\nAltura: "+ df.format(this.getAltura());
		dados += "\nBase: "+ df.format(this.getBase());
		dados += "\nÁrea: "+ df.format(this.getArea())+ " cm";
		dados += "\nPerímetro: "+ df.format(this.getPerimetro())+ " cm";
		return dados;
	}
}
