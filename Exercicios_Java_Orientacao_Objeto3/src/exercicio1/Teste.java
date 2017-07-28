package exercicio1;

public class Teste {

	public static void main(String[] args) {
		
		Cliente_Especial cc2 = new Cliente_Especial("1515", "1221", "Andiara", "Banco do Brasil", 1500d);
		Conta_Corrente cc1 = new Conta_Corrente("0021212", "1313", "William", "Caixa", 1500d);
		
		cc1.extrato();
		cc2.extrato();
		
		cc1.sacar(100);
		cc2.sacar(100);
		
		cc1.extrato();
		cc2.extrato();
		
	}
}
