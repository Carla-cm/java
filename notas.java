package Teste;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		float n1, n2, n3, n4, soma, media;
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);

		System.out.println("Escreva o valor da nota n1: ");
		n1 = input.nextFloat();
		System.out.println("Escreva o valor da nota n2: ");
		n2 = input.nextFloat();
		System.out.println("Escreva o valor da nota n3: ");
		n3 = input.nextFloat();
		System.out.println("Escreva o valor da nota n4: ");
		n4 = input.nextFloat();

		soma = (n1 + n2 + n3 + n4);
		media = (soma / 4);

		if (media >= 5) {
			System.out.println("Você foi APROVADO! Sua média foi: " + media);
		} else {
			System.out.println("Você foi REPROVADO! Sua média foi: " + media);

		}
	}
}
