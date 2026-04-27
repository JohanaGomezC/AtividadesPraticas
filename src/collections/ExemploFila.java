package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExemploFila {

	public static void main(String[] args) {
		// criar/declararr a collection Queue usando a estrutura LinkedList
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		// declarando variaveis
		String nome;
		int opcao = -1;
		// inicio uma variavel de opçao em um numero diferente as opçoes permitidas para
		// conseguir iterar o codigo

		while (opcao != 0) {// solicito entrada de dados enquanto a opçao não seja 0

			System.out.println("\n***************************************");
			System.out.println("     1 - Adicionar Cliente na Fila ");
			System.out.println("     2 - Listar todos os Clientes ");
			System.out.println("     3 - Retirar cliente da Fila ");
			System.out.println("     0 - Sair ");

			// peço para ingressar a opçao
			System.out.println("\n***************************************");
			System.out.println(" Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
					// solicitando o nome do cliente
					System.out.println("Digite o nome: ");
					nome = leia.nextLine();
					fila.add(nome);

					// mostrar os dados da lista
					System.out.println("\nFila: ");
					Iterator<String> iterator = fila.iterator(); // chamando a funçao iterator
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					System.out.println("Cliente Adicionado! ");
				
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A Fila esta vazia!");
				} else {
					System.out.println("Lista de Clientes na Fila: ");
					// so faço a exibiçao dos elementos da fila
					Iterator<String> iterator1 = fila.iterator(); // chamando a funçao iterator
					while (iterator1.hasNext()) {
						System.out.println(iterator1.next());
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila esta vazia!");
				} else {
					System.out.println("\nFila:");
					fila.poll(); // elimino o primeiro elemento da fila
					Iterator<String> iterator2 = fila.iterator();
					// exibo como ficou a lista
					while (iterator2.hasNext()) {
						System.out.println(iterator2.next());
					}
					System.out.println("O cliente foi chamado");
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
