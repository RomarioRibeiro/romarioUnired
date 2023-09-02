package com.ribeiro.domain;

import java.time.OffsetDateTime;

public class Paciente {
	private Integer id;
	private String nome;
	private OffsetDateTime datanasc;
	private String sexo;
	private String telefone;
	private String cpf;
	private Tanant tanant;
	private Boolean status;

	
	
	public Paciente() {
		
	}

	public Paciente(Integer id, String nome, OffsetDateTime datanasc, String sexo, String telefone, String cpf,
			Tanant tanant, Boolean status) {
		this.id = id;
		this.nome = nome;
		this.datanasc = datanasc;
		this.sexo = sexo;
		this.telefone = telefone;
		this.cpf = cpf;
		this.tanant = tanant;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public OffsetDateTime getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(OffsetDateTime datanasc) {
		this.datanasc = datanasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Tanant getTanant() {
		return tanant;
	}

	public void setTanant(Tanant tanant) {
		this.tanant = tanant;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
