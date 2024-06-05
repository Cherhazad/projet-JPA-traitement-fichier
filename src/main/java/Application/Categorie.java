package Application;

public class Categorie {

	private int id;
	private String libelle;
	
	/** Constructeur
	 * @param id
	 * @param libelle
	 */
	public Categorie(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
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
	
	
	
	
}
