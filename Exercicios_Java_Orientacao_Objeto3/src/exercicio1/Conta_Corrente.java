package exercicio1;

import java.text.DecimalFormat;

public class Conta_Corrente {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String numero;
	private String agencia;
	private String cliente;
	private String banco;
	private double saldo;
	
	public Conta_Corrente(String numero, String agencia, String cliente, String banco, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.banco = banco;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void sacar(double valor){
		this.saldo = saldo - (valor + (valor * 0.005));
	}
	
	public void depositar(double valor){
		this.saldo = saldo +valor;
	}
	
	public void extrato(){
		String extrato;
		extrato = "\nCliente: "+ this.getCliente();
		extrato += "\nBanco: "+ this.getBanco();
		extrato += "\nConta: "+ this.getNumero() + " Agência: "+ this.getAgencia();
		extrato += "\nSaldo: R$"+ df.format(this.getSaldo());
		System.out.println(extrato);
	}
	
}
