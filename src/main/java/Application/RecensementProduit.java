package Application;
import java.util.ArrayList;
import java.util.List;

public class RecensementProduit {

	private List<Produit> produits = new ArrayList<>();

	/** Getter pour produits
	 * @return the produits
	 */
	public List<Produit> getProduits() {
		return produits;
	}

	/** Setter pour produits
	 * @param produits the produits to set
	 */
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
}
