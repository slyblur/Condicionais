package Condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int a, b, c, resultado;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Insira o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Insira o valor de C: ");
		c = ler.nextInt();
		
		
		if (a+b>c) {
				
			System.out.println("\nO resultado é maior que C.");		
		}	
		else if (a+b<c) {
			System.out.println("O resultado é menor que C.");
		}
		else if (a+b==c) {
			System.out.println("O resultado é IGUAL a C.");
		}
		else 
			System.out.println("Valor inválido.");
		
		/* fim do programa */
		
	}

}
