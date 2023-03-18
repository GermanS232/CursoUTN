import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CLASE4EJ2 {



	public static void main(String[] args)  {
		
		
		


		Path archivo = Paths.get("C:\\Users\\pc08\\Desktop\\y.txt");
	

		int suma = 0;
		
		 
				try {
					for (String a :Files.readAllLines(archivo)) {
						int numero = Integer.parseInt(a);
						suma= suma + numero;

					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			System.out.println("La suma de los numeros es  " + suma);
			
		
		
		
		
	}}


