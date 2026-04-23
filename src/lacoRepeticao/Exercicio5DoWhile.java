package lacoRepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, soma;
		soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();	
			if (numero > 0) {
				soma = numero + soma;
			}
		}while (numero != 0 );
		
		System.out.println("A soma dos números positivos é: " + soma);

	}

}
