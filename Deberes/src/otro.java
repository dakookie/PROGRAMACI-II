package Deberes.src;

import java.util.Scanner;
public class otro {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego del acertijo");
        System.out.println("El lobo no se tiene que quedar solo con la Caperucita");
        System.out.println("Ni la caperucita puede quedarse sola con las uvas");
        System.out.println("Digite 1 si desea pasarle de derecha a izquierda a observador y caperucita");
        System.out.println("Digite 2 si desea pasarle de derecha a izquierda a observador y lobo");
        System.out.println("Digite 3 si desea pasarle de derecha a izquierda a observador y uvas");
        System.out.println("Digite 4 si desea pasarle de izquierda a derecha a observador y caperucita");
        System.out.println("Digite 5 si desea pasarle de izquierda a derecha a observador y lobo");
        System.out.println("Digite 6 si desea pasarle de iquierda a derecha a observador y uvas");
        System.out.println("Posicion inicial lobo,obsservador,caperucita y uvas en el medio");
        System.out.println("elija una opcion");
        String in = sc.nextLine();
        switch (in) {

            case "1":
                System.out
                        .println(
                                "derecha:uvas y lobo...............................izquierda:observador y caperucita");
                break;
            case "2":
                System.out
                        .println(
                                "derecha:uvas y caperucita...............................izquierda:observador y lobo");
                System.out.println("Error Caperucita junto con las uvas");
                // aqui da error
                break;
            case "3":
                System.out
                        .println(
                                "derecha:caperucita y lobo...............................izquierda:observador y uvas");
                // aqui da error
                System.out.println("Error Caperucita y lobo juntos");
                break;
            case "4":
                System.out
                        .println(
                                "derecha:observador y caperucita...............................izquierda:uvas y lobo");
                break;
            case "5":
                // aqui da error
                System.out
                        .println(
                                "derecha:observador y lobo...............................izquierda:uvas y caperucita");
                System.out.println("Error Caperucita junto con las uvas");
                break;
            case "6":
                System.out
                        .println(
                                "derecha:observador y uvas...............................izquierda:caperucita y lobo");
                // aqui da error
                System.out.println("Error Caperucita y lobo juntos");
                break;
        }
    }
}
