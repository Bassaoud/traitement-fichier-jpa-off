package entites;

public class Categories {
	
	private String nom;

	public Categories(String varCategorie) {
		nom=varCategorie;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
