package Condicionais;

import java.util.Scanner;

public class Exercicioextra {

	public static void main(String[] args) {
		
		String colab;
		int cargo;
		float salario, reajuste;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Colaborador, insira o seu nome: ");
		colab = leia.nextLine();
		System.out.println("\nEscolha seu cargo: \n");
		System.out.println("\t1. Gerente");
		System.out.println("\t2. Vendedor");

		System.out.println("\t3. Supervisor");

		System.out.println("\t4. Motorista");

		System.out.println("\t5. Estoquista");

		System.out.println("\t6. Técnico de TI");
		
		cargo = leia.nextInt();
		
		System.out.println("Insira o valor do salário: ");
		salario = leia.nextFloat();
		
		reajuste = (salario+(8*salario));
		
		System.out.println("Nome do Colaborador: "+colab+ "\nCargo: "+cargo+("\nNovo salário: "+reajuste));
	}

}
