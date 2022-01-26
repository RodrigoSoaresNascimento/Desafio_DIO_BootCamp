package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorship;

public class Main {

	public static void main(String[] args) {

		Course course = new Course();
		
		course.setTitle("Introdução a programação");
		
		course.setDescription("Desenvolvendo a logica de programação na linguagem java");
		
		course.setWorkload(40.0);
		
		Course course1 = new Course();
		
		course1.setTitle("Introdução a programação em javascript");
		
		course1.setDescription("Integrando HTML e CCS ao javascript");
		
		course1.setWorkload(80.0);
		
		Mentorship mentorship = new Mentorship();
		
		mentorship.setDate(LocalDate.now());
		
		mentorship.setDescription("Introdução ao spring boot framework");
		
		mentorship.setTitle("Boas praticas em um prjeto SpringBoot");
		
		BootCamp bootCamp = new BootCamp();
		
		bootCamp.setName(" Java development ");
		
		bootCamp.setDescription("Desenvolvimento em java");
		
		bootCamp.getContent().add(course);
		
		bootCamp.getContent().add(course1);
		
		bootCamp.getContent().add(mentorship);
		
		Dev dev = new Dev(); 
		
		dev.setName("Rodrigo");
		
		dev.subscribedBootCamp(bootCamp);
		
		dev.seekBootCamp();
		
		dev.seekBootCamp();
		
		dev.seekBootCamp();
		
		System.out.println("Dev Rodrigo conteúdos inscritos: "+ dev.getSubscribedContent());
		
		System.out.println("Dev Rodrigo conteúdos concluidos: "+ dev.getCompletedContent());
		
		System.out.println("Total de Xp " + dev.calculateXPTotal());
		
		Dev dev1 = new Dev();
		
		dev1.setName("Eduardo");
		
		dev1.subscribedBootCamp(bootCamp);
		
		dev1.seekBootCamp();
		
		System.out.println("Dev Eduardo conteúdos inscritos: "+ dev1.getSubscribedContent());
		
		System.out.println("Dev Eduardo conteúdos concluidos: "+ dev1.getCompletedContent());
		
		System.out.println("Total de Xp " + dev1.calculateXPTotal());
		
		
		
		
		
	}

}
