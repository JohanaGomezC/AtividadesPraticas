package lacoCondicionalPratica;

import java.util.Scanner;

public class Exercicio3If {

	public static void main(String[] args) {
		
		//variaveis
		String nome;
		int idade;
		boolean doacao, apto;
		
		Scanner leia = new Scanner(System.in);
	
		//entrada de dados
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		doacao = leia.nextBoolean();
		
		//processamento
		
		if (idade < 18 || idade > 69) { //confirmo que se e menor a 18 ou maior a 69 não pode doar
			apto = false;
		}else if (idade >= 60 && idade <= 69 && doacao == true) { 
			// se a idade for entre 60 e 69 e for a primeira doação não pode doar
			apto = false;
		}else { // caso contrario esta em um rango de idade que pode doar
			apto = true;
		}
		
		//saida de dados
		if (apto == true) {
			System.out.println(nome + " está apto para doar sangue!");
		}else {
			System.out.println(nome + " NÃO esta apto para doar sangue !");
		}

	}

}
