package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		// cria a collection cores
		ArrayList<String> cores = new ArrayList<String>();
		int indice;

		// entrada de dados peço as cores ao usuario
		for (indice = 0; indice < 5; indice++) {
			System.out.println("Digite uma cor: ");
			cores.add(leia.nextLine());
		}
		
		//mostra os elementos da collection
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		// a funçao sort ordena or elementos de maneira crescente
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
	}

}
