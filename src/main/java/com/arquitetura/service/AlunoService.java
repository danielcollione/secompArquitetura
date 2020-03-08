package com.arquitetura.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import model.Aluno;

@Service
public class AlunoService {
	
	public Boolean validadorPessoas(ArrayList<Aluno> listaAluno, Aluno aluno) {
	
		for (Aluno alunoDaVez : listaAluno) {
			
			if(aluno.equals(alunoDaVez)) {
				return false;
			}
		}
		return true;
	}

}
