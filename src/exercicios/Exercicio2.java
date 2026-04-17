package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		float nota1 = leia.nextFloat();
		
		System.out.print("Nota 2: ");
		float nota2 = leia.nextFloat();
		
		System.out.print("Nota 3: ");
		float nota3 = leia.nextFloat();
		
		System.out.print("Nota 4: ");
		float nota4 = leia.nextFloat();
		
		//calculo da media
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Media final: " + media);

	}

}
