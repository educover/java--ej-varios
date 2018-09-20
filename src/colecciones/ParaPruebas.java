package colecciones;
import java.util.*;

public class ParaPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiCola<String> mCol = new MiCola<String>();
		
		mCol.encolar("Edu");
		mCol.encolar("pepe");
		mCol.encolar("este es el 3");
		mCol.encolar("numero 4");
		
		System.out.println(mCol.desencolar());
		System.out.println(mCol.desencolar());
		System.out.println(mCol.desencolar());
		System.out.println(mCol.desencolar());
		System.out.println(mCol.desencolar());
	
	
	}

}
