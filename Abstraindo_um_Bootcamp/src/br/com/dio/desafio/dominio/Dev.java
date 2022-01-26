package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Dev {
	
	private String name;
	
	private Set <Contents> subscribedContent = new LinkedHashSet<>();
	
	private Set <Contents> completedContent = new LinkedHashSet<>();
	
	public void subscribedBootCamp (BootCamp bootCamp) {
		
		this.subscribedContent.addAll(bootCamp.getContent());
		
		bootCamp.getSubscribeDevs().add(this);
		
	}
	public void seekBootCamp () {
		
		Optional<Contents> supplies = this.subscribedContent.stream().findFirst();
		
		if(supplies.isPresent()) {
			
			this.completedContent.add(supplies.get());
			this.subscribedContent.remove(supplies.get());
			
		}else {
			
			System.err.println("Você não tem conteudos inscritos");
			
		}
		
	}
	public double calculateXPTotal() {
		
		return this.completedContent
				.stream()
				.mapToDouble(Supplies -> Supplies.calculateXp())
				.sum();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Contents> getSubscribedContent() {
		return subscribedContent;
	}
	public void setSubscribedContent(Set<Contents> subscribedContent) {
		this.subscribedContent = subscribedContent;
	}
	public Set<Contents> getCompletedContent() {
		return completedContent;
	}
	public void setCompletedContent(Set<Contents> completedContent) {
		this.completedContent = completedContent;
	}
	@Override
	public int hashCode() {
		return Objects.hash(completedContent, name, subscribedContent);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(completedContent, other.completedContent) && Objects.equals(name, other.name)
				&& Objects.equals(subscribedContent, other.subscribedContent);
	}
	

}
