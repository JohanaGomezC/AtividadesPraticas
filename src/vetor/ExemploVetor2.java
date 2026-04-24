package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//declaraçao do vetor e das variaveis
		int vetorNum[] = new int[10];
		int indice,soma = 0;
		double media;
		
		
		for (indice = 0; indice < vetorNum.length; indice++) {
			System.out.println("Digite o " + (indice + 1) + " º elemento da lista: ");
			vetorNum[indice] = leia.nextInt();
		}
		
		// Elementos nos índices ímpares
		System.out.println("\nElementos nos índices ímpares: ");
		for (indice = 0; indice < vetorNum.length; indice++) {
			if (indice % 2 != 0) {
				System.out.print(vetorNum[indice]+ " ");
			}
		}
		System.out.println("\nElementos pares: ");
		for (indice = 0; indice < vetorNum.length; indice++) {
			if ( vetorNum[indice] % 2 ==0) {
				System.out.print(vetorNum[indice]+ " ");
			}
		}
		for (indice = 0; indice < vetorNum.length; indice++) {
			soma = vetorNum[indice] + soma;
		}
		media = (double)soma / vetorNum.length; 
		// como es una operacion entre enteros debo convertir por lo menos uno a double para que me de un resultado double
		System.out.println("\nSoma: " + soma);
		System.out.println("\nMédia: " + media);

	}

}
