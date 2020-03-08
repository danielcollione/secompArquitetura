package com.arquitura.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import controller.AlunoController;
import model.Aluno;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		int opcao = 0;
		
		Scanner ler = new Scanner(System.in);
		
		private AlunoController alunoController;
		
		while(true) {
			System.out.println("Digite a opcao que deseja: ");
			System.out.println("1 -  Para cadastrar um aluno. ");
			System.out.println("2 - Para imprimir a lista de alunos. ");
			opcao = ler.nextInt();
		
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do aluno: ");
				Aluno aluno = new Aluno();
				aluno.setNomeAluno(ler.next());
				System.out.println(alunoController.cadastrarAluno(aluno));
				break;
				
			case 2:
				alunoController.imprimirListaAlunos();
				System.exit(0);
				break;
			default:
				System.out.println("Opção não existe, digite 1 ou 2.");
			
			}
			ler.close();
		}
	}

}
