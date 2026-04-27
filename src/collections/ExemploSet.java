package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Cria a Collection Set, do tipo String chamada setFrutas
		Set<Integer> inteiros = new HashSet<Integer>();
		int indice;

		// entrada de dados
		for (indice = 0; indice < 10; indice++) {
			System.out.println("Digite um numero Inteiro: ");
			inteiros.add(leia.nextInt());
		}
		// Lista todos os elementos da Collection Set com o Objeto da Classe Iterator
		System.out.println("\n\nListar dados do Set:");
		// Iterator (iterar) ajuda a percorrer qualquer collection
		Iterator<Integer> iterator = inteiros.iterator();
		
		// com o iterator normalmente e utilizado o while para conseguir percorrer e
		// exibir os dados
		while (iterator.hasNext()) { // a pergunta que faz aqui o while e, tem um próximo?
			System.out.println(iterator.next());
		}
	}

}
