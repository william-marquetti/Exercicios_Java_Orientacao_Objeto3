package exercicios2;

import java.util.Vector;

public class Loja {
	
	public static void main(String[] args) {
		
		Vector<Produto> produtos = new Vector<Produto>();
		
		produtos.add(new CD("Nirvana - Bleach", 25.99d, 16, "01212689"));
		produtos.add(new CD("Raimundos - Lav� T� Novo", 15.99d, 12, "01288989"));
		
		produtos.add(new DVD("Guia do Mochileiro das Gal�xias", 59.9d, 180, "1478787"));
		produtos.add(new DVD("Contatos de 4� Grau", 65.9d, 130, "8998914"));
		
		produtos.addElement(new Livro("Como trabalhar para um idiota", "John Hoover", 36.85d, "14548777"));
		produtos.addElement(new Livro("Guia do Mochileiro das Gal�xias - Volume 1", "Douglas Adams", 24.75d, "59595984"));
		
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
		
		
		

	}

}
