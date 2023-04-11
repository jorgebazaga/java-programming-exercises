/*
 * Examen Ejercicio 2
 * Crea una clase Colegio que almacene la nacionalidad de los alumnos de un colegio en un HashMap.
 * @author Jorge Bazaga Sarmiento
 * @date 16/02/2023
 */

import java.util.HashMap;

public class Colegio {

  HashMap<String, Integer> nacionalidadColegio = new HashMap<String, Integer>();

  public void addAlumno(String nacionalidad) {
    int contador;
    String mayusculas = nacionalidad.toUpperCase();
    nacionalidadColegio.put(mayusculas, +1);

  }

  public void showAll() {

  }

  public void showNacionalidad(String nacionalidad) {
    String mayusculas = nacionalidad.toUpperCase();
    System.out.println("La nacionalidad " + mayusculas + " contiene " + nacionalidadColegio.get(mayusculas));
  }

  public void cuantos() {
    System.out.println(nacionalidadColegio.size());
  }

  public void borra(String nacionalidad) {
    String mayusculas = nacionalidad.toUpperCase();
    nacionalidadColegio.remove(mayusculas);
  }

  public static void main(String[] args) {
    Colegio colegio1 = new Colegio();

    colegio1.addAlumno("Español");
    colegio1.addAlumno("Español");
    colegio1.addAlumno("Español");
    colegio1.addAlumno("Italiano");
    colegio1.addAlumno("Italiano");
    colegio1.addAlumno("Aleman");
    colegio1.addAlumno("Aleman");

    colegio1.cuantos();

    colegio1.showNacionalidad("Español");
    colegio1.showNacionalidad("Italiano");
    colegio1.showNacionalidad("Aleman");
  }
}
