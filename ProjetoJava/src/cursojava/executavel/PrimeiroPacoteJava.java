package cursojava.executavel;

import java.util.Scanner;

public class PrimeiroPacoteJava {

	public static void soma(double a, double b) {
		// TODO Auto-generated method stub

		double soma = a + b;

		System.out.println("O resultado da soma é: " + soma);

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Digite numero um: ");
		Double numeroUm = s.nextDouble();
		System.out.print("Digite numero dois: ");
		Double numeroDois = s.nextDouble();
		soma(numeroUm, numeroDois);
		s.close();
	}
}
