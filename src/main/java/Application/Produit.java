package Application;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUIT")
public class Produit {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "CATEGORIE")
	private Categorie categorie;
	
	@Column(name = "MARQUE")
	private Marque marque;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "SCORE_NUTRITIONNEL")
	private String scoreNutritionnel;
	//A faire : un ensemble d'autres attributs pour stocker les différentes valeurs nutritionnelles (énergie, sel, etc.)

	
	
	/** Constructeur
	 * 
	 */
	public Produit() {
		super();
	}
	
	/** Constructeur
	 * @param id
	 * @param categorie
	 * @param marque
	 * @param scoreNutritionnel
	 * @param ingredients
	 * @param allergenes
	 * @param marques
	 * @param categories
	 * @param additifs
	 */
	public Produit(Categorie categorie, Marque marque, String scoreNutritionnel, Set<Ingredient> ingredients,
			Set<Allergene> allergenes, Marque marques, Categorie categories, Additif additifs) {
		super();
		this.categorie = categorie;
		this.marque = marque;
		this.scoreNutritionnel = scoreNutritionnel;
		this.ingredients = ingredients;
		this.allergenes = allergenes;
		this.marques = marques;
		this.categories = categories;
		this.additifs = additifs;
	}


	@ManyToMany
	@JoinTable(name = "INGREDIENTS_PRODUITS",
		joinColumns = @JoinColumn(name = "ID_PRO", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name = "ID_ING", referencedColumnName = "ID")
			)
	private Set<Ingredient> ingredients = new HashSet<>();
	
	
	@ManyToMany
	@JoinTable(name = "ALLERGENES_PRODUITS",
		joinColumns = @JoinColumn(name = "ID_PRO", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name = "ID_ALL", referencedColumnName = "ID")
			)
	private Set<Allergene> allergenes = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "ID_MARQUE")
	private Marque marques;
	
	@ManyToOne
	@JoinColumn(name = "ID_CATEGORIE")
	private Categorie categories;
	
	@Embedded
	private Additif additifs;
	
	/** Getter pour categorie
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/** Setter pour categorie
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/** Getter pour marque
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}

	/** Setter pour marque
	 * @param marque the marque to set
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	/** Getter pour scoreNutritionnel
	 * @return the scoreNutritionnel
	 */
	public String getScoreNutritionnel() {
		return scoreNutritionnel;
	}

	/** Setter pour scoreNutritionnel
	 * @param scoreNutritionnel the scoreNutritionnel to set
	 */
	public void setScoreNutritionnel(String scoreNutritionnel) {
		this.scoreNutritionnel = scoreNutritionnel;
	}

	/** Getter pour ingredients
	 * @return the ingredients
	 */
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	/** Setter pour ingredients
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}


	/** Getter pour allergenes
	 * @return the allergenes
	 */
	public Set<Allergene> getAllergenes() {
		return allergenes;
	}

	/** Setter pour allergenes
	 * @param allergenes the allergenes to set
	 */
	public void setAllergenes(Set<Allergene> allergenes) {
		this.allergenes = allergenes;
	}

	/** Getter pour id
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter pour id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter pour marques
	 * @return the marques
	 */
	public Marque getMarques() {
		return marques;
	}

	/** Setter pour marques
	 * @param marques the marques to set
	 */
	public void setMarques(Marque marques) {
		this.marques = marques;
	}

	/** Getter pour categories
	 * @return the categories
	 */
	public Categorie getCategories() {
		return categories;
	}

	/** Setter pour categories
	 * @param categories the categories to set
	 */
	public void setCategories(Categorie categories) {
		this.categories = categories;
	}

	/** Getter pour additifs
	 * @return the additifs
	 */
	public Additif getAdditifs() {
		return additifs;
	}

	/** Setter pour additifs
	 * @param additifs the additifs to set
	 */
	public void setAdditifs(Additif additifs) {
		this.additifs = additifs;
	}
	
	
	@Override
	public String toString() {
		return "Produit [categorie=" + categorie + ", marque=" + marque + ", scoreNutritionnel=" + scoreNutritionnel
				+ "]";
	}
	
	
}
