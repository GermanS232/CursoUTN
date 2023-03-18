import java.util.Arrays;

public class Clase2EJ1B {

	public static void main(String[] args) {
		
		
		int [] a  = {7,2,4,};
	    int menor=0;
	    int mayor=0;
	    
	    
	    for (int i = 0 ;i <= a.length ; i++) {
	    	
	    	for(int j= 1; j<=(a.length-1);j++)
	    		
	    	{if (a[j - 1] > a[j]) {
                menor = a[j - 1];
                a[j - 1] = a[j];
                a[j] = menor;
                
               		
	    	}}}
	    	System.out.println("de menor a mayor " + Arrays.toString(a));
	    	
	    	 for (int k = 0 ; k<= a.length ; k++) {
	 	    	
	 	    	for(int l= 1; l<=(a.length-1);l++)
	 	    		
	 	    	{if (a[l - 1] < a[l]) {
	                 mayor = a[l - 1];
	                 a[l - 1] = a[l];
	                 a[l] = mayor;	
	                 
	                  }} }   	
	    	
	    	 System.out.println("de mayor a menor " + Arrays.toString(a));
	    }
	    
	    
	    
	}
		
		
		
	


