import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("POO java");
		curso1.setDescricao("Programação Orientada a Objetos em java");
		curso1.setCargaHoraria(4);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Coleções");
		curso2.setDescricao("Coleções em java");
		curso2.setCargaHoraria(3);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Boas práticas em java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Spring Framework experience");
		bootcamp.setDescricao("Dominando o Spring Boot");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("João da Silva");
		dev1.increverBootcamp(bootcamp);
		dev1.progredir();
		dev1.progredir();
		System.out.println(dev1.getNome() 
				+ "\nInscrito em:\n"
				+ dev1.getConteudosInscritos()
				+ "\nConcluiu:\n"
				+ dev1.getConteudosConcuidos()
				+ "\nXP: " + dev1.calcularTotalXp());
		
		System.out.println();
		
		Dev dev2 = new Dev();
		dev2.setNome("Maria S.");
		dev2.progredir();
		dev2.increverBootcamp(bootcamp);
		dev2.progredir();
		System.out.println(dev2.getNome() 
				+ "\nInscrito em:\n"
				+ dev2.getConteudosInscritos()
				+ "\nConcluiu:\n"
				+ dev2.getConteudosConcuidos()
				+ "\nXP: " + dev2.calcularTotalXp());
		
	}

}
