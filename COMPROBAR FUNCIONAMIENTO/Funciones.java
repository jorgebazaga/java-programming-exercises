package matematicas;

/**
 * Ejercicios 1-14
 * Biblioteca de funciones matemáticas. Se pueden funciones dentro de otras
 * @author Jorge Bazaga Sarmiento
 * 16/11/2022
 */


public class Funciones {

    // Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
    // @param Usamos la variable x para comprobar si es capicuo
    public static boolean esCapicua(int x) {
      int invertido = voltea(x);

      if (invertido == x){
        return true;
      } else {
      return false;
      }
    }
    
    // Devuelve verdadero si el número que se pasa como parámetroes primo y falso en caso contrario. 
    // @param Usamos la variable x para comprobar si es primo
    public static boolean esPrimo(int x) {
      for (int i = 2; i < x; i++) {
          if ((x % i) == 0) {
            return false;
          }
        }
        
        return true;
      }

    // Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    // @param Usamos la variable x para iterar hasta el proximo primo usando la funcion esPrimo
    public static int siguientePrimo(int x) {
      int resultado = x; 
        do {
          resultado += 1;
        } while (!esPrimo(resultado));
        return resultado;
        
    }

    // Dada una base y un exponente devuelve la potencia.
    // @param Usamos la variable x para introducir una base y el variable y para el exponente.
    public static int potencia(int a, int b) {
      return (int)Math.pow(a, b);

    }
    // Cuenta el número de dígitos de un número entero. 
    // @param Usamos la variable x para contar los digitos del mismo
    public static int digitos(int x) {
      String entrada = Integer.toString(x);
      int resultado = entrada.length();
      return resultado;
      
    }
      
    // Le da la vuelta a un número.
    // @param Usamos la variable x para voltearlo.
    public static int voltea(int x) {
      int num=x;
      int vuelta = 0, resto;
      
      while( num > 0 ) {
        resto = num % 10;
        vuelta = vuelta * 10 + resto;
        num /= 10;
      }

      return vuelta;

    }
    
    // Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
    // @param Usamos la variable x introducir el digito y la variable y para seleccionar la posición a devolver.
    public static int digitoN(int x, int y) {
      if (digitos(x) < y){
        return -1;
      }

      String entrada = Integer.toString(x);
      char dig = entrada.charAt(y);
      return Integer.parseInt(dig+"");    

    }

    // Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
    // En el caso de que no encuentre el número especificado devuelve -1 
    // Te da la posición empezando desde el 1, no desde el 0
    // @param Usamos la variable x introducir el digito y la variable y para seleccionar el primer número que queremos saber su posición.
    public static int posicionDeDigito(int x, int y) {
      int entrada = Math.abs(x);
      String salida = Integer.toString(entrada);
      String num = Integer.toString(y);
      return salida.indexOf(num) +1;
    } 
    
    // Le quita a un número n dígitos por detrás (por la derecha).
    // @param Usamos la variable x para introducir el digito y la variable y para el número a restar.
    public static String quitaPorDetras(int x, int y) {
      String entrada = Integer.toString(x);
      entrada = entrada.substring(0, entrada.length() - y);
      return entrada;
    }
    
    // Le quita a un número n dígitos por delante (por la izquierda).
    // @param Usamos la variable x para introducir el digito y la variable y para el número desde que empieza el String.
    public static String quitaPorDelante(int x, int y) {
      String entrada = Integer.toString(x);
      entrada = entrada.substring(y);
      return entrada;
    }

    // Añade un dígito a un número por detrás. 
    // @param Usamos la variable x para introducir el digito y la variable y para el número a añadir por detras.
    public static String pegaPorDetras(int x, int y) {
      String entrada1 = Integer.toString(x);
      String entrada2 = Integer.toString(y);
      return entrada1 + entrada2;
      
    }
    
    // Añade un dígito a un número por delante.
    // @param Usamos la variable x para introducir el digito y la variable y para el número a añadir por delante.
    public static String pegaPorDelante(int x, int y) {
      String entrada1 = Integer.toString(x);
      String entrada2 = Integer.toString(y);
      return entrada2 + entrada1;
      
    } 

    // Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
    // @param Usamos la variable x para introducir el digito, la variable y para la posición de inicio y la z para posición donde finaliza.
    public static String trozoDeNumero(int x, int y, int z) {
      int result = Integer.parseInt(quitaPorDelante(x, y));
      String result1 = quitaPorDetras(result, z);
      return result1;
      
    }
      
    // Pega dos números para formar uno.
    public static String juntaNumeros(int x, int y) {
      String entrada1 = Integer.toString(x);
      String entrada2 = Integer.toString(y);
      return entrada1.concat(entrada2);
      
      
    }

    
    
}
