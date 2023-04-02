package triangulo;

public class Triangulo {

	public String calcularEq(int lado1, int lado2, int lado3) {
		if(lado1==lado2&&lado1==lado3) {
			System.out.println("Está correto é um triângulo equilátero.");
	}
		return null;
	}

	public String calcularIso(int lado1, int lado2, int lado3) {
		if(lado1==lado2&&lado1!=lado3||lado2==lado3&&lado2!=lado1||lado3==lado1&&lado3!=lado2) {
			System.out.println("Está correto é um triângulo isósceles.");
			}
		return null;
	}

	public String calcularEsc(int lado1, int lado2, int lado3) {
		if(lado1!=lado2&&lado2!=lado3&&lado3!=lado1) {
			System.out.println("Está correto é um triângulo escaleno.");
		}
		return null;
	}

}
