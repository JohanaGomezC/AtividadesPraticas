package lacoRepeticao;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int num1, num2, contador;
		
		//entrada de dados
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		//processamento
		if(num1 >= num2) {
			System.out.println("Intervalo inválido!");
		}
		
		if (num1 < num2) {
		System.out.println("No intervalo entre " + num1 + " e " + num2 + ":");
		}
		
		for(contador = num1; contador<= num2; contador++) {
			if (contador%3 == 0 && contador%5 == 0) {
				System.out.println(contador + " é multiplo de 3 e 5");
			}
		}

	}

}
