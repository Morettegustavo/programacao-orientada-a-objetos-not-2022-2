package br.edu.fatecfranca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity // anotaçao que decora a classe
@Table(name="TimeFutebol") // anotacao que decora a classe
public class TimeFutebol {
	// define a chave primária com auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@Column(name="nome")
	private String nome;
	
	
	@Column(name="qtdeJogadores")
	private int qtdeJogadores;
	
	@Column(name="nota")
	private float nota;
	
	public TimeFutebol() {
		
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdeJogadores() {
		return qtdeJogadores;
	}

	public void setQtdeJogadores(int qtdeJogadores) {
		this.qtdeJogadores = qtdeJogadores;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
}
