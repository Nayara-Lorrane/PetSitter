package br.com.cadastros;

import java.io.Serializable;

public class Cliente extends Pet implements Serializable {
	public Cliente(String raça, String genero, String idade, String nome) {
		super(raça, genero, idade);
		this.nome = nome;
		this.cpf=cpf;
		this.endereço= endereço;
		this.telefone = telefone;
	}

	private String nome;
	private String telefone;
	private String endereço;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
