package br.com.adesozasilva.investingapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.adesozasilva.investingapi.model.NegociacaoRequest;
import br.com.adesozasilva.investingapi.service.NegociacaoService;

@RestController
public class NegociacaoController {
	
	private NegociacaoService negociacaoService;

	@PostMapping(value = "/negociacoes")
	public void salvaNegociacoes(@RequestBody NegociacaoRequest negociacaoRequest) {
		negociacaoService.executa(negociacaoRequest);
	}

}
