package exercicios3;

import java.text.DecimalFormat;

public class Circulo extends Formas {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private double raio;
	
	public Circulo(){
		
	}
	
	public Circulo(double raio) {
		setRaio(raio);
		calculaArea();
		calculaPerimetro();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public void calculaPerimetro() {
		setPerimetro( ( ( 2 * 3.14 ) * raio ) );
		
	}

	@Override
	public void calculaArea() {
		setArea( ( 3.14 * ( raio * raio ) ) );
		
	}

	@Override
	public String toString() {
		String dados;
		dados = "\n-------------------------";
		dados += "\nCírculo:";
		dados += "\n-------------------------";
		dados += "\nRaio: "+ df.format(this.getRaio())+ " cm";
		dados += "\nÁrea: "+ df.format(this.getArea())+ " cm";
		dados += "\nPerímetro: "+ df.format(this.getPerimetro())+ " cm";
		return dados;
	}
	
}
