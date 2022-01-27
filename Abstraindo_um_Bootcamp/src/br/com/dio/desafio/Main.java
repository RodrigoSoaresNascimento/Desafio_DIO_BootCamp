package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorship;

public class Main {

	public static void main(String[] args) {

		Course course = new Course("Introdução a programação",
				"Desenvolvendo a logica de programação na linguagem java", 40.0 );
		
		
		Course course1 = new Course("Introdução a programação em javascript",
				"Integrando HTML e CCS ao javascript", 80.0 );
		
		
		Mentorship mentorship = new Mentorship("Boas praticas em um prjeto SpringBoot",
				"Introdução ao spring boot framework", LocalDate.now());
		
		
		BootCamp bootCamp = new BootCamp(" Java development ", "Desenvolvimento em java"
				);
		
		
		bootCamp.getContent().add(course);
		
		bootCamp.getContent().add(course1);
		
		bootCamp.getContent().add(mentorship);
		
		Dev dev = new Dev("Rodrigo"); 
		
		
		dev.subscribedBootCamp(bootCamp);
		
		dev.seekBootCamp();
		
		dev.seekBootCamp();
		
		dev.seekBootCamp();
		
		System.out.println("Dev Rodrigo conteúdos inscritos: "+ dev.getSubscribedContent());
		
		System.out.println("Dev Rodrigo conteúdos concluidos: "+ dev.getCompletedContent());
		
		System.out.println("Total de Xp " + dev.calculateXPTotal());
		
		Dev dev1 = new Dev("Eduardo");
		
		dev1.subscribedBootCamp(bootCamp);
		
		dev1.seekBootCamp();
		
		System.out.println("Dev Eduardo conteúdos inscritos: "+ dev1.getSubscribedContent());
		
		System.out.println("Dev Eduardo conteúdos concluidos: "+ dev1.getCompletedContent());
		
		System.out.println("Total de Xp " + dev1.calculateXPTotal());
		
		
		
		
		
	}

}
