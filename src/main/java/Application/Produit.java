package Application;

import java.util.HashSet;
import java.util.Set;

public class Produit {

	private Categorie categorie;
	private Marque marque;
	private int scoreNutritionnel;
	//A faire : un ensemble d'autres attributs pour stocker les différentes valeurs nutritionnelles (énergie, sel, etc.)
	private Set<Ingredient> ingredients = new HashSet<>();
	private Set<Additif> additifs = new HashSet<>();
	private Set<Allergene> allergenes = new HashSet<>();
}
