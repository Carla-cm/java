package Teste;

import java.util.Scanner;

public class Calculadora {

	public int som(int num1, int num2) {

		return num1 + num2;

	}

	public int sub(int num1, int num2) {
		return num1 - num2;

	}

	public int div(int num1, int num2) {
		return num1 / num2;

	}

	public int mult(int num1, int num2) {
		return num1 * num2;

	}

	public static void main(String args[]) {

		Calculadora c = new Calculadora ();
		
		int opcao = 5;
		int num1;
		int num2; 
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Escolha uma das opções a seguir:");
			System.out.println("Opção 1- Soma");
			System.out.println("Opção 2- Subtração");
			System.out.println("Opção 3- Divisão");
			System.out.println("Opção 4- Multiplicação");
			System.out.println("Opção 0- Sair");
			System.out.println("Opção: ");
			
			opcao = input.nextInt();
			
			while (opcao !=0) {
			
				if (opcao == 1) {
				
					Scanner input1 = new Scanner(System.in);
					
					System.out.println("Qual é o primeiro número: ");
					num1 = input.nextInt();
					System.out.println("Qual é o segundo número: ");
					num2 = input.nextInt();
					
					/***/
					int operacao = c.som(num1, num2);
					
					System.out.println("O resultado da some é: ");
					System.out.println(operacao);
					break;
					
				}
				if (opcao == 2) {
					
					try (Scanner inpult = new Scanner(System.in)) {
						System.out.println("Qual é o primeiro número: ");
						num1 = inpult.nextInt();
						System.out.println("qual é o segundo número: ");
						num2 = inpult.nextInt();
					}
					
					/***/
				    int operacao = c.sub(num1, num2);
				    
				    System.out.println("O resultado da subtração é: ");
				    System.out.println(operacao);
				    break;
				    
				}
				
				if ( opcao == 3) {

					try (Scanner inpult = new Scanner (System.in)) {
						System.out.println("Qual é o primeiro número: ");
						num1 = inpult.nextInt();
						System.out.println("Qual é o segundo número: ");		
						num2 = inpult.nextInt();
					}
			        /***/
			        int operacao = c.div(num1, num2);
			        
			        System.out.println("O resultado da divisão é: ");
			        System.out.println(operacao);
			        break;
			      
			       	}
				
				if ( opcao == 4) {
					
					try (Scanner inpult = new Scanner (System.in)) {
						System.out.println("Qual é o primeiro número: ");
						num1 = inpult.nextInt();
						System.out.println("Qual é o segundo número: ");
						num2 = inpult.nextInt();
					}
					
				    /***/
				    int operacao = c.mult(num1, num2);
				    
				    System.out.println("O resultado da divisão é: ");
				    System.out.println(operacao);
				    break;
				} else {
					System.out.println("Opção iválida! Tente novamente. ");
					break;
					
			 }
   }
		}
	}
}

