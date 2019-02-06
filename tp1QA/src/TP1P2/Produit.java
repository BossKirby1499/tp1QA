package TP1P2;

public class Produit {
	private String nom;
	private int prix;
	private double qte;

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

	public int getPrix() {
		return this.getPrix();
	}

	public double getQte() {
		return this.getQte();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setQte(double qte) {
		this.qte = qte;
	}
}
