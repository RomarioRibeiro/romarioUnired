package com.ribeiro.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Atendimento implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer id_ficha;
	private Boolean status;
	private BigDecimal formapagamento;
	private Paciente paciente;
	private BigDecimal desconto;
	private BigDecimal valortotal;
	private OffsetDateTime datalancamento;
	private Tanant tanant;
	private Usuario usuario;
	
	

	public Atendimento() {
		super();
	}

	public Atendimento(Integer id, Integer id_ficha, Boolean status, BigDecimal formapagamento, Paciente paciente,
			BigDecimal desconto, BigDecimal valortotal, OffsetDateTime datalancamento, Tanant tanant, Usuario usuario) {
		super();
		this.id = id;
		this.id_ficha = id_ficha;
		this.status = status;
		this.formapagamento = formapagamento;
		this.paciente = paciente;
		this.desconto = desconto;
		this.valortotal = valortotal;
		this.datalancamento = datalancamento;
		this.tanant = tanant;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_ficha() {
		return id_ficha;
	}

	public void setId_ficha(Integer id_ficha) {
		this.id_ficha = id_ficha;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public BigDecimal getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(BigDecimal formapagamento) {
		this.formapagamento = formapagamento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getValortotal() {
		return valortotal;
	}

	public void setValortotal(BigDecimal valortotal) {
		this.valortotal = valortotal;
	}

	public OffsetDateTime getDatalancamento() {
		return datalancamento;
	}

	public void setDatalancamento(OffsetDateTime datalancamento) {
		this.datalancamento = datalancamento;
	}

	public Tanant getTanant() {
		return tanant;
	}

	public void setTanant(Tanant tanant) {
		this.tanant = tanant;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
