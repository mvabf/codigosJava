package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Banco {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		ContaBancaria conta;
		System.out.println("########################");
		System.out.println("BEM VINDO AO NOSSO BANCO");
		System.out.println("########################");
		
		System.out.print("Digite Número de Conta: ");
		int numConta = in.nextInt();
		in.nextLine();
		System.out.print("Nome do Titular da Conta: ");
		String nome = in.nextLine();
		
		System.out.print("Já foi inserido algum valor inicial (y/n) ? ");
		char op = in.next().charAt(0);
		
		if(op == 'y') {
			System.out.print("Insira valor do depósito inicial: ");
			double depositoInicial = in.nextDouble();
			conta = new ContaBancaria(numConta, nome, depositoInicial);
		}
		else {
			 conta = new ContaBancaria(numConta, nome);
		}
		
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com um depósito: ");
		double valorDepositado = in.nextDouble();
		conta.deposito(valorDepositado);
		
		System.out.println("Dados Atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com um Saque: ");
		double valorRetirado = in.nextDouble();
		conta.saque(valorRetirado);
		
		System.out.println("Dados Atualizados: ");
		System.out.println(conta);
		
		in.close();
	}

}
