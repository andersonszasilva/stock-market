package br.com.adesozasilva.stockmarket.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockMarketController {
	

	@PostMapping(value = "/stock")
	public void searchStock() {
		
	}

}
