package com.estudos.vitinho.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.estudos.vitinho.Model.Aluno;
import com.estudos.vitinho.Service.AlunoService;

@Controller
//@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@PostMapping("/createStudent")
	public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno) {
		alunoService.criarAluno(aluno);
		return new ResponseEntity<>(aluno, HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<ArrayList<Aluno>> getAlunos(){
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos = alunoService.getAlunos();
		return ResponseEntity.ok(alunos);
	}
	
	@GetMapping("/findById")
	public ResponseEntity<Optional<Aluno>> getAlunoById(@Param(value = "id") Long id){
		Optional<Aluno> aluno = alunoService.getAlunoById(id);
		return ResponseEntity.ok(aluno);
	}
	
	@PutMapping("/updateById")
	public ResponseEntity<Aluno> updateById(@RequestBody Aluno aluno){
		alunoService.updateById(aluno);
		return ResponseEntity.ok(aluno);
	}
}
