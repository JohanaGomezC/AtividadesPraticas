package lacoRepeticao;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade, menor, maior;
		idade = 0;
		menor = 0;
		maior = 0;
		
		while( idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade > 0) {
				menor = menor + 1;
			}
			if (idade > 50) {
				maior = maior + 1;
			}
		}
		
		System.out.println("Total de pessoas menor de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);
	}

}
