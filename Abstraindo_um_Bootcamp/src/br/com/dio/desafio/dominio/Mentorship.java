package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Contents {

	
	private LocalDate date;


	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mentorship [date=" + date + "]" + "Title [title=" +
	getTitle() + "]" + "Title [title=" + getDescription() + "]";
	}

	@Override
	public double calculateXp() {
		
		return XP_MAIN + 20;
		
	}

	
	
	
	
	
	
}
