package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.TimeFutebol;
import br.edu.fatecfranca.model.TimeFutebolRepository;

@RestController
@RequestMapping("/api/timefutebol")
public class TimeFutebolController {
	
	// conceito padrão do Spring
	// injeção de dependência
	// fazer um objeto executar métodos sem ser instanciado
	@Autowired
	TimeFutebolRepository injecao;
	
	@GetMapping // select no banco de dados
	public List<TimeFutebol> getTimes(){
		return injecao.findAll();
	}
	
	@PostMapping // inserir no banco de dados
	public TimeFutebol addTime(@RequestBody TimeFutebol timeFutebol) {
		return injecao.save(timeFutebol);
	}
	
	@DeleteMapping("/{id}") // delete no banco de dados
	public String removeTime(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Remoção realizada com sucesso";
	}
	
	
}
