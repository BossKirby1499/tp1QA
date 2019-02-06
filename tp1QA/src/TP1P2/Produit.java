package TP1P2;

public class Produit {
	private String nom;
	private double prix;
	private int qte;

	public Produit() {

	}

	public Produit(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
		this.qte = 0;
	}

	public String getNom() {
		return this.nom;
	}

	public double getPrix() {
		return this.getPrix();
	}

	public int getQte() {
		return this.getQte();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}
}
