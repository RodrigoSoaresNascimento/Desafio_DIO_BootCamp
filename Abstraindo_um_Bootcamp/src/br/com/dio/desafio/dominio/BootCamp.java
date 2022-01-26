package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp  {
	
	private String name;
	
	private String description;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private final LocalDate initDate = LocalDate.now();
	
	private final LocalDate finalDate = initDate.plusDays(45);
	
	private Set <Dev> subscribeDevs = new HashSet<>();
	
	private Set <Contents> content = new LinkedHashSet<>();


	public Set<Dev> getSubscribeDevs() {
		return subscribeDevs;
	}

	public void setSubscribeDevs(Set<Dev> subscribeDevs) {
		this.subscribeDevs = subscribeDevs;
	}

	public Set<Contents> getContent() {
		return content;
	}

	public void setContent(Set<Contents> content) {
		this.content = content;
	}

	public LocalDate getInitDate() {
		return initDate;
	}

	public LocalDate getFinalDate() {
		return finalDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, finalDate, initDate, subscribeDevs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(content, other.content) && Objects.equals(finalDate, other.finalDate)
				&& Objects.equals(initDate, other.initDate) && Objects.equals(subscribeDevs, other.subscribeDevs);
	}
	
	

}
