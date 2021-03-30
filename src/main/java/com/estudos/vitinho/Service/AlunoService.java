package com.estudos.vitinho.Service;

import org.springframework.stereotype.Service;

import com.estudos.vitinho.Model.Aluno;

@Service
public interface AlunoService {
	
	void criarAluno(Aluno aluno);
}
