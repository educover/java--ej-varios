package excepciones;

public class ParaPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Aplicacion app = new Aplicacion();
			
			Usuario u = app.login("juan", "juan123sito");
					
			System.out.println(u+ " login exitoso");
		} catch(Exception e){
			System.out.println("Servicio interrumpido " + e.getMessage());
		}

	}

}
