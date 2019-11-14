package br.com.cadastros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PetSitter implements Serializable {
	private String nome;
	private String telefone;
	private String endere�o;
	private String cpf;
	
	public PetSitter(String nome, String cpf, String telefone, String endere�o){
		this.nome = nome;
		this.cpf = cpf;
		this.endere�o = endere�o;
		this.telefone = telefone;
	} 
	
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
