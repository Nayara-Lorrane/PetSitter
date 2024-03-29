package br.com.cadastros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PetSitter implements Serializable {
	private String nome;
	private String telefone;
	private String enderešo;
	private String cpf;
	
	public PetSitter(String nome, String cpf, String telefone, String enderešo){
		this.nome = nome;
		this.cpf = cpf;
		this.enderešo = enderešo;
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
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
