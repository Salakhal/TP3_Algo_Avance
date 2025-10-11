package carresimpairs;

import java.util.Scanner;

public class Ex3CarresImpairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Combien de valeurs : ");
		int n = sc.nextInt();

		int[] impairs = new int[n]; // tableau des nombres impairs
		int[] carres = new int[n]; // tableau des carrés

		int nombre = 1; // premier nombre impair

		for (int i = 0; i < n; i++) {
			impairs[i] = nombre;
			carres[i] = nombre * nombre;
			nombre += 2; // passer au nombre impair suivant
		}

		// affichage du résultat
		for (int i = 0; i < n; i++) {
			System.out.println(impairs[i] + " a pour carré " + carres[i]);
		}

		sc.close();
	}
}
