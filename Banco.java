package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Banco {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("########################");
		System.out.println("BEM VINDO AO NOSSO BANCO");
		System.out.println("########################");
		
		System.out.print("Digite Número de Conta: ");
		int numConta = in.nextInt();
		
		
		System.out.print("Nome do Titular da Conta: ");
		String nome = in.next();
		
		System.out.print("Já foi inserido algum valor inicial (y/n) ? ");
		char op = in.next().charAt(0);
		
		double saldo;
		if(op == 'y') {
			System.out.print("Insira valor do depósito inicial: ");
			 saldo = in.nextDouble();
		}
		else {
			 saldo = 0.00;
		}
		
		ContaBancaria conta = new ContaBancaria(numConta,nome,saldo);
		conta.setNumConta(numConta);
		
		System.out.println("Dados da conta: ");
		System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f",conta.getNumConta(),conta.nome,conta.getSaldo());
		
		System.out.println();
		System.out.println("Entre com um depósito: ");
		double valorDepositado = in.nextDouble();
		conta.deposito(valorDepositado);
		
		System.out.println("Dados Atualizados: ");
		System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f",conta.getNumConta(),conta.nome,conta.getSaldo());
		
		
		System.out.println();
		System.out.println("Entre com um Saque: ");
		double valorRetirado = in.nextDouble();
		conta.saque(valorRetirado);
		
		System.out.println("Dados Atualizados: ");
		System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f",conta.getNumConta(),conta.nome,conta.getSaldo());
		
		in.close();
	}

}
