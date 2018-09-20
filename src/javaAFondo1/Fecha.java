package javaAFondo1;

public class Fecha {
	
		private int dia;
		private int mes;
		private int anio;
		
		public Fecha(String a){
			int pos1 = a.indexOf('/');
			
			int pos2 = a.lastIndexOf('/');
			
			String sDia = a.substring(0, pos1);
			dia = Integer.parseInt(sDia);
			
			String sMes = a.substring(pos1+1, pos2);
			mes = Integer.parseInt(sMes);
			
			String sAnio = a.substring(pos2+1);
			anio = Integer.parseInt(sAnio);
		}
		
		public Fecha(){
			
		}
		
		public Fecha(int d, int m, int a){
			dia = d;
			mes = m;
			anio = a;
		}
	
		
		public int getDia(){
			return dia;
		}
		
		public void setDia(int dia){
			this.dia=dia;
		}
		
		public int getMes(){
			return mes;
		}
		
		public void setMes(int mes){
			this.mes=mes;
		}
		
		public int getAnio(){
			return anio;
		}
		
		public void setAnio(int anio) {
			this.anio=anio;
		}
		
		public String toString(){
			return dia+"/"+mes+"/"+anio;
		}
		
		public boolean equals(Object a){
			Fecha o = (Fecha) a;
			
			return (dia==o.dia)&& (mes==o.mes) && (anio==o.anio);
		}
		
		private int fechaToDias(){
			return anio*360+mes*30+dia;
		}
		
		private void diasToFecha(int i){
			anio = (int)i/360;
			
			int resto = i % 360;
			
			mes = (int) resto/30;
			
			dia = resto % 30;
			
			if (dia==0){
				dia=30;
				mes--;
			}
			
			if (mes==0){
				mes=12;
				anio--;
			}
		}
		
		public void addDias(int d){
			int sum = fechaToDias() + d;
			diasToFecha(sum);
		}
		
}
