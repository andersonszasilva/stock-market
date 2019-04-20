package br.com.adesozasilva.investingapi.model;

import java.math.BigDecimal;

public class Stop {
	
	private Integer quantidade;
	private BigDecimal preco;
	private BigDecimal total;
	private BigDecimal resultado;
	private StopType tipo;
	
	public Stop(Integer quantidade, BigDecimal preco, Negociacao negociacao, StopType tipo) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.tipo = tipo;
		this.total = preco.multiply(BigDecimal.valueOf(quantidade));
		this.resultado = total.subtract(negociacao.getTotal());
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public BigDecimal getResultado() {
		return resultado;
	}
	
	public StopType getTipo() {
		return tipo;
	}

}
