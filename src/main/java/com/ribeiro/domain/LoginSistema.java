package com.ribeiro.domain;

import java.time.OffsetDateTime;

public class LoginSistema {

	private Integer id;
	private String comando;
	private OffsetDateTime datagravacao;
	private String email_usuario;
	private Atendimento atendimento;
	private Exame exame;
	private Convenio convenio;
	private Paciente paciente;
	private Permissao permissao;
	private Tanant tanant;
	private Usuario usuario;
	private Patrimonio patrimonio;
	private Boolean status;
	
	

	public LoginSistema() {
	}

	public LoginSistema(Integer id, String comando, OffsetDateTime datagravacao, String email_usuario,
			Atendimento atendimento, Exame exame, Convenio convenio, Paciente paciente, Permissao permissao,
			Tanant tanant, Usuario usuario, Patrimonio patrimonio, Boolean status) {
		this.id = id;
		this.comando = comando;
		this.datagravacao = datagravacao;
		this.email_usuario = email_usuario;
		this.atendimento = atendimento;
		this.exame = exame;
		this.convenio = convenio;
		this.paciente = paciente;
		this.permissao = permissao;
		this.tanant = tanant;
		this.usuario = usuario;
		this.patrimonio = patrimonio;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	public OffsetDateTime getDatagravacao() {
		return datagravacao;
	}

	public void setDatagravacao(OffsetDateTime datagravacao) {
		this.datagravacao = datagravacao;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
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

	public Patrimonio getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(Patrimonio patrimonio) {
		this.patrimonio = patrimonio;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
