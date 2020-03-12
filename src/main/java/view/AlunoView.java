package view;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import controller.AlunoController;
import model.Aluno;

public class AlunoView {

  private ArrayList<Aluno> listaAlunos = new ArrayList<>();

	@Autowired
	//private AlunoController alunoController;
	/*Retiramos as funções criadas nas outras classes java e colocamos todas no AlunoView.java
	 -Uso mínimo de recursos;
	 -foco na funcionalidade(para o usuário);
	 -codigo mais intuitivo, menos objetos para acessar uma função ou mais(no caso encontrado, no maximo eram duas funções em um objeto);
	 -
	*/

	public void menu() {
		int opcao = 0;

		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Digite a opcao que deseja: ");
			System.out.println("1 - Para cadastrar um aluno. ");
			System.out.println("2 - Para imprimir a lista de alunos. ");
			System.out.println("3 - Sair ");
			//Opção 3 criado para foco na funcionalidade para usuário
			opcao = ler.nextInt();

			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do aluno: ");
				/*
				Aluno aluno = new Aluno();
				aluno.setNomeAluno(ler.next());
				System.out.println(alunoController.cadastrarAluno(aluno));
				*/
				System.out.println(cadastrarAluno(new aluno(ler.next() ) ) ); // uso minimo de recursos-linhas/ utilizando o método construtor colocado no Aluno.java
				break;

			case 2:
				imprimirListaAlunos();
				break;
			case 3:
				System.out.println("Encerrando App");
				break;
			default:
				System.out.println("Opção não existe, digite 1 ou 2.");
				break;
			}
			ler.close();
		}while( opcao != 3 );
	}

//Função trazida de AlunoController.java para tornar o codigo mais intuitivo, e utilizar menos recurso (objetos intanciados para acessar as funções.)
	private static void cadastrarAluno(){
		try {
			if(validadorPessoas(listaAlunos, aluno)) {
				listaAlunos.add(aluno);
				return "Aluno " + aluno + " cadastrado com sucesso!";
			}
			return "Aluno " + aluno + " já existente!";
		}
		catch (NullPointerException e) {
			return "Aluno não pode ser nulo.";
		}
			catch (Exception e) {
			return "Houve um erro.";
		}
	}

	//Função trazida de AlunoController.java para tornar o codigo mais intuitivo, e utilizar menos recurso (objetos intanciados para acessar as funções.)
	public void imprimirListaAlunos(){
		for (Aluno aluno : listaAlunos) {
			System.out.println(aluno.getNomeAluno());
		}
	}
	//Função trazida de AlunoServisse.java para tornar o codigo mais intuitivo, e utilizar menos recurso (objetos intanciados para acessar as funções.)
	public Boolean validadorPessoas(Aluno aluno) {
		for (Aluno alunoDaVez : listaAluno) {
			if(aluno.equals(alunoDaVez)) {
				return false;
			}
		}
		return true;
	}
}
