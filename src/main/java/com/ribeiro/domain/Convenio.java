package com.ribeiro.domain;

public class Convenio {

	private Integer id;
	private String descricao;
	private Tanant tanant;
	private Boolean status;
	
	

	public Convenio() {
		super();
	}

	public Convenio(Integer id, String descricao, Tanant tanant, Boolean status) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tanant = tanant;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
