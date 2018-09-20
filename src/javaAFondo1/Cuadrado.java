package javaAFondo1;

public class Cuadrado implements PrimIntf{
	
	private int area;
	
	public Cuadrado(int a){
		area=a;
	}
	
	public void setArea(int area){
		this.area=area;
	}

	public int getArea(){
		return area;
	}
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return area*area;
	}
	
	public String toString(){
		return "El area del cuadrado es: "+area();
	}

}
