package com.estudos.vitinho.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Aluno")
public class Aluno {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="ra")
	private String ra;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="Idade")
	private int idade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Aluno(Long id, String nome, String ra, String cpf, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.ra = ra;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
