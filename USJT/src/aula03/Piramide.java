package aula03;

public class Piramide extends Objetos implements Volume {

	public Piramide(String tipo, double h, double largura, double comprimento) {
		super(tipo, h, largura, comprimento);
	}

	@Override
	public double area() {
		return (largura * largura) + (4 * (largura * h) / 2);
	}

	@Override
	public double perimetro() {
		return 4 * largura;
	}

	@Override
	public double volume() {
		return (comprimento*largura*h)/3;
	}
	
}// end class Piramide
