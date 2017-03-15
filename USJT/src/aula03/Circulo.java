package aula03;

public class Circulo extends Figura {
	public double r;

	public Circulo(String tipo, double r) {
		super(tipo);
		this.r = r;
	}

	// Set's
	public void setr(double r) {
		this.r = r;
	}

	// Get's
	public double getr() {
		return this.r;
	}

	@Override
	public double area() {
		return Math.pow(this.r, 2) * Math.PI;
	}

	@Override
	public double perimetro() {
		return Math.PI * (2 * r);
	}
}// end class Circulo
