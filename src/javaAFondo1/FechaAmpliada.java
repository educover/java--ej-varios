package javaAFondo1;

public class FechaAmpliada extends Fecha {
	
		public FechaAmpliada(String f){
			super(f);
		}
		
		public FechaAmpliada(){
			super();
		}
		
		public FechaAmpliada(int dia, int mes, int anio){
			super(dia, mes, anio);
		}
		


		private static String meses[]={"Enero"
										,"Febrero"
										,"Marzo"
										,"Abril"
										,"Mayo"
										,"Junio"
										,"Julio"
										,"Agosto"
										,"Septiembre"
										,"Octubre"
										,"Noviembre"
										,"Diciembre"
										
		};
		
		public String toString(){
			return getDia()+" de "+ meses[getMes()-1]+ " de "+ getAnio();
		}
}
