/**
 * 
 */
package br.com.adesozasilva.investingapi.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.adesozasilva.investingapi.model.Negociacao;
import br.com.adesozasilva.investingapi.model.NegociacaoBuilder;
import br.com.adesozasilva.investingapi.model.NegociacaoRequest;

/**
 * @author asouzsil
 *
 */
public class NegociacaoBuilderTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link br.com.adesozasilva.investingapi.model.Negociacao#()}.
	 */
	@Test
	public void test() {
		NegociacaoBuilder negociacaoBuilder = new NegociacaoBuilder();
		String papel = "CCR03";
		int quantidade = 100;
		String preco = "10";
		String precoStopGain = "11";
		String precoStopLoss = "9";
		
		Negociacao negociacao = negociacaoBuilder.adicionaPapel(papel)
		.comQuantidade(quantidade)
		.comPreco(preco)
		.adicionaStopGain(precoStopGain)
		.adicionaStopLoss(precoStopLoss)
		.build();
		
		BigDecimal total = new BigDecimal(preco).multiply(BigDecimal.valueOf(quantidade));
		assertEquals(papel, negociacao.getPapel());
		assertEquals(quantidade, negociacao.getQuantidade(), 0.1);
		assertTrue(total.compareTo(negociacao.getTotal()) == 0);
		assertTrue(new BigDecimal(precoStopGain).compareTo(negociacao.getPrecoStopGain()) == 0);
		assertTrue(new BigDecimal(precoStopLoss).compareTo(negociacao.getPrecoStopLoss()) == 0);
		
		
		
	}



}
