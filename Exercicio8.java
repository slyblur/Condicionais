package Condicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		int operacao;
		float saldo = 1000, saque, deposito;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha uma opção:");
		System.out.println("\n1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Deposíto");
		
		operacao = leia.nextInt();
	
		
		switch(operacao) {
		case 1: 
			System.out.println("Saldo: "+saldo);	
		break;	
		
		case 2:
			System.out.println("\nQual valor do saque? ");
			saque = leia.nextFloat();
				if (saque<= saldo) {
					System.out.println("\nTransação Autorizada. \nNovo saldo: "+(saldo-saque));	
				}
				else
					System.out.println("Saldo insuficiente.");
		
		break;	
		
		case 3:	
			System.out.println("\nQual valor do depósito? ");
			deposito = leia.nextFloat();
			deposito = (saldo+deposito);
			
			System.out.println("\nDepósito realizado. \nNovo Saldo: "+deposito);
			
		break;
		
		default:
			System.out.println("Operação inválida.");
		}
		
		/* fim do programa */
				
							
						
	}

}
