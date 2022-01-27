package br.com.dio.desafio.dominio;

public abstract class  Contents {

	private String title;
	
	private String description;
	
	protected static final double XP_MAIN = 10.0;
	
	public abstract double calculateXp(); 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Contents [title=" + title + ", description=" + description + "]";
	}

	public Contents(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
	
	
	
	
}
