package serieharmonique;

import java.util.Scanner;

public class Ex1SerieHarmonique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez la valeur de n : ");
		int n = sc.nextInt();

		double somme = 0.0; // utiliser double car la somme contient des fractions

		for (int i = 1; i <= n; i++) {
			somme += 1.0 / i; // on ajoute 1/i à la somme
		}

		System.out.println("La somme des " + n + " premiers termes de la série harmonique est : " + somme);

		sc.close();
	}
}
