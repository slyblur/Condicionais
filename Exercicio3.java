package Condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiravez;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do doador: ");
		nome = leia.next();
		
		System.out.print("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.print("Primeira vez doando sangue? true/false ");
		primeiravez = leia.nextBoolean();
		
		if (idade >=18 && idade <=69) {
			System.out.print("\n"+nome+ " está apto a doar.");		
		}
		
		else if (idade>60 && idade <69 && primeiravez==false) {
			System.out.print("\n"+nome+ " está apto a doar.");		
		}
		
		else if (idade>60 && idade <69 && primeiravez==true) {
			System.out.print("\n"+nome+ " não está apto a doar.");
		}
		
		else
			System.out.println("\n"+nome+ " não está apto a doar." );
		
		/* fim do programa */

	}

}
