package br.com.cadastros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pet implements Serializable {
	private String ra�a;
	private String genero;
	private String idade;
	
	public Pet(String ra�a, String genero, String idade){
		this.genero = genero;
		this.ra�a= ra�a;
		this.idade = idade;
	}
	
	public String getRa�a() {
		return ra�a;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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