package br.com.imobiliaria.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imobiliaria.demo.model.Construtora;

public interface ImobiliariaRespository extends JpaRepository<Construtora, Long> {

	List<Construtora> findByNome(String nome);

}
