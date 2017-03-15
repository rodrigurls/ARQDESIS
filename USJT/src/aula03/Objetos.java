package aula03;

public abstract class Objetos extends Figura {
	double area, h, largura, comprimento, r;

	public Objetos(String tipo, double r) {
		super(tipo);
		this.r = r;
	}

	public Objetos(String tipo, double r, double h) {
		super(tipo);
		this.r = r;
		this.h = h;
	}

	public Objetos(String tipo, double h, double largura, double comprimento) {
		super(tipo);
		this.h = h;
		this.largura = largura;
		this.comprimento = comprimento;
	}

	@Override
	public double area() {
		return this.area;
	}
	

	public abstract double volume();
}// end abstract class Objetos
