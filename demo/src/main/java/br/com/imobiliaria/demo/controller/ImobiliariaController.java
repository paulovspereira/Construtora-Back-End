package br.com.imobiliaria.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imobiliaria.demo.controller.dto.ConstrutoraDto;
import br.com.imobiliaria.demo.form.ConstrutoraForm;
import br.com.imobiliaria.demo.model.Construtora;
import br.com.imobiliaria.demo.repository.ImobiliariaRespository;

@RestController
@RequestMapping("/imobiliaria")
public class ImobiliariaController {

	@Autowired
	private ImobiliariaRespository imobiliariaRespository;
	
	@GetMapping
	public List<ConstrutoraDto> lista(String nome){
		
		if(nome == null) {
		List<Construtora> con = imobiliariaRespository.findAll();
		return ConstrutoraDto.converter(con);
		}
		else {
			List<Construtora> con = imobiliariaRespository.findByNome(nome);
			return ConstrutoraDto.converter(con);
		}
	}
	
	@PostMapping
	public void cadastrar(@RequestBody ConstrutoraForm con) {
		Construtora construtora = con.converter(imobiliariaRespository);
		imobiliariaRespository.save(construtora);
	}
}
