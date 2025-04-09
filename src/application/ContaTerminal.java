package application;

import java.util.Scanner;

	/**
	 * @author lirajonas
	 * @since 2025, april
	 */

	//Projeto criado para completar o desafio de sintaxe do curso da DIO (Java Básico)
	
public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite a agência: ");
		sc.nextLine();
		String agency = sc.nextLine();
		System.out.print("Digite o seu nome: ");
		String holder = sc.nextLine();
		System.out.print("Digite o saldo da conta: ");
		double balance = sc.nextDouble();
		
		Account acc = new Account(number, agency, holder, balance);
		
		System.out.println(acc);
		
		
		sc.close();

	}

}
