package javaAFondo1;

public class Circulo2 implements PrimIntf {
	
	private int radio;
	
	public Circulo2(int a){
		radio=a;
	}
	
	

	@Override
	public int area() {
		// TODO Auto-generated method stub
		
		double a = Math.PI*Math.pow(radio, 2);
		
		return (int)a;
	}
	
	public String toString(){
		return "El area de la circunferencia es: "+area();
	}

}
