package Deberes.src;
import java.util.Scanner;
import java.util.Arrays;
public class DeberUno {
    /* 
    private static int busquedarreglo(String[] izquierda, int ingreso) {
        int indice = 0;
        for (int i=0; i < izquierda.length; i++){
            if(izquierda[i].equals(ingreso)){
                indice = i;
            }; 
        }
        return indice;
    }
    */
    public static void main(String[] args) {
        
        //Definir variables
        String[] izquierda = {"O","L","C","U"};
        String[] derecha = {"","","",""};
        int ingreso;

        boolean bandera = true;
        Scanner ingresoConsola = new Scanner(System.in);
        

        //Operaciones
        
        System.out.println("Bienvenido al juego del lobo, caperucita y las uvas");
        while(bandera == true){
            
            System.out.println("Digite 1 si desea cruzar de izquierda a derecha al observador y uvas, y se queden las uvas");
            System.out.println("Digite 2 si desea cruzar de izquierda a derecha al observador y lobo, y se quede el lobo");
            System.out.println("Digite 3 si desea cruzar de izquierda a derecha al observador y caperucita");
            System.out.println("Digite 4 si desea cruzar de derecha a izquierda al observador");
            //System.out.println("Digite 5 si desea cruzar de derecha a izquierda a caperucita");
            //System.out.println("Digite 6 si desea cruzar de derecha a izquierda al lobo");
            //System.out.println("Digite 7 si desea cruzar de derecha a izquierda a las uvas");
            ingreso = Integer.parseInt(ingresoConsola.nextLine());
            switch (ingreso) {
                case 1:
                    izquierda[0] = " ";
                    izquierda[3] = " ";
                    derecha[0] = "O";
                    derecha[3] = "U";
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    //busquedarreglo(izquierda,ingreso);
                    //System.out.println(busquedarreglo(izquierda, ingreso));
                    
                    break;
                case 2:
                    izquierda[0] = " ";
                    izquierda[1] = " ";
                    derecha[0] = "O";
                    derecha[1] = "L";
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    //busquedarreglo(izquierda,ingreso);
                    //System.out.println(busquedarreglo(izquierda, ingreso));
                    
                    break;
                case 3:
                    izquierda[0] = " ";
                    izquierda[2] = " ";
                    derecha[0] = "O";
                    derecha[2] = "C";
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    //busquedarreglo(izquierda,ingreso);
                    //System.out.println(busquedarreglo(izquierda, ingreso));
                    
                    break;
                case 4:
                    izquierda[0] = "O";
                    derecha[0] = " ";
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    break;
                /*
                case 5:
                    izquierda[0] = "O";
                    derecha[0] = " ";
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    busquedarreglo(izquierda,ingreso);
                    System.out.println(busquedarreglo(izquierda, ingreso));
                    
                    break;
                case 6:
                    izquierda[0] = "O";
                    derecha[0] = " ";
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    busquedarreglo(izquierda,ingreso);
                    System.out.println(busquedarreglo(izquierda, ingreso));
                    
                    break;
                case 7:
                    izquierda[0] = "O";
                    derecha[0] = " ";
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    busquedarreglo(izquierda,ingreso);
                    System.out.println(busquedarreglo(izquierda, ingreso));
                    
                    break;
                */
                default:
                    System.out.println("El numero ingresado es incorrecto");
                    bandera = false;
                    break;
            }
              
            
            // = false;
        }
  
       //caso 4
       System.out.println("Se presentan los resultados");
        System.out.print(Arrays.toString(izquierda));
        System.out.print(" >>> ");
        System.out.println(Arrays.toString(derecha));
        
        
    }
}
