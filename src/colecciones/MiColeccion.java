package colecciones;

public class MiColeccion<T> {
	private Object datos[] = null;
	private int len = 0;
	
	public MiColeccion(int tamanoArray){
		datos = new Object[tamanoArray];
	}
	//devuelve objeto en posicion i
	public T obtener(int i){
		return (T)datos[i];
	}
	//devuelve cantidad de objetos en coleccion
	public int cantidad(){
		return len;
	}
	
	//insertar object en pos i
	public void insertar(T elm, int i){
		if (datos.length==len){
			Object aux[] = datos;
			datos = new Object[datos.length*2];
			for (int j=0; j<len; j++){
				datos[j]=aux[j];
			}
			aux=null;
		}
		for (int j=len-1; j>=i; j--){
			datos[j+1] = datos[j];
		}
		datos[i]=elm;
		len++;
	}
	
	public int buscar(T elm){
		int i = 0;
		for( ; i<len&&!datos[i].equals(elm);i++);
		
		return i<len ? i : -1;	
	}
	
	public void agregar(T elm){
		insertar(elm, len);
	}
	
	public T eliminar(int i){
		Object aux = datos[i];
		for(int j=i; j<len-1; j++){
			datos[j]=datos[j+1];
		}
		len --;
		return (T)aux;
	}
	
	public int capacidadMax(){
		return datos.length;
	}
	
	
}
