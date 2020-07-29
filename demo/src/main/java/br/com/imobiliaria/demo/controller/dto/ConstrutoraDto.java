package br.com.imobiliaria.demo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.imobiliaria.demo.model.Construtora;

public class ConstrutoraDto {

	private Long id;
	private String nome;
	private String foto;
	private String email;
	private String senha;
	private String company;
	private int idade;
	private String budget;
	
	public ConstrutoraDto(Construtora con) {
		
		this.id = con.getId();
		this.setFoto(con.getFoto());
		this.nome = con.getNome();
		this.email = con.getEmail();
		this.senha = con.getSenha();
		this.company = con.getCompany();
		this.idade = con.getIdade();
		this.budget = con.getBudget();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public static List<ConstrutoraDto> converter(List<Construtora> asList) {
				return asList.stream().map(ConstrutoraDto::new).collect(Collectors.toList());
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
