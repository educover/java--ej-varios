package javaAFondo1;

public class TestGC {
	
	private static int cont = 0;
	
	public TestGC(){
		cont++;
		System.out.println(cont);
	}
	
	public void finalize(){
		cont--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			new TestGC();
		}
	}

}
