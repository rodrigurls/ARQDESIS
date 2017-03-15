package aula03;

public class Cilindro extends Objetos implements Volume {
	public Cilindro(String tipo, double r, double h){
		super(tipo, r, h);
	}	
	
	@Override
	public double area(){
		return 2*Math.PI*r*(r+h);
	}
	
	@Override
	public double perimetro(){
		  return Math.PI*(2*r);
	}
	
	@Override
	public double volume(){
		return Math.PI*Math.pow(r, 3)*h;
	}
	
}//end Class Cilindro
