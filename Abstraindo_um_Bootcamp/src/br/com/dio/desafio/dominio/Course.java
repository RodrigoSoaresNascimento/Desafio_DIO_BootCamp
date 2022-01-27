package br.com.dio.desafio.dominio;

public class Course extends Contents {
	
	
	private Double workload;


	public Double getWorkload() {
		return workload;
	}

	public void setWorkload(Double workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return  "Title [title=" +
				getTitle() + "]" + "Title [title=" + getDescription() + "]" + "Course [workload=" 
				+ workload + "]";
	}

	@Override
	public double calculateXp() {
		
		return XP_MAIN * workload;
		
	}

	/**
	 * @param title
	 * @param description
	 * @param workload
	 */
	public Course(String title, String description, Double workload) {
		super(title, description);
		this.workload = workload;
	}
	
	


}
