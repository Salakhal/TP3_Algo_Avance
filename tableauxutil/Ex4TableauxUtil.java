package tableauxutil;

public class Ex4TableauxUtil {
	// Méthode 1 : affiche les valeurs du tableau 2D
	public static void affiche(double[][] t) {
		if (t == null) {
			System.out.println("Tableau nul !");
			return;
		}
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println(); // nouvelle ligne pour chaque ligne du tableau
		}
	}

	// Méthode 2 : teste si le tableau est régulier
	public static boolean regulier(double[][] t) {
		if (t == null || t.length == 0)
			return false;
		int taille = t[0].length;
		for (int i = 1; i < t.length; i++) {
			if (t[i].length != taille)
				return false;
		}
		return true;
	}

	// Méthode 3 : calcule la somme de chaque ligne
	public static double[] sommeLignes(double[][] t) {
		double[] somme = new double[t.length];
		for (int i = 0; i < t.length; i++) {
			double s = 0;
			for (int j = 0; j < t[i].length; j++) {
				s += t[i][j];
			}
			somme[i] = s;
		}
		return somme;
	}

	// Méthode 4 : somme de deux tableaux (si compatibles)
	public static double[][] somme(double[][] t1, double[][] t2) {
		// Vérification des conditions
		if (t1 == null || t2 == null)
			return null;
		if (!regulier(t1) || !regulier(t2))
			return null;
		if (t1.length != t2.length || t1[0].length != t2[0].length)
			return null;

		// Création du tableau résultat
		double[][] resultat = new double[t1.length][t1[0].length];
		for (int i = 0; i < t1.length; i++) {
			for (int j = 0; j < t1[i].length; j++) {
				resultat[i][j] = t1[i][j] + t2[i][j];
			}
		}
		return resultat;
	}
}
