package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import triangulo.Triangulo;

public class TestIsosceles {

Triangulo tri = new Triangulo();
@Test
public void testIsosceles() {
int lado1 = 2;
int lado2 = 9;
int lado3 = 2;
String resultado = tri.calcularIso(lado1, lado2, lado3);
assertEquals("isosceles",resultado);
}
}