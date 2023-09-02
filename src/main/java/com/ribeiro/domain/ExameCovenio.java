package com.ribeiro.domain;

import java.math.BigDecimal;

public class ExameCovenio {
	private Exame exame;
	private Convenio convenio;
	private Boolean status;
	private Tanant tanant;
	private BigDecimal preco;
	
	

	public ExameCovenio() {
		super();
	}

	public ExameCovenio(Exame exame, Convenio convenio, Boolean status, Tanant tanant, BigDecimal preco) {
		super();
		this.exame = exame;
		this.convenio = convenio;
		this.status = status;
		this.tanant = tanant;
		this.preco = preco;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Tanant getTanant() {
		return tanant;
	}

	public void setTanant(Tanant tanant) {
		this.tanant = tanant;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
