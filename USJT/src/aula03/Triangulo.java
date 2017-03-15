package aula03;

public class Triangulo extends Poligono {

	public Triangulo(String tipo, double b, double h) {
		super(tipo, b, h);
	}

	@Override
	public double area() {
		return (b * h) / 2;
	}

	@Override
	public double perimetro() {
		return b + h + (Math.pow(Math.pow(b, 2) + Math.pow(h, 2), 0.5));
	}

	
}// end class