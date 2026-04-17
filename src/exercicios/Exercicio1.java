package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// ler o salario
		System.out.print("Sálario: ");
		float salario = leia.nextFloat();
		
		//ler o abono
		System.out.print("Abono: ");
		float abono = leia.nextFloat();
		
		//calcular novo salario
		float novoSalario = salario + abono;
		
		// mostrar resultado
		System.out.println("Novo salário:" + novoSalario);
		
		// TODO Auto-generated method stub

	}

}
