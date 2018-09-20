package javaAFondo1;

public class HoraAmpliada extends Hora {
	
	private String nombre;
	
	public HoraAmpliada(int dia, int mes, int anio, int hora, int min, int seg, String nombre){
		super(dia, mes, anio, hora, min, seg);
		this.nombre=nombre;
	}
	
	public String toString(){
		return super.toString() + " nombre: " + nombre;
	}
	
	public static int sumar(int a, int b){
		return a+b;
	}

}
