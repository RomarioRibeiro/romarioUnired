package com.ribeiro.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Atendimento_itens implements Serializable {

	private static final long serialVersionUID = 1L;

	private Exame exame;
	private Integer codigo;
	private Convenio convenio;
	private Atendimento atendimento;
	private OffsetDateTime data_atendimento;
	private Boolean status;
	private BigDecimal preco;
	private Tanant tanant;
	private BigDecimal desconto;
	private BigDecimal total;
	private String acesso;
	
	

	public Atendimento_itens() {
		super();
	}

	public Atendimento_itens(Exame exame, Integer codigo, Convenio convenio, Atendimento atendimento,
			OffsetDateTime data_atendimento, Boolean status, BigDecimal preco, Tanant tanant, BigDecimal desconto,
			BigDecimal total, String acesso) {
		super();
		this.exame = exame;
		this.codigo = codigo;
		this.convenio = convenio;
		this.atendimento = atendimento;
		this.data_atendimento = data_atendimento;
		this.status = status;
		this.preco = preco;
		this.tanant = tanant;
		this.desconto = desconto;
		this.total = total;
		this.acesso = acesso;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public OffsetDateTime getData_atendimento() {
		return data_atendimento;
	}

	public void setData_atendimento(OffsetDateTime data_atendimento) {
		this.data_atendimento = data_atendimento;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Tanant getTanant() {
		return tanant;
	}

	public void setTanant(Tanant tanant) {
		this.tanant = tanant;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}

}
