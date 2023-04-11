/*
 * Examen Ejercicio 2
 * Crear un menú para introducir, buscar, modificar y borrar trabajadores.
 * @author Jorge Bazaga Sarmiento
 * @date 16/02/2023
 */
import java.util.HashMap;

public class Ejercicio2 {
  public static void main(String[] args) {

    HashMap<String, String> trabajadores = new HashMap<String, String>();
    String nif, nombre;
    Integer entrada;

    do {
      entrada = Integer.parseInt(System.console().readLine("1. Introducir un trabajador " + "\n"
          + "2. Buscar un trabajador por NIF " + "\n"
          + "3. Buscar un trabajador por nombre " + "\n"
          + "4. Modificar trabajador, " + "\n"
          + "5. Borrar trabajador" + "\n"
          + "6. Salir del programa" + "\n"
          + "Escribe un número: "));

      switch (entrada) {
        case 1:
          nif = System.console().readLine("Introduce el NIF del trabajador: ");
          nombre = System.console().readLine("Introduce el nombre del trabajador: ");
          trabajadores.put(nif, nombre);
          break;

        case 2:
          nif = System.console().readLine("Introduce el NIF de un trabajador: ");
          if (trabajadores.containsKey(nif)) {
            System.out.println(trabajadores.get(nif) + "\n");
          } else {
            System.out.println("No existe ese NIF" + "\n");
          }
          break;

        case 3:
          nombre = System.console().readLine("Introduce el nombre de un trabajador: ");
          for (String claveHash : trabajadores.keySet()) {
            if (trabajadores.get(claveHash).equals(nombre)) {
              System.out.println(claveHash);
            }
          }          
          break;
        case 4:
          nif = System.console().readLine("Introduce el NIF de un trabajador: ");
          nombre = System.console().readLine("Introduce el nombre de un trabajador: ");
          if (trabajadores.containsKey(nif) || trabajadores.containsValue(nombre)) {
            trabajadores.put(nif, nombre);
            System.out.println("Ha sido modificado satisfactoriamente" + "\n");
          } else {
            System.out.println("No se puede modificar, ese usuario no existe" + "\n");
          }

          break;
        case 5:
          nif = System.console().readLine("Introduce el NIF de un trabajador a eliminar: ");
          nombre = System.console().readLine("Introduce el nombre de un trabajador a eliminar: ");
          trabajadores.remove(nif, nombre);
          break;
        default:
          System.out.println("Escribe otro número");
          break;
      }
    } while (!entrada.equals(6));

  }
}
