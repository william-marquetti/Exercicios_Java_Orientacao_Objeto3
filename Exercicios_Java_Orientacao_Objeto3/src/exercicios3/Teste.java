package exercicios3;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int qtFormas;
		int opcao;
		ArrayList<Formas> formas = new ArrayList<Formas>();
		
		System.out.println("Quantas formas deseja criar?");
		qtFormas = scanner.nextInt();
		
		for ( int aux = 0; aux < qtFormas; aux++ ){
			
			System.out.println("Informe o código da forma desejada: \n1 - Circulo \n2 - Quadrado \n 3 - Retângulo");
			opcao = scanner.nextInt();
			
			switch (opcao){
				
				case 1 :
					Circulo circulo = new Circulo();
					System.out.println("Informe a medida do raio: ");
					circulo.setRaio(scanner.nextDouble());
					circulo.calculaArea();
					circulo.calculaPerimetro();
					formas.add(circulo);
					break;
					
				case 2 :
					Quadrado quadrado = new Quadrado();
					System.out.println("Informe a medida do lado: ");
					quadrado.setLado(scanner.nextDouble());
					quadrado.calculaArea();
					quadrado.calculaPerimetro();
					formas.add(quadrado);
					break;
					
				case 3 :
					Retangulo retangulo = new Retangulo();
					System.out.println("Informe a medida da base: ");
					retangulo.setBase(scanner.nextShort());
					System.out.println("Informe a medida da altura: ");
					retangulo.setAltura(scanner.nextDouble());
					retangulo.calculaArea();
					retangulo.calculaPerimetro();
					formas.add(retangulo);
					break;
					
			}
				
			
		}
		
		scanner.close();
		
		for (Formas formas2 : formas) {
			System.out.println(formas2.toString());
		}
		
	}
}
