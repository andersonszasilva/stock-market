package br.com.adesozasilva.investingapi.model;

public class NegociacaoRequest {

	private String papel;
	private int quantidade;
	private String preco;
	private String precoStopGain;
	private String precoStopLoss;

	public NegociacaoRequest(String papel, int quantidade, String preco, String precoStopGain, String precoStopLoss) {
		this.papel = papel;
		this.quantidade = quantidade;
		this.preco = preco;
		this.precoStopGain = precoStopGain;
		this.precoStopLoss = precoStopLoss;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getPrecoStopGain() {
		return precoStopGain;
	}

	public void setPrecoStopGain(String precoStopGain) {
		this.precoStopGain = precoStopGain;
	}

	public String getPrecoStopLoss() {
		return precoStopLoss;
	}

	public void setPrecoStopLoss(String precoStopLoss) {
		this.precoStopLoss = precoStopLoss;
	}

}
