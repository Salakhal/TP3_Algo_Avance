package triangleetoiles;

import java.util.Scanner;

public class Ex2TriangleEtoiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez la hauteur du triangle : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int nbEspaces = n - i; // nombre d’espaces avant les étoiles
			int nbEtoiles = 2 * i - 1; // nombre d’étoiles sur la ligne

			// afficher les espaces
			for (int j = 1; j <= nbEspaces; j++) {
				System.out.print(" ");
			}

			// afficher les étoiles
			for (int j = 1; j <= nbEtoiles; j++) {
				System.out.print("*");
			}

			System.out.println(); // passer à la ligne suivante
		}

		sc.close();
	}
}
