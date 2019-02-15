package TP1P2;

import java.util.ArrayList;

import outilsjava.OutilsConstantes;

public class PrincipalTP1P2 implements OutilsConstantes{

	public PrincipalTP1P2() {
		
		String ligne;
		
		System.out.println("Bienvenu chez Barette !");

		ArrayList<Client> listeClient = new ArrayList<>();
		ArrayList<Produit> listeProduit = new ArrayList<>();
		
		ligne = outilsjava.OutilsLecture.lireChaine("");
		
		if (ligne == "Clients :") {
			
			ligne = outilsjava.OutilsLecture.lireChaine("");
		}
		
		while (ligne != "Plats:") {
			
			try {
				
			Client ctemp = new Client("ligne");
			
			listeClient.add(ctemp);
				
			} catch (Exception e) {

			}
			
			ligne = outilsjava.OutilsLecture.lireChaine("");
		}
		
		if ( ligne == "Plats :" ) {
			
			ligne = outilsjava.OutilsLecture.lireChaine("");
			

		}
		while (ligne != "Commandes:") {
			
			String[] ligneProduti = ligne.split(" ");
		
			Produit produit = new produit(ligneProduti[0],Double.parseDouble(ligneProduti[1]));
			
			listeProduit.add(produit);
			
			ligne = outilsjava.OutilsLecture.lireChaine("");
		}
		for (Client c : listeClient) {
			
			c.ajouterProduits(listeProduit);
		}
		
		ligne = outilsjava.OutilsLecture.lireChaine("");
		
		while (ligne != "Fin") {
			
			String[] ligneProduit = ligne.split(" ");
			
			for (Client c : listeClient) {
				
				if(c.getNom == ligneProduit[0]) {
					
					for (Produit p : listeProduit) {
						
						if(p.getnom == ligneProduit[1]) {
							
							p.setQte = Integer.parseInt(tableauliste[2]);
						}
					}
				}
			}
			
			
			ligne = outilsjava.OutilsLecture.lireChaine("");
		}
		
		System.out.println("Factures");
		
		for (Client c : listeClient) {
			
			c.calculerPrix();
		}
		
	}
}
