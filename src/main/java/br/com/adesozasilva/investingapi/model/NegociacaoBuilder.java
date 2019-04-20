package br.com.adesozasilva.investingapi.model;

import java.math.BigDecimal;

import br.com.adesozasilva.investingapi.model.Negociacao;
import br.com.adesozasilva.investingapi.model.Stop;
import br.com.adesozasilva.investingapi.model.StopType;

public class NegociacaoBuilder {
	
	private String papel;
	private Integer quantidade;
	private BigDecimal preco;
	private BigDecimal precoStopGain;
	private BigDecimal precoStopLoss;

	public NegociacaoBuilder adicionaPapel(String papel) {
		this.papel = papel;
		return this;
	}

	public NegociacaoBuilder comQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
		return this;
	}

	public NegociacaoBuilder comPreco(String preco) {
		this.preco = new BigDecimal(preco);
		return this;
	}

	public NegociacaoBuilder adicionaStopGain(String precoStopGain) {
		this.precoStopGain = new BigDecimal(precoStopGain);
		return this;
	}
	
	public NegociacaoBuilder adicionaStopLoss(String precoStopLoss) {
		this.precoStopLoss = new BigDecimal(precoStopLoss);
		return this;
	}
	
	public Negociacao build() {
		Negociacao negociacao = new Negociacao(papel, quantidade, preco);
		Stop stopGain = new Stop(quantidade, precoStopGain, negociacao, StopType.GAIN);
		Stop stopLoss = new Stop(quantidade, precoStopLoss, negociacao, StopType.LOSS);
		negociacao.setStopGain(stopGain);
		negociacao.setStopLoss(stopLoss);
		
		return negociacao;
	}



}
