package interfaces;

public class Alumno implements Comparable<Alumno> {
	
	private String nombre;
	private int edad;
	private double notaPromedio;
	
	public Alumno(String nom, int edad, double np){
		nombre=nom;
		this.edad=edad;
		notaPromedio=np;
	}

	@Override
	public int compareTo(Alumno otroA) {
		// TODO Auto-generated method stub
		return this.edad-otroA.edad;
	}
	
	public String toString(){
		return "El nombre del alumno es: "+nombre+" su edad: "+edad+" y su nota promedio: "+notaPromedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaPromedio() {
		return notaPromedio;
	}

	public void setNotaPromedio(double notaPromedio) {
		this.notaPromedio = notaPromedio;
	}

}
