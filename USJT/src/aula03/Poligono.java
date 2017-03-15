package aula03;

public abstract class Poligono extends Figura {
	public double area, b, bMenor, h;

	public Poligono(String tipo, double b, double h) {
		super(tipo);
		this.b = b;
		this.h = h;
	}

	// Construtor para o Trapézio
	public Poligono(String tipo, double bMenor, double b, double h) {
		super(tipo);
		this.bMenor = bMenor;
		this.b = b;
		this.h = h;
	}

	public Poligono(String tipo, double b) {
		super(tipo);
		this.b = b;
	}

	// set's
	public void seth(double h) {
		this.h = h;
	}

	public void setb(double b) {
		this.b = b;
	}

	
	// get's
	public double geth() {
		return this.h;
	}

	public double getb() {
		return this.b;
	}

	@Override
	public double area() {
		return this.area;
	}
}// end class Poligono
