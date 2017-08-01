package exercicios3;

public class Circulo extends Formas {
	
	private double raio;
	
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

	
	
}
