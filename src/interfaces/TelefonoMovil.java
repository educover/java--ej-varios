package interfaces;

public class TelefonoMovil implements Comunicador{

	@Override
	public String enviarMensaje() {
		// TODO Auto-generated method stub
		return "Estoy enviando un mensaje con el telefono movil";
	}
	
	public String tipoDato(){
		return "Esto es el movil";
	}

}
