package com.estudos.vitinho.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estudos.vitinho.Model.Aluno;
import com.estudos.vitinho.Service.AlunoService;

@Controller
//@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@PostMapping("/criar")
	public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno) {
		alunoService.criarAluno(aluno);
		return new ResponseEntity<>(aluno, HttpStatus.OK);
	}
	
	@RequestMapping("/visualizar")
	public ResponseEntity<Aluno> getAlunos(){
		Aluno aluno = new Aluno(null, null, null, null, 0);
		return new ResponseEntity<>(aluno, HttpStatus.OK);
	}
}
