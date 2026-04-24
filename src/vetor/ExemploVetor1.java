package vetor;

import java.util.Scanner;

public class ExemploVetor1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		// declaraçao do vetor
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero, indice;
		boolean encontrado = false;
		
		//entrada de dados
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for (indice = 0; indice < 10; indice++) {
			if (vetorInteiros[indice] == numero) {
				System.out.println("O numero " + numero + " está localizado na posição: " + indice);
				encontrado = true;
			}
		}
		
		if (encontrado == false) {
			System.out.println("O número " + numero + " não foi encontrado");
		}
	}

}
