package Deberes.src;
import java.util.Scanner;
public class DeberUno {
    private static int busquedarreglo(String[] izquierda, String ingreso) {
        int indice = 0;
        for (int i=0; i < izquierda.length; i++){
            if(izquierda[i].equals(ingreso)){
                indice = i;
            }; 
        }
        return indice;
    }
    public static void main(String[] args) {
        
        //Definir variables
        String[] izquierda = {"L","C","U"};
        String[] derecha = {"","",""};
        String ingreso;
        boolean bandera = true;
        Scanner ingresoConsola = new Scanner(System.in);
        
        //Operaciones
        while(bandera == true){
            //Caso 1
            //1-Cruza el observador con las uvas
            //2-Cruza el observador con el lobo
            //3-Cruza caperucita
            //Caso 2
            //1-Cruza el observador con el lobo
            //2-Cruza el observador con las uvas
            //3-Cruza el observador con caperucita
            System.out.println("Digite L si desea cruzar al lobo");
            System.out.println("Diigite C si desea cruzar a caperucita");
            System.out.println("Digite U si desea cruzar a las uvas");
            ingreso = ingresoConsola.nextLine();
            switch (ingreso) {
                case "L":
                    busquedarreglo(izquierda,ingreso);
                    System.out.println(busquedarreglo(izquierda, ingreso));
                    System.out.println("si");
                    break;
                case "C":
                    //busquedarreglo(izquierda,ingreso);
                    System.out.println(busquedarreglo(izquierda, ingreso));
                    System.out.println("si");
                    break;
                case "U":
                    busquedarreglo(izquierda,ingreso);
                    System.out.println(busquedarreglo(izquierda, ingreso));
                    System.out.println("si");
                    break;
                default:
                    break;
            }
            bandera = false;
        }
        
    }
}
