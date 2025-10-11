package tableauxutil;

public class TestTableauxUtil {
	public static void main(String[] args) {
		double[][] t1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		double[][] t2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		System.out.println("=== Tableau t1 ===");
		Ex4TableauxUtil.affiche(t1);

		System.out.println("\n=== Tableau t2 ===");
		Ex4TableauxUtil.affiche(t2);

		System.out.println("\nLe tableau t1 est régulier ? " + Ex4TableauxUtil.regulier(t1));

		System.out.println("\nSomme des lignes de t1 :");
		double[] sommes = Ex4TableauxUtil.sommeLignes(t1);
		for (int i = 0; i < sommes.length; i++) {
			System.out.println("Ligne " + (i + 1) + " : " + sommes[i]);
		}

		System.out.println("\n=== Somme de t1 et t2 ===");
		double[][] somme = Ex4TableauxUtil.somme(t1, t2);
		Ex4TableauxUtil.affiche(somme);
	}
}
