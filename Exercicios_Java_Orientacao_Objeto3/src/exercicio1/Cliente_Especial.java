package exercicio1;

public class Cliente_Especial extends Conta_Corrente{

	public Cliente_Especial(String numero, String agencia, String cliente, String banco, double saldo) {
		super(numero, agencia, cliente, banco, saldo);
	}
	
	@Override
	public void sacar(double valor) {
		super.setSaldo(getSaldo() - (valor + (valor * 0.001)));
	}
	
}
