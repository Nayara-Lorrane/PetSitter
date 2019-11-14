package br.com.cadastros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pet implements Serializable {
	private String raça;
	private String genero;
	private String idade;
	
	public Pet(String raça, String genero, String idade){
		this.genero = genero;
		this.raça= raça;
		this.idade = idade;
	}
	
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
}