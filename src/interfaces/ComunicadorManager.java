package interfaces;

public class ComunicadorManager {
	
	public static Comunicador crearComunicadorT(){
		return new TelefonoMovil();
	}
	
	public static Comunicador crearComunicadorP(){
		return new PalomaMensajera();
	}

}
