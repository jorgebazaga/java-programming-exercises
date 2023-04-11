/* Array Ejercicio 3
 * 
 * 
 * Autor: Bazaga Sarmiento, Jorge
 * Fecha de creación: 27/10/2022
 */
public class ArrayEjercicio3 {
    public static void main(String[] args) {

        System.out.println("Escribe 10 numeros ");
        int [] num = new int [10];

        for(int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
            
        }
        System.out.println();

        for(int i = 9; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}
