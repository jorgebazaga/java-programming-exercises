

/* Array Bidimensional Ejercicio 29-34
 * Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones) 
 * de números enteros que contenga las siguientes funciones:
 * 
 * 1. generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
 * 3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
 * 4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un número dentro de un array bidimensional. Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.
 * 5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
 * 6. diagonal: Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa como parámetro. Se pasan como parámetros fila, columna y dirección. La fila y la columna determinan el número que marcará las dos posibles diagonales dentro del array. La dirección es una cadena de caracteres que puede ser “nose” o “neso”. La cadena “nose” indica que se elige la diagonal que va del noroeste hacia el sureste, mientras que la cadena “neso” indica que se elige la diagonal que va del noreste hacia el suroeste.
 *
 * Autor: Bazaga Sarmiento, Jorge
 * Fecha de creación: 29/11/2022
 */


public class FuncionesArrayBidimensional {

  public static int[][] generaArrayBiInt(int fila, int col, int min, int max) {
    int array[][] = new int[fila][col];
    for (int x = 0; x < array.length; x++) {
      for (int y = 0; y < array[x].length; y++) {
        array[x][y] = (int) (Math.random() * (max + 1 - min) + min);

      }
    }
    return array;
  }

  public static int[] filaDeArrayBiInt(int parametro[][], int fila) {
    int[] array = new int[parametro[0].length];
    for (int i = 0; i < parametro[0].length; i++) {
      array[i] = parametro[fila][i];
    }
    return array;
  }

  public static int[] columnaDeArrayBiInt(int parametro[][], int col) {
    int[] array = new int[parametro[0].length];
    for (int i = 0; i < parametro[0].length; i++) {
      array[i] = parametro[i][col];
    }
    return array;
  }

  public static int[] coordenadasEnArrayBiInt(int parametro[][], int search) {
    for (int x = 0; x < parametro.length; x++) {
      for (int y = 0; y < parametro[x].length; y++) {
        if (parametro[x][y] == search) {
          int encontrado [] = {x, y};
          return encontrado;
        } 
      }
    }
    int encontrado [] = {-1,-1};
    return encontrado;
  }

  public static boolean esPuntoDeSilla(int x[][], int i, int j) {
    int[] fila = filaDeArrayBiInt(x, i);
    int[] columna = columnaDeArrayBiInt(x, j);

    return ((FuncionesArray.minimoArrayInt(fila) == x[i][j]) && (FuncionesArray.maximoArrayInt(columna) == x[i][j]));

  }
}