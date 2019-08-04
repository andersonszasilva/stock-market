package br.com.adesozasilva.stockmarket.entities;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSetter;

public class StockData {

	Object metaData;
	Map<String, StockTimeSeries> timeSeries = new LinkedHashMap<>();
	
	@JsonSetter("Meta Data")
	public void setMetaData(Object metaData) {
		this.metaData = metaData;
	}
	
	@JsonSetter("Time Series (Daily)")
	public void setTimeSeries(Map<String, StockTimeSeries> timeSeries) {
		this.timeSeries = timeSeries;
	}
	
	public Object getMetaData() {
		return metaData;
	}
	
	public Map<String, StockTimeSeries> getTimeSeries() {
		return timeSeries;
	}

}
