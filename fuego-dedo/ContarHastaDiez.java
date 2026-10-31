import java.util.Scanner;

	public static void main(String[] args) {
		
		        int numeroSecreto = 42;
		        int numeroIngresado; 
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("¡Adivina el número secreto!");

		        
		        do {
		            
		            System.out.print("Ingresa un número: ");
		            numeroIngresado = scanner.nextInt(); 

		            if (numeroIngresado != numeroSecreto) {
		                System.out.println("Intenta de nuevo...");
		            }

		        } while (numeroIngresado != numeroSecreto);

		        System.out.println("¡Felicidades! ¡Has adivinado el número secreto (" + numeroSecreto + ")!");
		        scanner.close(); 
		    }
		