package Condicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int operacao;
		float n1 = 0, n2 = 0, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual operação?");
		System.out.println("\n1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplica");
		System.out.println("4 - Divisão");
		System.out.println("5 - Módulo");
		
		operacao = leia.nextInt();
		
		System.out.println("\nInsira o primeiro número = ");
		n1 = leia.nextInt();
		System.out.println("Insira o segundo número = ");
		n2 = leia.nextInt();
		
		
		switch(operacao) {
		case 1:
			resultado = (n1+n2);
			System.out.println("\n"+ n1+" + "+n2+" = "+resultado);
		break;	
		
		case 2:
			resultado = (n1-n2);
			System.out.println("\n"+ n1+" - "+n2 +" = "+resultado);
		break;	
		
		case 3:
			resultado = (n1*n2);
			System.out.println("\n"+ n1+" * "+n2+" = "+resultado);
		break;	
		
		case 4:
			resultado = (n1/n2);
			System.out.println("\n"+ n1+" / "+n2+" = "+resultado);	
		break;	
		
		case 5:
			resultado = (n1%n2);
			System.out.println("\n"+ n1+" % "+n2+" = "+resultado);
		break;	
		
		default:
			System.out.println("Opção Inválida!");			
			
		}
		
		/* fim do programa */
	}

}
