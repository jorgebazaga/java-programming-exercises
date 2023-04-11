/* Array Bidimensional Ejercicio 1
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num 
 * y asigna los valores. Muestra el contenido de todos los elementos del array 
 * dispuestos en forma de tabla 
 * 
 * Autor: Bazaga Sarmiento, Jorge
 * Fecha de creación: 2/11/2022
 */
public class ArrayBiEj {
    public static void main(String[] args) {

        int fila, columna;
        int [][] num = new int [3][6];

        for (fila = 0; fila < 3; fila++){
            for (columna = 0; columna < 6; columna++){
            num[fila][columna] = -3;}
        }

        num[0][0]=0;
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;
        num[1][0]=75;
        num[1][4]=0;
        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
        
        System.out.println("Array num  Columna 0   Columna 1  Columna 2  Columna 3  Columna 4  Columna 5");
        System.out.println("          ┌──────────┬──────────┬──────────┬──────────┬──────────┬──────────┐");

        for (fila = 0; fila < 3; fila++){

            if (fila > 0){
                System.out.println("          ├──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
            }

                System.out.print("Fila " + fila);
                System.out.print("    |");
                
            for (columna = 0; columna < 6; columna++){

                if (num[fila][columna] > -3){
                    System.out.printf("%6s", num[fila][columna]);
                } else{
                    System.out.printf("%6s"," " );
                }

                System.out.print("    |");
            }
            
            System.out.println();
            
            
        }

        System.out.println("          └──────────┴──────────┴──────────┴──────────┴──────────┴──────────┘");
    }
}
