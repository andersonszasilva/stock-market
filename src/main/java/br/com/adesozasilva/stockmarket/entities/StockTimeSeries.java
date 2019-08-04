package br.com.adesozasilva.stockmarket.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StockTimeSeries {
	
	private String open;
	private String high;
	private String low;
	private String close;
	private String volume;
	
	@JsonSetter("1. open")	
	public void setOpen(String open) {
		this.open = open;
	}
	@JsonSetter("2. high")
	public void setHigh(String high) {
		this.high = high;
	}
	@JsonSetter("3. low")
	public void setLow(String low) {
		this.low = low;
	}
	@JsonSetter("4. close")
	public void setClose(String close) {
		this.close = close;
	}
	@JsonSetter("5. volume")
	public void setVolume(String volume) {
		this.volume = volume;
	}
	@JsonGetter("open")
	public String getOpen() {
		return open;
	}
	@JsonGetter("high")
	public String getHigh() {
		return high;
	}
	@JsonGetter("low")
	public String getLow() {
		return low;
	}
	@JsonGetter("close")
	public String getClose() {
		return close;
	}
	@JsonGetter("volume")
	public String getVolume() {
		return volume;
	}

}
