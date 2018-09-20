package javaAFondo1;

public class MiColeccion {
		private int dia;
		private int mes;
		private int anio;
		
		public MiColeccion(){}
		
		public MiColeccion(int dia, int mes, int anio){
			this.dia=dia;
			this.mes=mes;
			this.anio=anio;
		}
		
		public void setDia(int dia){
			this.dia=dia;
		}
		public int getDia(){
			return dia;
		}
		
		public void setMes(int mes){
			this.mes=mes;
		}
		public int getMes(){
			return mes;
		}
		
		public void setAnio(int anio){
			this.anio=anio;
		}
		public int getAnio(){
			return anio;
		}
		
		public String toString(){
			//return "La fecha introducida es: "+dia+"/"+mes+"/"+anio;
			return ""+a;
		}
		
		public boolean equals(MiColeccion b){
			if(dia==b.dia && mes==b.mes && anio==b.anio){
				return true;
			} else {
				return false;
			}
		}
		
		private int a;
		public MiColeccion(int a){
			this.a=a;
		}
		public int sumar (int b){
			return a=a+b;
		}
		
		
		

		
}
