package aula03;

public class Losango extends Poligono {
	public Losango(String tipo, double b, double h) {
		super(tipo, b, h);
	}

	@Override
	public double area() {
		return (b * h) / 2;
	}

	@Override
	public double perimetro() {
		double hipotenusa = Math.sqrt(Math.pow(b / 2, 2) + Math.pow(h / 2, 2));
		return hipotenusa * 4;
	}

}// end class Losango
