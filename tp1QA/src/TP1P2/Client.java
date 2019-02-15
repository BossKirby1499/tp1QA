package TP1P2;

import java.util.ArrayList;

public class Client {
	private String nom;
	ArrayList<Produit> listeProduit = new ArrayList<>();

	public Client() {

	}

	public Client(String nom) {
		this.nom = nom;

	}

	public void ajouterProduits(ArrayList<Produit> listeProduit) {

		this.listeProduit = listeProduit;
	}

	public void calculerPrix() {
		
		double total;
		
		Produit[] produits = new Produit[listeProduit.size()];
		
		produits = listeProduit.toArray(produits);
		
		for(int i = 0; i < produits.length(); i++) {
			
			total += produits[i].getPrix()*produits[i].getQte();
		}
		
		System.out.println(this.nom+" "+total+"$ ");
	}
	
	public String getNom(){
		
		return this.nom;
	}

}
