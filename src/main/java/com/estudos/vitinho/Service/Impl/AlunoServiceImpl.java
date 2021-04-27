package com.estudos.vitinho.Service.Impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.estudos.vitinho.Model.Aluno;
import com.estudos.vitinho.Service.AlunoService;
import com.estudos.vitinho.repository.AlunoRepository;

import antlr.collections.List;

@Component("AlunoController")
public class AlunoServiceImpl  implements AlunoService{
	
	@Autowired
	AlunoRepository alunoRepository;
	
	public void criarAluno(Aluno aluno) {
		alunoRepository.save(aluno);
	}
	
	public ArrayList<Aluno> getAlunos(){
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos = (ArrayList<Aluno>) alunoRepository.findAll();
		return alunos;
	}
	
	public Optional<Aluno> getAlunoById(Long id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		return aluno;
	}
	
	public Aluno updateById(Aluno novoAluno){
		Optional<Aluno> aluno = alunoRepository.findById(novoAluno.getId());
		if(aluno!= null) {
			alunoRepository.save(novoAluno);
		}
		return novoAluno;
	}
}
