package com.estudos.vitinho.Service.Impl;

import org.springframework.stereotype.Component;

import com.estudos.vitinho.Model.Aluno;
import com.estudos.vitinho.Service.AlunoService;

@Component("AlunoController")
public class AlunoServiceImpl  implements AlunoService{
	
	public void criarAluno(Aluno aluno) {
		System.out.println("epa");
	}
}
