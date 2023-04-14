package Condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("Insira um valor: ");
		x = leia.nextInt();
		
		if (x % 2==0 && x>0) {
			System.out.println("\n"+ x + " é par e positivo!");
		}	
		
		else if (x % 2!=0 && x < 0) {
			System.out.println("\n"+ x + " é ímpar e negativo!");
		}	
		
		else if (x %2 ==0 && x<0) {
			System.out.println("\n" + x + " é par e negativo!");
		}	
		
		else if (x%2!=0 && x>0) {
			System.out.println("\n" + x + " é ímpar e positivo!");
		}
		
		else
			System.out.println("\nVocê digitou o número 0.");
		
		/* fim do programa */
	}

}
