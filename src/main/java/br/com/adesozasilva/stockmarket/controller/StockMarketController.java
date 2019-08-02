package br.com.adesozasilva.stockmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adesozasilva.stockmarket.repositories.StockTimeSeriesRepository;

@RestController
@RequestMapping(value = "/stock-market")
public class StockMarketController {
	
    @Autowired
	private StockTimeSeriesRepository stockTimeSeriesRepository;

	@GetMapping(value = "/stock-time-series")
	public String stockTimeSeries() {
		String symbol = "OIBR4.SA";
		String function = "TIME_SERIES_DAILY";
		String outputsize = "full";
		String apikey = "D458C4GCSPW172RG";
		String stockTimeSeries = stockTimeSeriesRepository
				.timeSeriesDaily(symbol, 
						function, 
						outputsize, 
						apikey);
		return stockTimeSeries;
		
	}

}
