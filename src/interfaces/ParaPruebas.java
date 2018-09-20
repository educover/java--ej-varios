package interfaces;

public class ParaPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno a1 = new Alumno("Edu", 19, 2);
		Alumno a2 = new Alumno("Maria", 16, 5);
		
		//int a = a1.compareTo(new Alumno("pqwe", 20, 5));
		
		System.out.println(a1);
		System.out.println(a2);
		
		
		if (0==a1.compareTo(a2)){
			System.out.println("Los alumnos tienen la misma edad");
		} else if (0<a1.compareTo(a2)){
			System.out.println("El alumno "+a1.getNombre()+" es mayor " + a1.getEdad() +" > "+ a2.getEdad());
		} else if (0>a1.compareTo(a2)){
			System.out.println("El alumno "+a2.getNombre()+" es mayor " + a1.getEdad() +" < "+ a2.getEdad());
		}
	}

}
