package aula03;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo("Círculo", 2.0));
		figuras.add(new Esfera("Esfera", 2.0));
		figuras.add(new Cilindro("Cilindro", 2.0, 4.0));
		figuras.add(new Triangulo("Triângulo", 2, 4));
		figuras.add(new Piramide("Piramide", 4, 2, 2));
		figuras.add(new Quadrado("Quadrado", 4));
		figuras.add(new Cubo("Cubo", 4, 4, 4));
		figuras.add(new Retangulo("Retângulo", 4, 8));
		figuras.add(new Losango("Losango", 5, 7)); 
		figuras.add(new	Trapezio("Trapézio", 2, 5, 7));
		for (Figura fig : figuras) {
			System.out.println(fig.getTipo());
			System.out.println("Área: " + fig.area());
			if (fig instanceof Diagonal) {
				System.out.println("Diagonal: " + ((Diagonal) fig).diagonal());
			}
			System.out.println("Perímetro: " + fig.perimetro());
			if (fig instanceof Volume) {
				System.out.println("Volume: " + ((Volume) fig).volume());
			}
			System.out.println("\n");
		} // end for
		
	}// end main
}// end class Geometria
