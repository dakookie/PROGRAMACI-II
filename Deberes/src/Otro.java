package Deberes.src;
import java.util.Arrays;
import java.util.Scanner;
public class Otro {
    public static void main(String[] args) {
		// Definicion de variables
		String[] arreJuegoIzq = { "Observador", "Lobo", "Caperucita", "Uvas" };
		String[] arreJuegoDer = { " ", " ", " ", " " };
		Scanner ingresoConsole = new Scanner(System.in);
		boolean banderaWhile = true;
		int clavMen;

		// Impresion de los arreglos
		//System.out.print(Arrays.toString(arreJuegoIzq));
		//System.out.print("      ");
		//System.out.println(Arrays.toString(arreJuegoDer));

		System.out.println(
				"*************************Bienvenido al juego <<Observador, lobo, caperucita y uvas>>*************************");
		System.out.println("Un observador se encuentra en la orilla de un río con el lobo, la caperucita y unas uvas.");
		System.out.println("Tiene una canoa en la que solo se pueden transportar él y una de las tres cosas");
		System.out.println("Si el lobo se queda solo con la caperucita se la come");
		System.out.println("Si la caperucita se queda sola con las uvas se las come");
		System.out.println("Como deberia transportarlos para evitar que se coman?");
		System.out.println("Se tienen los siguientes movimientos disponibles:");
		/*
		 * System.out.println("1.- Mover <<izq - der>> observador y lobo");
		 * System.out.println("2.- Mover <<izq - der>> observador y caperucita");
		 * System.out.println("3.- Mover <<izq - der>> observador y uvas");
		 * System.out.println("4.- Mover <<izq - der>> solo observador");
		 * System.out.println("5.- Mover <<der - izq>> observador y lobo");
		 * System.out.println("6.- Mover <<der - izq>> observador y caperucita");
		 * System.out.println("7.- Mover <<der - izq>> observador y uvas");
		 * System.out.println("8.- Mover <<der - izq>> solo observador"); System.out.
		 * println("Para realizar el movimiento, digite el numero asociado a este");
		 */
		
		while ( banderaWhile== true) {
			//String[] arreJuegoIzq = { "Observador", "Lobo", "Caperucita", "Uvas" };
			//String[] arreJuegoDer = { " ", " ", " ", " " };
			//String[] arreJuegoDer = new String[4];
			System.out.println("1.- Mover <<izq - der>> observador y lobo");
			System.out.println("2.- Mover <<izq - der>> observador y caperucita");
			System.out.println("3.- Mover <<izq - der>> observador y uvas");
			System.out.println("4.- Mover <<izq - der>> solo observador");
			System.out.println("5.- Mover <<der - izq>> observador y lobo");
			System.out.println("6.- Mover <<der - izq>> observador y caperucita");
			System.out.println("7.- Mover <<der - izq>> observador y uvas");
			System.out.println("8.- Mover <<der - izq>> solo observador");
			System.out.println("Para realizar el movimiento, digite el numero asociado a este");
			clavMen = Integer.parseInt(ingresoConsole.nextLine());
			switch (clavMen) {
			case 1:
				arreJuegoIzq [0] = "---";
				arreJuegoIzq [1] = "---";
				arreJuegoDer [0] = "Observador";
				arreJuegoDer [1] = "Lobo";
				//System.out.print(Arrays.toString(arreJuegoIzq));
				//System.out.print("      ");
				//System.out.println(Arrays.toString(arreJuegoDer));
				break;

			case 2:
				arreJuegoIzq [0] = "---";
				arreJuegoIzq [2] = "---";
				arreJuegoDer [0] = "Observador";
				arreJuegoDer [2] = "Caperucita";
				//System.out.print(Arrays.toString(arreJuegoIzq));
				//System.out.print("      ");
				//System.out.println(Arrays.toString(arreJuegoDer));
				break;

			case 3:
				arreJuegoIzq [0] = "---";
				arreJuegoIzq [3] = "---";
				arreJuegoDer [0] = "Observador";
				arreJuegoDer [3] = "Uvas";
				//System.out.print(Arrays.toString(arreJuegoIzq));
				//System.out.print("      ");
				//System.out.println(Arrays.toString(arreJuegoDer));
				break;
			case 4:
				
				arreJuegoIzq [0] = "---";
				arreJuegoDer [0] = "Observador";
				//System.out.print(Arrays.toString(arreJuegoIzq));
				//System.out.print("      ");
				//System.out.println(Arrays.toString(arreJuegoDer));
				break;
			case 5:
				arreJuegoIzq [0] = "Observador";
				arreJuegoIzq [1] = "Lobo";
				arreJuegoDer [0] = "---";
				arreJuegoDer [1] = "---";
				//System.out.print(Arrays.toString(arreJuegoIzq));
				//System.out.print("      ");
				//System.out.println(Arrays.toString(arreJuegoDer));
				break;
				
			case 6:
				arreJuegoIzq [0] = "Observador";
				arreJuegoIzq [2] = "Caperucita";
				arreJuegoDer [0] = "---";
				arreJuegoDer [2] = "---";
				//System.out.print(Arrays.toString(arreJuegoIzq));
				//System.out.print("      ");
				//System.out.println(Arrays.toString(arreJuegoDer));
				break;	
			case 7:
				arreJuegoIzq [0] = "Observador";
				arreJuegoIzq [3] = "Uvas";
				arreJuegoDer [0] = "---";
				arreJuegoDer [3] = "---";
				//System.out.print(Arrays.toString(arreJuegoIzq));
				//System.out.print("      ");
				//System.out.println(Arrays.toString(arreJuegoDer));
				break;	
				
			case 8:
				arreJuegoIzq [0] = "Observador";
				arreJuegoDer [0] = "---";
				//System.out.print(Arrays.toString(arreJuegoIzq));
				//System.out.print("      ");
				//System.out.println(Arrays.toString(arreJuegoDer));
				break;		
				
				
			default:
				System.out.println("La opcion de movimiento ingresada es invalida");
				banderaWhile = false;
				break;
			}
			
			

		}
		// Fuera del While
		System.out.print(Arrays.toString(arreJuegoIzq));
		System.out.print("      ");
		System.out.println(Arrays.toString(arreJuegoDer));
        System.out.print(Arrays.toString(arreJuegoIzq));
		System.out.print("      ");
		System.out.println(Arrays.toString(arreJuegoDer));
        System.out.print(Arrays.toString(arreJuegoIzq));
		System.out.print("      ");
		System.out.println(Arrays.toString(arreJuegoDer));
        System.out.print(Arrays.toString(arreJuegoIzq));
		System.out.print("      ");
		System.out.println(Arrays.toString(arreJuegoDer));
        System.out.print(Arrays.toString(arreJuegoIzq));
		System.out.print("      ");
		System.out.println(Arrays.toString(arreJuegoDer));
        System.out.print(Arrays.toString(arreJuegoIzq));
		System.out.print("      ");
        System.out.println(Arrays.toString(arreJuegoDer));
        System.out.print(Arrays.toString(arreJuegoIzq));
		System.out.print("      ");
		System.out.println(Arrays.toString(arreJuegoDer));
        System.out.print(Arrays.toString(arreJuegoIzq));
		System.out.print("      ");
		System.out.println(Arrays.toString(arreJuegoDer));
// Corchetes finales
	}

}
