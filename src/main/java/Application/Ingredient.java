package Application;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
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
@Table(name = "INGREDIENT")
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "LIBELLE")
	private String libelle;
	
	
	/** Constructeur
	 * 
	 */
	public Ingredient() {
		super();
	}

	/** Constructeur
	 * @param id
	 * @param libelle
	 */
	public Ingredient(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	
	@ManyToMany
	@JoinTable(name = "INGREDIENTS_PRODUITS",
		joinColumns = @JoinColumn(name = "ID_ING", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name = "ID_PRO", referencedColumnName = "ID")
			)
	private Set<Produit> produits = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "ID_ALLERGENE")
	private Allergene allergenes;
	
	
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

	/** Getter pour libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter pour libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", libelle=" + libelle + "]";
	}

	/** Getter pour produits
	 * @return the produits
	 */
	public Set<Produit> getProduits() {
		return produits;
	}

	/** Setter pour produits
	 * @param produits the produits to set
	 */
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	/** Getter pour allergenes
	 * @return the allergenes
	 */
	public Allergene getAllergenes() {
		return allergenes;
	}

	/** Setter pour allergenes
	 * @param allergenes the allergenes to set
	 */
	public void setAllergenes(Allergene allergenes) {
		this.allergenes = allergenes;
	}
	
	
	
	
}
