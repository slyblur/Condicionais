package Condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String p1, p2, p3;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira a primeira palavra: ");
		p1 = ler.nextLine();
		
		System.out.println("Insira a segunda palavra: ");
		p2 = ler.nextLine();
		
		System.out.println("Insira a terceira palavra: ");
		p3 = ler.nextLine();
		
		
		if(p1.equalsIgnoreCase("invertebrado")) {
			if(p2.equalsIgnoreCase("inseto")) {
					if (p3.equalsIgnoreCase("hematofago"))
						System.out.println("O animal é uma pulga.");
			}
					else { 
						System.out.println("O animal é uma lagarta.");				
			}
			if (p2.equalsIgnoreCase("anelidio")) {
					if (p3.equalsIgnoreCase("hematofago"))
						System.out.println("O animal é uma sanguessuga.");
					if (p2.equalsIgnoreCase("onivoro")) 
						System.out.println("O animal é uma minhoca.");
		}
		else {
			if(p2.equalsIgnoreCase("ave")); {
				if(p3.equalsIgnoreCase("carnivoro")) {
					System.out.println("O animal é uma Águia.");
				}
			}
		}
			
				
		}
}	
