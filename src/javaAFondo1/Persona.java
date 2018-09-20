package javaAFondo1;

public class Persona {
	
	private String nombre;
	private String dni;
	private  int contador=0;
	
	public Persona(String nom, String dni){
		
		nombre=nom;
		this.dni=dni;
	}
	
	public String toString(){
		contador++;
		return "nombre " +nombre+ " dni " +dni+" || "+contador;
	}

}
