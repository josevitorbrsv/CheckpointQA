package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import triangulo.Triangulo;

public class TestEscaleno {

Triangulo tri = new Triangulo();
@Test
public void testEscalenos() {
int lado1 = 2;
int lado2 = 9;
int lado3 = 4;
String resultado = tri.calcularEsc(lado1, lado2, lado3);
assertEquals("escaleno",resultado);
}
}