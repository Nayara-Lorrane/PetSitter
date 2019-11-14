package br.com.cadastros;

import java.io.Serializable;

public class Cliente extends Pet implements Serializable {
	public Cliente(String ra�a, String genero, String idade, String nome) {
		super(ra�a, genero, idade);
		this.nome = nome;
		this.cpf=cpf;
		this.endere�o= endere�o;
		this.telefone = telefone;
	}

	private String nome;
	private String telefone;
	private String endere�o;
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
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
