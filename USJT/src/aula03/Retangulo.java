package aula03;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(String tipo, double b, double h) {
		super(tipo, b, h);
	}

	@Override
	public double area() {
		return b * h;
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
	}

	@Override
	public double perimetro() {
		return (b * 2) + (h * 2);
	}
	
}// end class Retangulo
