package exercicios3;

import java.text.DecimalFormat;

public class Quadrado extends Formas{
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private double lado;

	public Quadrado(){
		
	}
	
	public Quadrado(double lado) {
		setLado(lado);
		calculaArea();
		calculaPerimetro();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calculaPerimetro() {

		setPerimetro( (lado * 4) );

	}

	@Override
	public void calculaArea() {

		setArea( ( lado * lado) );
	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\n-------------------------";
		dados += "\nQuadrado:";
		dados += "\n-------------------------";
		dados += "\nLados: "+ df.format(this.getLado())+ " cm";
		dados += "\nÁrea: "+ df.format(this.getArea())+ " cm";
		dados += "\nPerímetro: "+ df.format(this.getPerimetro())+ " cm";
		return dados;
	}
}
