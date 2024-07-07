package entities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Problema "crescente"

		int X;
		int Y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois numeros: ");
		X = sc.nextInt();
		Y = sc.nextInt();

		while (X != Y) {
			if (X > Y) {
				System.out.println("DECRESCENTE!");
			} else {
				System.out.println("CRESCENTE!");
			}
			System.out.println("Digite outros dois numeros: ");
			X = sc.nextInt();
			Y = sc.nextInt();

		}

		sc.close();

	}

}
