package aula03;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(String tipo, double b) {
		super(tipo, b);
	}

	@Override
	public double area() {
		return Math.pow(b, 2);
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(b, 2) + Math.pow(b, 2));
	}

	@Override
	public double perimetro() {
		return (b * 4);
	}

	
}// end class
