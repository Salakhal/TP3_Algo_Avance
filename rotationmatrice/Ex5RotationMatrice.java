package rotationmatrice;

import java.util.Scanner;

public class Ex5RotationMatrice {
	// Méthode principale de rotation à 90° dans le sens horaire
	public static void rotate90ClockwiseInPlace(int[][] A) {
		int N = A.length;

		// Étape 1 : Transposer la matrice (échanger A[i][j] et A[j][i])
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}

		// Étape 2 : Renverser chaque ligne
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N / 2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][N - 1 - j];
				A[i][N - 1 - j] = temp;
			}
		}
	}

	// (Bonus) Rotation 90° antihoraire
	public static void rotate90CounterClockwiseInPlace(int[][] A) {
		int N = A.length;

		// Étape 1 : Transposer
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}

		// Étape 2 : Renverser les colonnes (et non les lignes)
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N / 2; i++) {
				int temp = A[i][j];
				A[i][j] = A[N - 1 - i][j];
				A[N - 1 - i][j] = temp;
			}
		}
	}

	// (Bonus) Rotation 180° (simple double inversion)
	public static void rotate180InPlace(int[][] A) {
		int N = A.length;
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < N; j++) {
				int temp = A[i][j];
				A[i][j] = A[N - 1 - i][N - 1 - j];
				A[N - 1 - i][N - 1 - j] = temp;
			}
		}
		// Si N est impair, il faut aussi inverser la ligne centrale
		if (N % 2 == 1) {
			int mid = N / 2;
			for (int j = 0; j < N / 2; j++) {
				int temp = A[mid][j];
				A[mid][j] = A[mid][N - 1 - j];
				A[mid][N - 1 - j] = temp;
			}
		}
	}

	// Méthode pour afficher la matrice
	public static void afficher(int[][] A) {
		int N = A.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Programme principal
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez la taille N de la matrice carrée : ");
		int N = sc.nextInt();

		int[][] A = new int[N][N];
		System.out.println("Entrez les éléments de la matrice (" + N + " lignes de " + N + " entiers) :");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("\n=== Matrice originale ===");
		afficher(A);

		// Rotation 90° horaire
		rotate90ClockwiseInPlace(A);
		System.out.println("\n=== Matrice après rotation 90° horaire ===");
		afficher(A);

		sc.close();
	}
}
