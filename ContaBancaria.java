package entities;

public class ContaBancaria {
	private int numConta;
	private String nome;
	private double saldo;

	
	public ContaBancaria(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public ContaBancaria(int numConta, String nome,double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(depositoInicial);
	}	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void deposito(double valorDepositado) {
		
		saldo += valorDepositado;	
		
	}
	
	public void saque(double valorRetirado) {
		saldo -= valorRetirado + 5.0;
		
	}

	public double getSaldo() {
		return saldo;
	}			
	
	public String toString() {
		return "Conta: "
				+ numConta
				+", Titular: "
				+ nome
				+ ", Saldo: $"
				+ String.format("%.2f", saldo);
	}
}
