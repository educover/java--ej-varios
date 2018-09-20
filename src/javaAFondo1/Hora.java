package javaAFondo1;

public class Hora extends MiColeccion{
	private int hora;
	private int min;
	private int seg;
	
	private static String dias[]={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
	
	private static String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", 
			"Noviembre", "Diciembre"
	};
	
	public Hora(){}
	
	public Hora(int dia, int mes, int anio, int hora, int min, int seg){
		super(dia, mes, anio);
		this.hora=hora;
		this.min=min;
		this.seg=seg;
	}
	
	
	
	public String toString(){
		return dias[getDia()-1] + " de " + meses[getMes()-1] + " de "+ getAnio() +" y la hora es: "+hora+":"+min+":"+seg;
	}
	
	

}
