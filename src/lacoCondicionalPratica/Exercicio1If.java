package lacoCondicionalPratica;

import java.util.Scanner;

public class Exercicio1If {

	public static void main(String[] args) {
		
		//variaveis
		int numA, numB, numC, soma;
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Insira o numero A: ");
		numA = leia.nextInt();
		
		System.out.println("Insira o numero B: ");
		numB = leia.nextInt();
		
		System.out.println("Insira o numero C: ");
		numC = leia.nextInt();
		
		//processamento
		soma = numA + numB;
		
		//saida de dados 
		//imprimir se a soma de A+B e maior, menor ou igual-preciso evaluar 3 condiçoes estao o melhor e usar o if else encadeado
		
		if (soma > numC) {
			System.out.println(numA + " + " + numB + " = " + soma + " > " + numC);
			System.out.println("A soma de A + B é maior do que C");
		}else if(soma < numC) {
			System.out.println(numA + " + " + numB + " = " + soma + " < " + numC);
			System.out.println("A soma de A + B é menor do que C");
		}else {
			System.out.println(numA + " + " + numB + " = " + soma + " = " + numC);
			System.out.println("A soma de A + B é igual a C");
		}

	}

}
