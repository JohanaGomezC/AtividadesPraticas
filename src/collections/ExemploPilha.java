package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class ExemploPilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// criando declarando nossa collection pilha
		Deque<String> pilha = new ArrayDeque<String>();

		// declarando variaveis
		String livro;
		int opcao = -1;
		// inicio uma variavel de opçao em um numero diferente as opçoes permitidas para
		// conseguir iterar o codigo

		while (opcao != 0) {// solicito entrada de dados enquanto a opçao não seja 0

			System.out.println("\n***************************************");
			System.out.println("     1 - Adicionar Livro na Pilha ");
			System.out.println("     2 - Listar todos os Livros ");
			System.out.println("     3 - Retirar Livro da Pilha ");
			System.out.println("     0 - Sair ");

			// peço para ingressar a opçao
			System.out.println("\n***************************************");
			System.out.println(" Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			//laço de repetiçao para percorrer enquanto ingressar uma opçao valida
			switch (opcao) {
			case 1:
				// solicitando o nome do livro
				System.out.println("Digite o nome: ");
				livro = leia.nextLine();
				pilha.add(livro);

				// mostrar os dados da lista
				System.out.println("\nPilha: ");
				Iterator<String> iterator = pilha.iterator(); // chamando a funçao iterator
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("Livro Adicionado! ");
				break;
			case 2:
				if (pilha.isEmpty()) { //check se pilha esta vazia
					System.out.println("A Pilha esta vazia!");
				} else {
					System.out.println("Lista de Livros na Fila: ");
					// so faço a exibiçao dos elementos da pilha
					Iterator<String> iterator1 = pilha.iterator(); // chamando a funçao iterator
					while (iterator1.hasNext()) {
						System.out.println(iterator1.next());
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) { // check se pilha esta vazia
					System.out.println("A Pilha esta vazia!");
				} else {
					System.out.println("\nPilha:");
					pilha.pop(); // elimino o primeiro elemento da pilha
					Iterator<String> iterator2 = pilha.iterator();
					// exibo como ficou a lista
					while (iterator2.hasNext()) {
						System.out.println(iterator2.next());
					}
					System.out.println("Um Livro foi retirado da pilha");
				}
				break;
			case 0:
				// indico que o programa foi finalizado
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção Invalida");
			}
		}

	}

}
