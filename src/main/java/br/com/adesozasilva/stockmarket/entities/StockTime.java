package br.com.adesozasilva.stockmarket.entities;

public class StockTime {
	
	private String date;
	private String open;
	private String high;
	private String low;
	private String close;
	private String volume;
	
//	"2019-08-01": {
//	"1. open": "137.0000",
//	"2. high": "140.9383",
//	"3. low": "136.9300",
//	"4. close": "138.0600",
//	"5. volume": "40221068"
//	},

	
	public void setDate(String date) {
		this.date = date;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public void setClose(String close) {
		this.close = close;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getDate() {
		return date;
	}
	public String getOpen() {
		return open;
	}
	public String getHigh() {
		return high;
	}
	public String getLow() {
		return low;
	}
	public String getClose() {
		return close;
	}
	public String getVolume() {
		return volume;
	}
	
	
	

}
