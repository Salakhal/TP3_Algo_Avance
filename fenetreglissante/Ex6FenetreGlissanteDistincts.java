package fenetreglissante;

import java.util.Scanner;

public class Ex6FenetreGlissanteDistincts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Lecture de n et k
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] T = new int[n];
		for (int i = 0; i < n; i++) {
			T[i] = sc.nextInt();
		}

		final int MAXV = 100000;
		int[] freq = new int[MAXV + 1]; // tableau de fréquences
		int distinct = 0; // nombre d’éléments distincts dans la fenêtre

		//Étape 1 : initialiser la première fenêtre [0 .. k-1]
		for (int i = 0; i < k; i++) {
			int val = T[i];
			if (freq[val] == 0)
				distinct++;
			freq[val]++;
		}

		// Afficher le résultat pour la première fenêtre
		System.out.print(distinct);

		//Étape 2 : faire glisser la fenêtre
		for (int i = k; i < n; i++) {
			int out = T[i - k]; // élément sortant
			int in = T[i]; // élément entrant

			// Retirer l’élément sortant
			freq[out]--;
			if (freq[out] == 0)
				distinct--;

			// Ajouter l’élément entrant
			if (freq[in] == 0)
				distinct++;
			freq[in]++;

			System.out.print(" " + distinct);
		}

		System.out.println(); // fin de ligne
		sc.close();
	}
}
