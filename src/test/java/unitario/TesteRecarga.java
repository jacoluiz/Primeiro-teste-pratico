package unitario;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.Cliente;
import models.Conta;
import models.Telefone;

public class TesteRecarga {
	private Cliente cliente;
	private Telefone telefone;
	private Conta conta;

	@Before
	public void before() {
		System.out.println("===============START TEST===============");
		// Valor em conta R$100
		conta = new Conta(100);
		// Valor em saldo R$20
		telefone = new Telefone("+55 (42) 99919-7624", 20);
		cliente = new Cliente("Jacó Luiz Chandeski", telefone, conta);
	}
	
	@Test
	public void testSaldoAtualLinha() {
		assertEquals(20, telefone.getSaldo());
	}
	
	@Test
	public void testSaldoAtualConta() {
		assertEquals(100, conta.getSaldo());
	}

	@Test
	public void testRecarregar() {
		cliente.recarregar(10);
		assertEquals(30, telefone.getSaldo());
		assertEquals(90, conta.getSaldo());
	}

	@Test
	public void testRecarregarSaldoInsuficiente() {
		cliente.recarregar(110);
		assertEquals(20, telefone.getSaldo());
		assertEquals(100, conta.getSaldo());
	}
	
	@Test
	public void testRecarregarDeValorAcimaDoValorDisponivelNaContaAposCreditarMaisSaldoEmConta() {
		cliente.recarregar(110);
		assertEquals(20, telefone.getSaldo());
		assertEquals(100, conta.getSaldo());
		
		conta.creditar(10);
		
		cliente.recarregar(110);
		assertEquals(130, telefone.getSaldo());
		assertEquals(0, conta.getSaldo());
	}
	
	@After
	public void after() {
		System.out.println("===============END TEST===============\n");
	}
}
