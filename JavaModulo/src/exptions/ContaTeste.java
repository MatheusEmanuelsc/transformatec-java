package exptions;

import java.util.Scanner;

public class ContaTeste {

	static Scanner entradaDedados = new Scanner(System.in);

	public static Conta criacaoConta(Integer numero, Double saldo, String nome) throws IllegalArgumentException {
		if (numero == null || saldo == null || nome == null) {
			throw new IllegalArgumentException("Valores invalidos");
			
		} else {
			Conta conta = new Conta(numero, saldo, nome);
			System.out.println("Conta criada!");
			System.out.println(conta.getNome());
			System.out.println(conta.getNumero());
			System.out.println(conta.getNumero());
			return conta;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Informe o nome do correntista: ");
		String nome=entradaDedados.nextLine();
		
		System.out.println("informe o numero da conta");
		Integer numero=entradaDedados.nextInt();
		
		System.out.println("informe o valor do deposito:");
		Double valor = entradaDedados.nextDouble();
		
		
	}
}
