import java.util.Arrays;
import java.util.Scanner;

public class CLASE4EJ1B {

	public static void main(String[] args) {
    int [] a  = new int[3];
	char letra;
		 Scanner sc = new Scanner(System.in);
		
	    int menor=0;
	    int mayor=0;
	    
	    
	    System.out.println("Ingrese tres numeros:\n ");  
	    
	    for(int k=0; k<a.length; k++)  
	    {  
  
	    a[k]=sc.nextInt();  
	    }  
	    System.out.println("Ingrese orden a o d :\n ");  
	    
	    letra = sc.next().charAt(0);
	   
	    
	    
	    switch (letra) {
	    case 'a':
	    	
	   
	    
	    for (int i = 0 ;i <= a.length ; i++) {
	    	
	    	for(int j= 1; j<=(a.length-1);j++)
	    		
	    	{if (a[j - 1] > a[j]) {
	            menor = a[j - 1];
	            a[j - 1] = a[j];
	            a[j] = menor;
	            
	           		
	    	}}}
	    	System.out.println("de menor a mayor " + Arrays.toString(a));
	    	break;
	    case 'd':
	    	 for (int k = 0 ; k<= a.length ; k++) {
	 	    	
	 	    	for(int l= 1; l<=(a.length-1);l++)
	 	    		
	 	    	{if (a[l - 1] < a[l]) {
	                 mayor = a[l - 1];
	                 a[l - 1] = a[l];
	                 a[l] = mayor;	
	                 
	                  }} }   	
	    	
	    	 System.out.println("de mayor a menor " + Arrays.toString(a));
	    	 break;
	    default: System.out.println("Ingreso no es correcto ");
	    	
	    }	
			
	}

}
