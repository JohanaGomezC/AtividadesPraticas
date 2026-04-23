package lacoCondicionalPratica;

import java.util.Scanner;

public class Exercicio2Switch {

	public static void main(String[] args) {
		
		//variaveis
		String nome, nomecargo = "";
		int cargo;
		float salario, reajuste = 0, novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("Salario: R$");
		salario = leia.nextFloat();
		
		//processamento
		
		switch (cargo) {
		case 1:
			nomecargo = "Gerente";
			reajuste = 0.10f;
			break;
		case 2:
			nomecargo = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			nomecargo = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			nomecargo = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			nomecargo = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			nomecargo = "Tecnico de TI";
			reajuste = 0.08f;
			break;
		default:
			System.out.println("Cargo Invalido!");
		}
		
		novosalario = salario + (reajuste * salario);
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + nomecargo);
		System.out.println("Salario: R$ " + novosalario);
	}

}
