package com.estudos.vitinho.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.estudos.vitinho.Model.Aluno;

@Service
public interface AlunoService {
	
	void criarAluno(Aluno aluno);
	
	public ArrayList<Aluno> getAlunos();
	
	public Optional<Aluno> getAlunoById(Long id);
	
	public Aluno updateById(Aluno novoAluno);
}
