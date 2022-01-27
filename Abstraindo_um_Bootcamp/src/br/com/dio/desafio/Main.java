package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorship;

public class Main {

	public static void main(String[] args) {

		Course course = new Course("Introdu��o a programa��o",
				"Desenvolvendo a logica de programa��o na linguagem java", 40.0 );
		
		
		Course course1 = new Course("Introdu��o a programa��o em javascript",
				"Integrando HTML e CCS ao javascript", 80.0 );
		
		
		Mentorship mentorship = new Mentorship("Boas praticas em um prjeto SpringBoot",
				"Introdu��o ao spring boot framework", LocalDate.now());
		
		
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
		
		System.out.println("Dev Rodrigo conte�dos inscritos: "+ dev.getSubscribedContent());
		
		System.out.println("Dev Rodrigo conte�dos concluidos: "+ dev.getCompletedContent());
		
		System.out.println("Total de Xp " + dev.calculateXPTotal());
		
		Dev dev1 = new Dev("Eduardo");
		
		dev1.subscribedBootCamp(bootCamp);
		
		dev1.seekBootCamp();
		
		System.out.println("Dev Eduardo conte�dos inscritos: "+ dev1.getSubscribedContent());
		
		System.out.println("Dev Eduardo conte�dos concluidos: "+ dev1.getCompletedContent());
		
		System.out.println("Total de Xp " + dev1.calculateXPTotal());
		
		
		
		
		
	}

}
