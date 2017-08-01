package exercicios3;

public class Retangulo extends Formas {
	
	private double base;
	private double altura;
	
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
}
