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
}
