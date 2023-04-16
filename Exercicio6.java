package Condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		String colab;
		int cargo;
		float salario, reajuste;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Colaborador, insira o seu nome: ");
		colab = leia.nextLine();
		
		
		System.out.println("\nQual seu cargo: \n");
				
		
		System.out.println("\t1. Gerente");
		System.out.println("\t2. Vendedor");

		System.out.println("\t3. Supervisor");

		System.out.println("\t4. Motorista");

		System.out.println("\t5. Estoquista");

		System.out.println("\t6. Técnico de TI");
		
		cargo = leia.nextInt();
		
		System.out.println("Insira o valor do salário: ");
		salario = leia.nextFloat();
	
		
		switch(cargo) {
		case 1:
			reajuste =  salario +(2*salario);
			System.out.println("\nNome do Colaborador: "+colab+ "\nCargo: Gerente"+ "\nNovo Salário: "+reajuste);
		break;
		case 2:
			reajuste =  salario +(2*salario);
			System.out.println("\nNome do Colaborador: "+colab+ "\nCargo: Vendedor"+ "\nNovo Salário: "+reajuste);
		break;	
		case 3:
			reajuste =  salario +(2*salario);
			System.out.println("\nNome do Colaborador: "+colab+ "\nCargo: Supervisor"+ "\nNovo Salário: "+reajuste);
		break;	
		case 4:
			reajuste =  salario +(3*salario);
			System.out.println("\nNome do Colaborador: "+colab+ "\nCargo: Motorista"+ "\nNovo Salário: "+reajuste);
		break;	
		case 5:
			reajuste =  salario +(3*salario);
			System.out.println("\nNome do Colaborador: "+colab+ "\nCargo: Estoquista"+ "\nNovo Salário: "+reajuste);
		break;	
		case 6:
			reajuste =  salario +(3*salario);
			System.out.println("\nNome do Colaborador: "+colab+ "\nCargo: Técnico de T.I."+ "\nNovo Salário: "+reajuste);	
		break;
		
		default:
			System.out.println("\nPor favor, insira uma opção válida.");
			
		}
		
		/* fim do programa */
		

	}

}
