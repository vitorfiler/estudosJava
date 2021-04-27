package com.estudos.vitinho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.vitinho.Model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
//	List<Aluno> findById(String id);
}
	