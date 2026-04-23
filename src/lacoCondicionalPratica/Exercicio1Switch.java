package lacoCondicionalPratica;

import java.util.Scanner;

public class Exercicio1Switch {

	public static void main(String[] args) {
		
		//variaveis
		int codigoitem, quantidade;
		float preco, total;
		String produto;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite o codigo do item: ");
		codigoitem = leia.nextInt();
		
		System.out.println("Digite a quantidade de produtos: ");
		quantidade = leia.nextInt();
		
	
		//processamento e saida de dados
		switch (codigoitem) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10.00f;
			total = quantidade * preco;
			System.out.println("Produto: " + produto);
			System.out.println("Valor total: R$" + total);
			break;
		case 2:
			produto = "X-Salada";
			preco = 15.00f;
			total = quantidade*preco;
			System.out.println("Produto: " + produto);
			System.out.println("Valor total: R$" + total);
			break;
		case 3:
			produto = "X-Bacon";
			preco = 18.00f;
			total = quantidade*preco;
			System.out.println("Produto: " + produto);
			System.out.println("Valor total: R$" + total);
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00f;
			total = quantidade*preco;
			System.out.println("Produto: " + produto);
			System.out.println("Valor total: R$" + total);
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8.00f;
			total = quantidade*preco;
			System.out.println("Produto: " + produto);
			System.out.println("Valor total: R$" + total);
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13.00f;
			total = quantidade*preco;
			System.out.println("Produto: " + produto);
			System.out.println("Valor total: R$" + total);
			break;
		default:
			System.out.println("Opção Inválida. ");
		}
		
		

	}

}
