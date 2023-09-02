package com.ribeiro.domain;

public class Permissao {
	private Integer id;
	private String descricao;
	private ClassePermissao classePermissao;
	
	
	
	public Permissao() {
		
	}

	public Permissao(Integer id, String descricao, ClassePermissao classePermissao) {
		this.id = id;
		this.descricao = descricao;
		this.classePermissao = classePermissao;
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

	public ClassePermissao getClassePermissao() {
		return classePermissao;
	}

	public void setClassePermissao(ClassePermissao classePermissao) {
		this.classePermissao = classePermissao;
	}

}
