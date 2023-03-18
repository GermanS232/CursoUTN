
public class Clase2EJ2 {

	public static void main(String[] args) {
		
	
		
		
		        String frase = "hola que tal ";
		        char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		        char[] cod = null  ;
		        
		        System.out.println("Corro un lugar ");
		        for(int i=0; i<frase.length(); i++) 
		        {
					char chr = frase.charAt(i);
					
					for(int j=0; j<abc.length; j++)
		            {
		                if(abc[j] == chr)
		                {
		                	if (abc[j]!= ('z')) {
		                		System.out.print(abc[j+1]);	
		                	}
		                	else {System.out.print(abc[0]);	
		                		}}}}
		        System.out.println("\nCorro dos lugares ");
		        
		        for(int i=0; i<frase.length(); i++) 
		        {
					char chr = frase.charAt(i);
					
					for(int j=0; j<abc.length; j++)
		            {
		                if(abc[j] == chr)
		                {
		                	if (abc[j]!= ('z')&&abc[j]!= ('y')) {
		                		System.out.print(abc[j+2]);	
		                	}	                	
		                	if (abc[j]== ('z'))
		                	 {System.out.print(abc[1]);	}
		                	 if (abc[j]== ('y'))
		                	 {System.out.print(abc[0]);	
		                	 
		                	 
		                	 
		                		}}}}
		        
		        
		        
	
	}}
		                
		              
		        
		   
		
	
	
	

	
	


