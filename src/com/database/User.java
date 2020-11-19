package com.database;

import java.sql.*;

public class User {
	private String id;
	private String nome;
	private String sobrenome;
	private String rg;
	private String cpf;
	private String email;
	private String senha;
	private String telefone;
	private String endereço;
	private String complemento;
	private int numero;
	private String cidade;
	private String estado;
	private Date datacriacao;
	private Date dataalt;
	private char status;
	private static int size = 16;
	
	public String[] getAll(){
		String[] a = {id,  nome, sobrenome, rg, cpf, email, senha, telefone, endereço, complemento, Integer.toString(numero), cidade, estado, datacriacao.toString(), dataalt.toString(), String.valueOf(status)};
		return a;
	}
	
	public void setAll(String[] a) {
		this.id = a[0];
		this.nome = a[1];
		this.sobrenome = a[2];
		this.rg = a[3];
		this.cpf = a[4];
		this.email = a[5];
		this.senha = a[6];
		this.telefone = a[7];
		this.endereço = a[8];
		this.complemento = a[9];
		this.numero = Integer.parseInt(a[10]);
		this.cidade = a[11];
		this.estado = a[12];
		this.datacriacao = Date.valueOf(a[13]);
		this.dataalt = Date.valueOf(a[14]);
		this.status = a[15].charAt(0);
	}
	
	public int getSize() {
		return size;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(Date datacriacao) {
		this.datacriacao = datacriacao;
	}
	public Date getDataalt() {
		return dataalt;
	}
	public void setDataalt(Date dataalt) {
		this.dataalt = dataalt;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
}
