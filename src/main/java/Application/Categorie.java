package Application;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CATEGORIE")
public class Categorie {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "LIBELLE")
	private String libelle;
	
	
	
	/** Constructeur
	 * 
	 */
	public Categorie() {
		super();
	}

	/** Constructeur
	 * @param id
	 * @param libelle
	 */
	public Categorie(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	@OneToMany(mappedBy = "produits")
	private Set<Produit> produits = new HashSet<>();
	

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
	
	
	
	
}
