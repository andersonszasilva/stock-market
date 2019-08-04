package br.com.adesozasilva.stockmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.adesozasilva.stockmarket.entities.StockData;
import br.com.adesozasilva.stockmarket.repositories.StockTimeSeriesRepository;

@Component
public class StockTimeSeriesService {
	
	@Autowired
	private StockTimeSeriesRepository stockTimeSeriesRepository;

	public StockData timeSeriesDaily(String symbol) {
		String function = "TIME_SERIES_DAILY";
		String outputsize = "full";
		String apikey = "D458C4GCSPW172RG";
		String formatedSymbol = symbol+".SA";
		StockData stockData = stockTimeSeriesRepository.timeSeriesDaily(formatedSymbol, 
				function, 
				outputsize, 
				apikey).getBody();
		
		return stockData;
	}

}
