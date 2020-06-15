package Contas;

import Data.Data;

public class Contas {
	private String titular;
	private double saldo;
	private int conta;
	private String agencia;
	private Data data;
	private String cidade;
	private static int NumeroContas;

	
	public Contas() {
		System.out.println("Início");
		this.titular = null;
		this.saldo = 0.0;
		this.conta = 0;
		this.agencia = null;
		this.data = new Data();
		this.cidade = null;
		Contas.NumeroContas += 1;
	}
	
	public Contas(String titular, double saldo, int conta, String agencia, int dia, int mes, int ano, String cidade) {
		System.out.println("Início");
		this.titular = titular;
		this.saldo = saldo;
		this.conta = conta;
		this.agencia = agencia;
		this.data = new Data(dia, mes, ano);
		this.cidade = cidade;
		Contas.NumeroContas += 1;
	}
	
	
	public String imprimir() {
		String dado = "Titular: " + this.titular;
		dado += "\nSaldo: " + this.saldo;
		dado += "\nConta: " + this.conta;
		dado += "\nAgência: " + this.agencia;
		dado += "\nData de abertura: " + this.data.DataFormatada();
		dado += "\nCidade: " + this.cidade;
		dado += "\nContas criadas: " + Contas.NumeroContas;
		return dado;	
	}
	
	public void sacar(double valor) {
		if(valor>this.saldo) {
			System.out.println("Não efetuado: ");
		}else{
			this.saldo -= valor;
			System.out.println("Efetuado: ");
		}
	}
	public void depositar(double valor) {
		if(valor>=5000) {
			System.out.println("Não efetuado: ");
		}else {
			this.saldo += valor;
			System.out.println("Efetuado: ");
		}
	}
	
	public void transferencia(Contas continha, double valor) {
		if((valor>this.saldo) || (valor>5000)) {
			System.out.println("Não efetuado.");
		}else {
			this.saldo -= valor;
			continha.saldo += valor;
			System.out.println("Efetuado.");
		}
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void getSaldo() {
		System.out.println("Saldo de R$" + this.saldo);
	}

}
