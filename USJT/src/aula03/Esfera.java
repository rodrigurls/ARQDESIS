package aula03;

public class Esfera extends Objetos implements Volume {
	public Esfera(String tipo, double r) {
		super(tipo, r);
	}

	@Override
	public double area() {
		return 4 * Math.PI * (Math.pow(r, 2));
	}

	@Override
	public double perimetro() {
		return Math.PI * (2 * r);
	}

	@Override
	public double volume() {
		return (4 / 3) * Math.PI * (Math.pow(r, 3));
	}
	
}// end class Esfera
