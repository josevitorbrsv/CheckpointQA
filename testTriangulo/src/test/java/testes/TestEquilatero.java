package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import triangulo.Triangulo;

public class TestEquilatero {

	Triangulo tri = new Triangulo();
	@Test
	public void testeEquilatero() {
		int lado1 = 2;
		int lado2 = 2;
		int lado3 = 2;
		String resultado = tri.calcularEq(lado1, lado2, lado3);
		assertEquals("equilatero",resultado);
	}

}
