package com.ribeiro.domain;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Patrimonio {

	private Integer id;
	private String descricao;
	private OffsetDateTime dataaquisicao;
	private BigDecimal valor;
	private Tanant tanant;
	private Empresa empresa;
	private Boolean status;

	public Patrimonio() {
	}

	public Patrimonio(Integer id, String descricao, OffsetDateTime dataaquisicao, BigDecimal valor, Tanant tanant,
			Empresa empresa, Boolean status) {
		this.id = id;
		this.descricao = descricao;
		this.dataaquisicao = dataaquisicao;
		this.valor = valor;
		this.tanant = tanant;
		this.empresa = empresa;
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

	public OffsetDateTime getDataaquisicao() {
		return dataaquisicao;
	}

	public void setDataaquisicao(OffsetDateTime dataaquisicao) {
		this.dataaquisicao = dataaquisicao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Tanant getTanant() {
		return tanant;
	}

	public void setTanant(Tanant tanant) {
		this.tanant = tanant;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
