package br.com.adesozasilva.stockmarket.repositories;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "stockTimeSeries", url = "https://www.alphavantage.co")
public interface StockTimeSeriesRepository {

	@GetMapping(value = "/query")
	String timeSeriesDaily(
			@RequestParam(value = "symbol") String symbol,
			@RequestParam(value = "function") String function,
			@RequestParam(value = "outputsize") String outputsize,
			@RequestParam(value = "apikey") String apikey);
	

}
