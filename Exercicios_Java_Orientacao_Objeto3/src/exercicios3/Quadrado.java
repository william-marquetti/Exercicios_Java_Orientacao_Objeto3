package exercicios3;

public class Quadrado extends Formas{

	private double lado;

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
}
