/* Array Ejercicio 2
 * Define un array y asigna valores (caracteres) de una tabla. Muestra el contenido del array.
 * 
 * Autor: Bazaga Sarmiento, Jorge
 * Fecha de creación: 27/10/2022
 */
public class ArrayEjercicio2 {
    public static void main(String[] args) {
        char[] simbolo;
        simbolo = new char[9];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        //Los valores que no han sido inicializados son nulos// 

        for (char sim : simbolo){
            System.out.print(sim + " ");
        }
    }
}