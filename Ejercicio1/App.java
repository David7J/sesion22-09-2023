import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        int opc, fila,columna;


        System.out.println("Seleccione la operacion que desea realizar: ");
        System.out.println("1) Verificar si dos matrices son iguales");
        opc = lector.nextInt();

        

        switch(opc){
            case 1:
            System.out.println("Ingrese el numero de filas de las matrices");
            fila = lector.nextInt();

            System.out.println("Ingrese el numero de columnas de las matrices");
            columna = lector.nextInt();

            int[][] matrizA = new int[fila][columna];

            
            System.out.println("Ingrese el numero de filas de las matrices");
            fila = lector.nextInt();

            System.out.println("Ingrese el numero de columnas de las matrices");
            columna = lector.nextInt();

            int[][] matrizB = new int[fila][columna];

            while(fila <= 0 && columna <= 0){
                System.out.println("El tamaño de las matrices no puede ser cero");
                System.out.println("Ingrese el numero de filas de las matrices");
                fila = lector.nextInt();

                System.out.println("Ingrese el numero de columnas de las matrices");
                columna = lector.nextInt();
            }
            
            
            
            
            
            
            while(fila <= 0 && columna <= 0){
                System.out.println("El tamaño de las matrices no puede ser cero");
                System.out.println("Ingrese el numero de filas de las matrices");
                fila = lector.nextInt();

                System.out.println("Ingrese el numero de columnas de las matrices");
                columna = lector.nextInt();
            }
            

            System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    System.out.println("MatrizA [" + i + "," + j + "]");
                    matrizA[i][j] = lector.nextInt();
                }
            }

            

            System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    System.out.println("MatrizA [" + i + "," + j + "]");
                    matrizA[i][j] = lector.nextInt();
                }
            }


            System.out.println("Los datos en forma de matriz:");
            for ( int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    System.out.println(matrizA[i][j] + "\n");

                    System.out.println();
                    
                }
            }


            System.out.println("Los datos en forma de matriz:");
            for ( int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    System.out.println(matrizB[i][j] + "\n");

                    System.out.println();                    
                }
            }
        

            break;

            default:
            System.out.println("Escoja una opcion valida, intente de nuevo");
        }






        lector.close();
    }
}
