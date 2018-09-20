package javaAFondo1;

public class rectangulo extends FiguraGeo{
	private int altura;
	private int base;
	
	public rectangulo (int a, int b){
		super("Rectangulo");
		altura = a;
		base = b;
	}
	
	public double area(){
		return altura*base;
	}
	
	

}
