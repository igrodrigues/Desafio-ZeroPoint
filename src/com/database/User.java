package com.database;


public class User {
	private String id;
	private String nome;
	private String sobrenome;
	private String rg;
	private String cpf;
	private String email;
	private String senha;
	private String telefone;
	private String endereco;
	private String complemento;
	private String numero;
	private String cidade;
	private String estado;
	private String datacriacao;
	private String dataalt;
	private String status;
	private static int size = 16;
	
	public String[] getAll(){
		String[] a = {id,  nome, sobrenome, rg, cpf, email, senha, telefone, endereco, complemento, numero, cidade, estado, datacriacao.toString(), dataalt.toString(), String.valueOf(status)};
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
		this.endereco = a[8];
		this.complemento = a[9];
		this.numero = a[10];
		this.cidade = a[11];
		this.estado = a[12];
		this.datacriacao = a[13];
		this.dataalt = a[14];
		this.status = a[15];
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
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
	public String getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(String datacriacao) {
		this.datacriacao = datacriacao;
	}
	public String getDataalt() {
		return dataalt;
	}
	public void setDataalt(String dataalt) {
		this.dataalt = dataalt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
