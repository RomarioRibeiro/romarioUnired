package com.ribeiro.domain;

public class Config {

	private String id_config;
	private String version;
	
	

	public Config() {
		super();
	}

	public Config(String id_config, String version) {
		super();
		this.id_config = id_config;
		this.version = version;
	}

	public String getId_config() {
		return id_config;
	}

	public void setId_config(String id_config) {
		this.id_config = id_config;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
