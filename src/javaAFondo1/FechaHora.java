package javaAFondo1;

public class FechaHora extends FechaAmpliada {
	
	private int hora;
	private int minutos;
	private int segundos;
	
	public FechaHora(String sFecha, int hora, int min, int seg){
		super(sFecha);
		this.hora=hora;
		this.minutos=min;
		this.segundos=seg;
	}
	
	public String toString(){
		return super.toString() + " (" + (hora+":"+minutos+":"+segundos)+ ")";
	}

}
