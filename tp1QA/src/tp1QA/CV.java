package tp1QA;

import java.io.*;

public class CV {

	public static void main(String[] args) {
		
		CV employeUn = new CV("Aoun", "Karl", "DES (Dipl�me d'�tude secondaire)", 2,
				"4 session technique informatique, technicien de point de vente 3 ans", "utilisation de Git");
		
		CV employeDeux = new CV("David", "Lavigueur", "DES (Dipl�me d'�tude secondaire)", 2,
				"4 session technique informatique", "Cours interactif et dynamique");
		employeUn.affiche();
		employeDeux.affiche();

	}

	public CV() {

	}

	public CV(String pnom, String pprenom, String pformation, int pnbAnneesExp, String pcompetence, String pattentes) {

		String nom = pnom;
		String prenom = pprenom;
		String formation = pformation;
		int nbAnneesExp = pnbAnneesExp;
		String competence = pcompetence;
		String attentes = pattentes;

	}

	public void affiche() {

	}
}
