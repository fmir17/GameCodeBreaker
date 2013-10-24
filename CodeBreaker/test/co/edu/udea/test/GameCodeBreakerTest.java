package co.edu.udea.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.GameCodeBreaker;

public class GameCodeBreakerTest {

	@Test
	public void testTodosCoinciden(){
		GameCodeBreaker game = new GameCodeBreaker();
		String valor = game.validar("1357");
		assertEquals("XXXX", valor);
		
	}
	
	@Test
	public void testUnoCoincide(){
		GameCodeBreaker game = new GameCodeBreaker();
		String valor = game.validar("1468");
		assertEquals("X", valor);
		
	}
	
	@Test
	public void testTresCoinciden(){
		GameCodeBreaker game = new GameCodeBreaker();
		String valor = game.validar("1857");
		assertEquals("XXX", valor);
		
	}
	
	@Test
	public void testUnoDesubicado(){
		GameCodeBreaker game = new GameCodeBreaker();
		String valor = game.validar("9841");
		assertEquals("_", valor);
		
	}
	@Test
	public void testDosCoincideUnoDesubicado(){
		GameCodeBreaker game = new GameCodeBreaker();
		String valor = game.validar("9351");
		assertEquals("XX_", valor);
		
	}
	
	@Test
	public void testDosCoincideDosDescubicado(){
		GameCodeBreaker game = new GameCodeBreaker();
		String valor = game.validar("7351");
		assertEquals("XX__", valor);
		
		
	}
	
	@Test
	public void testTodosdesubicados(){
		GameCodeBreaker game = new GameCodeBreaker();
		String valor = game.validar("7135");
		assertEquals("____", valor);
		
		
	}
	
	@Test
	public void testNingunoCoincide(){
		GameCodeBreaker game = new GameCodeBreaker();
		String valor = game.validar("2468");
		assertEquals("", valor);
		
		
	}
	
	

}