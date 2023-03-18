import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CLASE4EJ2A {

	public static void main(String[] args) {
		int suma = 0;
		int mult =1;
		char letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese suma s o multiplicacion m");
		letra = sc.next().charAt(0);
		
		switch (letra) { case 's':
		try {
		Path archivo = Paths.get("C:\\Users\\pc08\\Desktop\\y.txt");
		
					for (String a :Files.readAllLines(archivo)) {
						int numero = Integer.parseInt(a);
						suma= suma + numero;
					}}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					System.out.println("La suma de los numeros es  " + suma);
					break;
				 
	              case 'm':
			try {
			Path archivo = Paths.get("C:\\Users\\pc08\\Desktop\\y.txt");
			
						for (String a :Files.readAllLines(archivo)) {
							int numero = Integer.parseInt(a);
							mult= mult * numero;
						}}
							catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						System.out.println("La multiplicacion de los numeros es  " + mult);
						break;		
			
	 default: System.out.println("Ingreso no es correcto ");}
			
			
}}
