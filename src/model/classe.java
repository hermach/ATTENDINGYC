package model;

public class classe {
	private int id ;
	private String nom;
	private String pseudo;
	private promoClasse generation;
	public classe(int id, String nom, String pseudo,promoClasse generation) {
		super();
		this.id = id;
		this.nom = nom;
		this.pseudo = pseudo;
		this.generation = generation;
	}
	public classe(String nom, String pseudo,promoClasse generation) {
		super();
		this.nom = nom;
		this.pseudo = pseudo;
		this.generation = generation;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public promoClasse getGeneration(){
		 return generation;
	}
	public void setGeneration(promoClasse generation) {
		this.generation = generation;
	}

	@Override
	public String toString() {
		return "classe [id=" + id + ", nom=" + nom + ", pseudo=" + pseudo +", generation="+generation+"]";
	}
	
}
