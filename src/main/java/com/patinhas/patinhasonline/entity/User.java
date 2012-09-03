package com.patinhas.patinhasonline.entity;

// default package
// Generated Sep 1, 2012 3:12:57 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "patinhas")
public class User implements java.io.Serializable {

	private Integer id;
	private String userName;
	private String password;
	private String email;
	private String sexo;
	private String primeiroNome;
	private String ultimoNome;
	private Boolean ativo;

	public User() {
	}

	public User(String password, String email, String sexo,
			String primeiroNome, String ultimoNome) {
		this.password = password;
		this.email = email;
		this.sexo = sexo;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
	}

	public User(String userName, String password, String email, String sexo,
			String primeiroNome, String ultimoNome, Boolean ativo) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.sexo = sexo;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.ativo = ativo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "userName", length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "sexo", nullable = false, length = 45)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "primeiroNome", nullable = false, length = 45)
	public String getPrimeiroNome() {
		return this.primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	@Column(name = "ultimoNome", nullable = false, length = 45)
	public String getUltimoNome() {
		return this.ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	@Column(name = "ativo")
	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}