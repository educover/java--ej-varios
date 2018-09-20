package javaAFondo1;

public class circulo extends FiguraGeo {
	private int radio;
	
	public circulo(int r){
		super("Circulo");
		radio=r;
	}
	
	public double area(){
		return Math.PI*Math.pow(radio, 2);
	}

}
