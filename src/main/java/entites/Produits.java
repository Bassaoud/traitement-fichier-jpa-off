package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUIT")
public class Produits {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "CATEGORIE", length = 50, nullable = false, unique = true)
	private Categories categorie;
	@Column(name = "MARQUE", length = 50, nullable = false, unique = true)
	private Marques marque;
	@Column(name = "NOM", length = 50, nullable = false, unique = true)
	private String nom;
	@Column(name = "GRADE", length = 50, nullable = false, unique = true)
	private String grade;
	@ManyToMany
	private List<Ingredients> ingredients = new ArrayList<>();
	//decoupage[29]
	@ManyToMany
	private List<Additifs> additifs = new ArrayList<>();
	//decouopage[28]
	@ManyToMany
	private List<Allergenes> allergenes = new ArrayList<>();
		
	public Produits(String[] decoupage) {
		categorie = new Categories(decoupage[0]);
		marque = new Marques(decoupage[1]);
		nom = decoupage[2];
		grade = decoupage[3];
		
		// traitement decoupage[5] en liste d'ingredients
		String[] listeIng = decoupage[5].split(",");
		for (String i : listeIng) {
			ingredients.add(new Ingredients(i));
		}
		//categorie|marque|nom|nutritionGradeFr|ingredients|energie100g|graisse100g|sucres100g|fibres100g|proteines100g|sel100g|vitA100g|vitD100g|vitE100g|vitK100g|vitC100g|vitB1100g|vitB2100g|vitPP100g|vitB6100g|vitB9100g|vitB12100g|calcium100g|magnesium100g|iron100g|fer100g|betaCarotene100g|presenceHuilePalme|allergenes|additifs|
		
	}
}
