package br.com.imobiliaria.demo.form;

import com.sun.istack.NotNull;

import br.com.imobiliaria.demo.model.Construtora;
import br.com.imobiliaria.demo.repository.ImobiliariaRespository;

public class ConstrutoraForm {
	
	@NotNull
	private String nome;
	@NotNull
    private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Construtora converter(ImobiliariaRespository repo) {
        return new Construtora(nome,senha);
	}
	

}
