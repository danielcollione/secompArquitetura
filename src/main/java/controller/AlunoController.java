package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arquitetura.service.AlunoService;

import model.Aluno;
/*
@Controller
foi parar no AlunoView.java


	@Autowired
	private AlunoService alunoService;

	private ArrayList<Aluno> listaAlunos = new ArrayList<>();

	public String cadastrarAluno(Aluno aluno) {
		try {
			if(alunoService.validadorPessoas(listaAlunos, aluno)) {
				listaAlunos.add(aluno);
				return "Aluno " + aluno + " cadastrado com sucesso!";
			}
			return "Aluno " + aluno + " já existente!";
		} catch (NullPointerException e) {
			return "Aluno não pode ser nulo.";

		} catch (Exception e) {
			return "Houve um erro.";
		}
	}

	public void imprimirListaAlunos(){
		for (Aluno aluno : listaAlunos) {
			System.out.println(aluno.getNomeAluno());
		}
	}
}
	*/
