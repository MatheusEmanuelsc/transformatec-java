package exptions;

import java.util.Scanner;

public class Teste_1 {
	public static void main(String[] args) {
		try {
			Scanner entradaDeDados= new Scanner(System.in);
			
			System.out.println("Infome o primeiro numero: ");
			int numero1= entradaDeDados.nextInt();
			
			System.out.println("informe o segundo numero: ");
			int numero2= entradaDeDados.nextInt();
			entradaDeDados.close();
			
			System.out.println("A soma dos numeros e: "+ (numero1+numero2));
		} catch (Exception e) {
			System.out.println("Ação invalida: ");
		}
		
	}
}
