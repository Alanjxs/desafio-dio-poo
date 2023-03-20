package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso JAVA");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição Curso JS");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("JAVA");
		mentoria1.setDescricao("Descrição Mentoria JAVA");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp JAVA Developer");
		bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devAlan = new Dev();
		devAlan.setNome("Alanjxs");
		devAlan.inscreverBootcamp(bootcamp);
		System.out.println("Alanjxs - Conteúdos inscritos: " + devAlan.getConteudosInscritos());
		System.out.println("Alanjxs - Conteúdos concluídos: " + devAlan.getConteudosConcluidos());
		System.out.println("XP Inicial: " + devAlan.calcularTotalXp());	
		devAlan.progredir();
		devAlan.progredir();
		System.out.println("-------------");	
		System.out.println("Alanjxs - Conteúdos concluídos: " + devAlan.getConteudosConcluidos());
		System.out.println("Alanjxs - Conteúdos inscritos: " + devAlan.getConteudosInscritos());
		System.out.println("XP Final: " + devAlan.calcularTotalXp());
		
		System.out.println("-------------");
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Camila - Conteúdos inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("Camila - Conteúdos concluídos: " + devCamila.getConteudosConcluidos());
		System.out.println("XP Inicial: " + devCamila.calcularTotalXp());
		devCamila.progredir();
		System.out.println("-------------");
		System.out.println("Camila - Conteúdos inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("Camila - Conteúdos concluídos: " + devCamila.getConteudosConcluidos());
		System.out.println("XP Atual: " + devCamila.calcularTotalXp());
	

	}

}
