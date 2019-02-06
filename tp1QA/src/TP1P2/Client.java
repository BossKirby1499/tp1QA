package TP1P2;

import java.util.ArrayList;

public class Client {
	String nom;
	ArrayList<Produit> listeProduit = new ArrayList<>();
	public Client() {
		
	}
	public Client(String nom) {
		this.nom = nom;
		
	}
	public void ajouterProduits(ArrayList<Produit> listeProduit){
		
		this.listeProduit = listeProduit;
	}
	
	

}
