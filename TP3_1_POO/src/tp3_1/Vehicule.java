package tp3_1;

public class Vehicule {
	private int num;
	private String marque;
	private String modele;
	private int anneeCreation;
	private double prix;
	 private static int count=0;
	
	public Vehicule(String marque, String modele,  double prix,int anneeCreation) {
		this.marque = marque;
		this.modele = modele;
		this.anneeCreation = anneeCreation;
		this.prix = prix;
		
		this.num=++count;
	}

	void DecrisVehicule() {
		System.out.println("La vehicule num: " + num + " sa marque est " + marque + " son modele est " + modele + ", elle est créée en " + anneeCreation
				+ " son prix est " + prix+".");
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getCount() {
		return prix;
	}
	public double getAnneeCreation() {
		return prix;
	}
	
	
	
	

}
