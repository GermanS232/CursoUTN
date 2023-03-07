
public class Clase2EJ1C {

	public static void main(String[] args) {
		
		 int b[] = new int[] {5,3,12,2,7,4};
	        int suma = 0;
	        int num = 5;
	        
	        
	        
	        for (int i = 0; i < b.length; i++) {
	        	if(b[i]>num) {
	        		suma=suma + b[i];
	        	}
	            
	        }
	        System.out.println("La suma es  " + suma);	}
	 
	}