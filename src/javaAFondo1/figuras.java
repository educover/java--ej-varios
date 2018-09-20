package javaAFondo1;

public class figuras {
	
	public void finalize(){
		System.out.println("La variable quedo desreferenciada");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*HoraAmpliada h1 = new HoraAmpliada("Edu");
			System.out.println(h1);*/
			
			System.out.println(HoraAmpliada.sumar(4, 5));
			
			MiColeccion a1 = new MiColeccion(2);
			a1.sumar(2);
			System.out.println(a1);
			a1 = new MiColeccion(4);
			a1.sumar(5);
			System.out.println(a1);
		
	}

}
