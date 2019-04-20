package br.com.adesozasilva.investingapi.model;

import java.math.BigDecimal;

public class Negociacao {
	
	private TipoNegociacao tipo = TipoNegociacao.COMPRA;
	private String papel;
	private Integer quantidade;
	private BigDecimal preco;
	private BigDecimal total;
	private Stop stopGain;
	private Stop stopLoss;
	
	protected Negociacao(String papel, Integer quantidade, BigDecimal preco) {
		this.papel = papel;
		this.quantidade = quantidade;
		this.preco = preco;
		this.total = preco.multiply(BigDecimal.valueOf(quantidade));
	}
	
	public TipoNegociacao getTipo() {
		return tipo;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public String getPapel() {
		return papel;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setStopGain(Stop stopGain) {
		this.stopGain = stopGain;
	}
	
	public void setStopLoss(Stop stopLoss) {
		this.stopLoss = stopLoss;
	}
	

	public BigDecimal getPrecoStopGain() {
		return this.stopGain.getPreco();
	}
	
	public BigDecimal getPrecoStopLoss() {
		return this.stopLoss.getPreco();
	}

}
