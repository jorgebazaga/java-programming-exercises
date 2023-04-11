package POO_Java;
/*
Ejercicio caballo
@author Jorge Bazaga Sarmiento
16/01/2023 */
public class Caballo {
  String nombre, raza, color, sexo;  
  int edad;

  //constructor
  Caballo (String nombre, String raza, String color, String sexo, int edad){
    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
    this.sexo = sexo;
    this.edad = edad;    
  }

  //getter
  String getNombre() {
    return this.nombre;
  }

  String getRaza() {
    return this.raza;
  }

  String getColor() {
    return this.color;
  }

  String getSexo() {
    return this.sexo;
  }

  int getEdad() {
    return this.edad;
  }

  //metodo
  void relincho(){
    System.out.println("HIIII");
  }

  public static void main(String[] args) {
    Caballo blanco = new Caballo("Paco","Asturiana","Blanco","Macho",17);
    System.out.println("Hola Caballo Blanco");
    blanco.relincho();
    System.out.println("¿Cómo se llama?");
    System.out.println(blanco.getNombre());
    System.out.println("¿Qué raza es?");
    System.out.println(blanco.getRaza());
    System.out.println("¿De qué color es?");
    System.out.println(blanco.getColor());
    System.out.println("¿Que sexo es?");
    System.out.println(blanco.getSexo());
    System.out.println("¿Cual es su edad?");
    System.out.println(blanco.getEdad());    
  }
}