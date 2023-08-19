package Entities;

import java.util.Scanner;

public class ContaBancaria {
	private String donoConta;
	private int numeroConta ;
	private static final int taxa = 5;
	private double saldo;
	
	
	public ContaBancaria(String donoConta, int numeroConta) {
		this.donoConta = donoConta;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}


	public String getDonoConta() {
		return donoConta;
	}


	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double depositar) {
		this.saldo += depositar;
	}
	
	public void sacar(double sacar) {
		this.saldo -= (sacar + taxa);
	}
	
	public void startApp(Scanner sc) {
		System.out.print("Informe o nome do titular da conta: ");
		String nome = sc.next();
		setDonoConta(nome);
		System.out.print("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		setNumeroConta(numeroConta);
		
		selecaoDepositoInicial(sc);
		depositoMetodo(sc);
		retiradaMetodo(sc);
		
	}
	
	public void selecaoDepositoInicial(Scanner sc) {
		System.out.println("Gostaria de efetuar o depósito inicial? (s / n)");
		char resposta = sc.next().charAt(0);
		switch (resposta) {
		case 's','S':
			System.out.print("Informe o valor que deseja depositar: ");
			double deposito = sc.nextDouble();
			depositar(deposito);
			informacaoConta();
			break;
		case 'n','N':
			System.out.println("Aqui está os dados da sua conta!");
			informacaoConta();
			break;
		default:
			System.out.println("Informe uma opção válida!!\n");
			selecaoDepositoInicial(sc);
			break;
		}
		
	
	}	
	
		public void depositoMetodo(Scanner sc) {
			System.out.print("Insira um valor para depósito: ");
			double deposito = sc.nextDouble();
			depositar(deposito);	
			informacaoConta();
		}
		public void retiradaMetodo(Scanner sc) {
			System.out.print("Insira um valor para retirada: ");
			double retirada = sc.nextDouble();
			sacar(retirada);
			informacaoConta();
		}
		
		
		public void informacaoConta() {
			System.out.println("\n========= Informações da conta atualizados ==========");
			System.out.println(toString());
			System.out.println();
		}
		
		
		
		public String toString(){
			return "Conta: " + getNumeroConta()  + "\nNome do titular: " + getDonoConta() 
			+ "\nSaldo: R$ " + String.format("%.2f",getSaldo());
		}
		
	{

}

}
