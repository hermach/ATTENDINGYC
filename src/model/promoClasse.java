package model;

public class promoClasse {

	private int id;
	private String year;
	public promoClasse(int id, String year) {
		super();
		this.id = id;
		this.year = year;
	}
	public promoClasse(String year) {
		super();
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "promoClasse [id=" + id + ", year=" + year + "]";
	}
	
}
