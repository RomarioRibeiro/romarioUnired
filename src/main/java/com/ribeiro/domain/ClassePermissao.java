package com.ribeiro.domain;

public class ClassePermissao {

	private Integer id;
	private String descricao;
	private Tanant tanant;
	private String permissao;
	
	

	public ClassePermissao() {
		super();
	}

	public ClassePermissao(Integer id, String descricao, Tanant tanant, String permissao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tanant = tanant;
		this.permissao = permissao;
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

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

}
