package aula03;

public class Trapezio extends Poligono {

	public Trapezio(String tipo, double bMenor, double b, double h) {
		super(tipo, bMenor, b, h);
	}

	@Override
	public double area() {
		return ((b + bMenor) * h) / 2;
	}

	@Override
	public double perimetro() {
		return (b + bMenor + 2) * (Math.sqrt((h * h) + (bMenor - b) * (bMenor - b)) / 4);
	}
}// end class Trapezio
