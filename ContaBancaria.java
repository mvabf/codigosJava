package entities;

public class ContaBancaria {
	private int numConta;
	public String nome;
	private double saldo;

	public ContaBancaria(){
		
	}
	
	public ContaBancaria(int numConta, String nome,double saldo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void deposito(double valorDepositado) {
		
		saldo =  saldo + valorDepositado;	
		
	}
	
	public void saque(double valorRetirado) {
		saldo = (saldo - 5.00) - valorRetirado;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
					
}
