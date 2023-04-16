package Condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
				
		Scanner leia = new Scanner (System.in);
		
		int quantidade, produto;
		float valor_total;
		
		System.out.print("Cardápio do Gyo");
		System.out.print("\n\n1. Cachorro-Quente - R$10,00\n");
		System.out.print("\n2.X-Salada - R$15,00\n");
		System.out.print("\n3.X-Bacon - R$18,00\n");
		System.out.print("\n4.Bauru - R$ 12,00\n");
		System.out.print("\n5.Refrigerante - R$8,00\n");
		System.out.print("\n6.Suco de Laranja - R$13,00\n");
		
		System.out.print("\n\nEscolha seu produto: ");
		produto = leia.nextInt();
				
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		
		switch(produto) {
		case 1:
			valor_total = (quantidade *10);
			System.out.printf("Cachorro Quente - Total: R$%.2f",valor_total);	
			break;
			
		case 2:
			valor_total = (quantidade *15);
			System.out.printf("\nX Salada - Total: ",valor_total);
			break;
			
		case 3:
			valor_total = (quantidade *18);
			System.out.printf("\nX Bacon- Total: R$%.2f\"",valor_total);
			break;
			
		case 4:
			valor_total = (quantidade *12);
			System.out.printf("\nBauru - Total: R$%.2f\"",valor_total);
			break;
			
		case 5:
			valor_total = (quantidade *8);
			System.out.print("\nRefrigerante - Total: R$%.2f\""+valor_total);
			break;
			
		case 6:
			valor_total = (quantidade *13);
			System.out.print("\nSuco de laranja- Total: R$%.2f\""+valor_total);
			break;	
			
		default:
			System.out.println("Código Inválido.");						
		}
		
		/* fim do programa */		

	}

}
