package javaAFondo1;

public abstract class FiguraGeo {
	
	private String nombre;
	
	public FiguraGeo(String n){
		nombre = n;
	}
	
	public abstract double area();
	
	public String toString(){
		return nombre +" area: " + area();
	}
	
	public static double areaPromedio(FiguraGeo arr[]){
		int sum=0;
		for (int i=0; i<arr.length; i++){
			sum += arr[i].area();
		}
		return sum/arr.length;
	}

}
