/* Array Ejercicio 5
 * Pide 10 números por teclado y muestra los números introducidos 
 * con las palabras máximo y mínimo al lado de los mismos. 
 * 
 * Autor: Bazaga Sarmiento, Jorge
 * Fecha de creación: 3/11/2022
 */
public class ArrayEjercicio5 {
    public static void main(String[] args) {
        
        //Definimos el array
        System.out.println("Por favor, escribe 10 numeros (INTRO): ");
        int [] num = new int [10];
        
        //Creamos un bucle que para almacenar 10 números en el array
        for(int i = 0; i < 10; i++){
            num[i] = Integer.parseInt(System.console().readLine());
        }

        int min = num[0];
        int max = num[0];

        //Comparamos con el máximo y con el mínimo
        for(int i = 0; i < 10; i++){
            
            if (num[i] > max){
                max = num[i];
            }

            if (num[i] < min){
                min = num[i];
            }
        }
        
        //Iteramos para imprimir el máximo y el mínimo.
        for (int i = 0; i < 10; i++){
            System.out.print("Número "+ i + ": " + num[i]);
                if (num[i] == max){
                    System.out.print(" máximo");
                }
                if (num[i] == min){
                    System.out.print(" mínimo");
                }

            System.out.println();

        }

        System.out.println();
    }   
}


