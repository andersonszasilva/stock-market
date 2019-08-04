package br.com.adesozasilva.stockmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.adesozasilva.stockmarket.entities.StockData;
import br.com.adesozasilva.stockmarket.service.StockTimeSeriesService;

@RestController
@RequestMapping(value = "/stock-market")
public class StockMarketController {
	
    @Autowired
	private StockTimeSeriesService stockTimeSeriesService;

	@GetMapping(value = "/stock-time-series", produces = MediaType.APPLICATION_JSON_VALUE)
	public StockData stockTimeSeries(@RequestParam("symbol") String symbol) {
		StockData stockData = stockTimeSeriesService.timeSeriesDaily(symbol);
		return stockData;
		
	}

}
