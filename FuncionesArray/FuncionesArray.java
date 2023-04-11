

/* Array Bidimensional Ejercicios 20-28
 * Crea una biblioteca de funciones para arrays (de una dimensión)
 * de números enteros que contenga las siguientes funciones: 
 * 
 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
 * 7. volteaArrayInt: Le da la vuelta a un array.
 * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
 * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
 * 
 * Autor: Bazaga Sarmiento, Jorge
 * Fecha de creación: 2/11/2022
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class FuncionesArray {
  // Genera un array de tamaño n con números aleatorios cuyo
  // intervalo (mínimo y máximo) se indica como parámetro.
  // @param size, tamaño del array.
  // @param min, intervalo mínimo del array.
  // @param max, intervalo máximo del array.
  public static int[] generaArrayInt(int size, int min, int max) {
    int[] num = new int[size];
    for (int i = 0; i < num.length; i++) {
      num[i] = (int) (Math.random() * (max + 1 - min) + min);
    }
    return num;

  }

  // Devuelve el mínimo del array que se pasa como parámetro.
  public static int minimoArrayInt(int[] secuencia) {
    return Arrays.stream(secuencia).min().getAsInt();
  }

  // Devuelve el máximo del array que se pasa como parámetro.
  public static int maximoArrayInt(int[] secuencia) {
    return Arrays.stream(secuencia).max().getAsInt();

  }

  // Devuelve la media del array que se pasa como parámetro.
  public static int mediaArrayInt(int[] secuencia) {
    return (int) Arrays.stream(secuencia).average().getAsDouble();
  }

  // Dice si un número está o no dentro de un array.
  public static boolean estaArrayInt(int[] num, int busqueda) {
    return IntStream.of(num).anyMatch(x -> x == busqueda);
  }

  // Busca un número en un array y devuelve la posición (el índice) en la que se
  // encuentra.
  public static int posicionEnArray(int[] num, int busqueda) {
    for (int i = 0; i < num.length; i++) {
      if (num[i] == busqueda) {
        return i;
      }
    }
    return -1;
  }

  // Le da la vuelta a un array.
  public static int[] volteaArrayInt(int[] num) {
    int aux;
    for (int i = 0; i < num.length / 2; i++) {
      aux = num[i];
      num[i] = num[num.length - 1 - i];
      num[num.length - 1 - i] = aux;

    }
    return num;
  }

  // Rota n posiciones a la derecha los números de un array.
  public static int[] rotaDerechaArrayInt(int[] num, int y) {
    if (y < 0 || y >= num.length) {
      return new int[0]; // si falla devuelve un array vacio
    }

    for (int i = 0; i < y; i++) {
      rotaDerechaUno(num);
    }
    return num;
  }

  // Es la función complementaria que he utilizado para rotaDerechaArrayInt.
  public static int[] rotaDerechaUno(int[] num) {
    int ultimo = num[num.length - 1];
    for (int i = num.length - 2; i >= 0; i--) {
      num[i + 1] = num[i];
    }
    num[0] = ultimo;
    return num;
  }

  // Rota n posiciones a la izquierda los números de un array.
  public static int[] rotaIzquierdaArrayInt(int[] num, int y) {
    if (y < 0 || y >= num.length) {
      return new int[0]; // si falla devuelve un array vacio
    }
    
    for (int i = 0; i < y; i++) {
      rotaIzquierdaUno(num);
    }
    return num;

  }

  // Es la función complementaria que he utilizado para rotaIzquierdaArrayInt.
  public static int[] rotaIzquierdaUno(int[] num) {
    int primero = num[0];
    for (int i = 0; i < num.length - 1; i++) {
      num[i] = num[i + 1];
    }
    num[num.length - 1] = primero;
    return num;
  }
}
