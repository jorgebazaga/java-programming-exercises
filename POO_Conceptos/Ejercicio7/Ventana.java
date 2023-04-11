package POO_Conceptos.Ejercicio7;
/*
Conceptos de programación Ejercicio 7
@author Jorge Bazaga Sarmiento 
16/01/2023
*/
public class Ventana {
  String motorBusqueda, nomPrograma, tituloArchivo, iconoPrograma, rutaArchivo;
  int pestanas, ancho_Pantalla, alto_Pantalla;

Ventana(String motorBusqueda, String nomPrograma, String tituloArchivo, int ancho_Pantalla, int alto_Pantalla, int pestanas){
this.motorBusqueda = motorBusqueda;
this.nomPrograma = nomPrograma;
this.tituloArchivo = "archivo";
this.ancho_Pantalla = ancho_Pantalla;
this.alto_Pantalla = alto_Pantalla;
this.pestanas = 0;
}

String getMotorBusqueda() {
  return this.motorBusqueda;
}

String getNomPrograma() {
  return this.nomPrograma;
}

String getTituloArchivo() {
  return this.tituloArchivo;
}

int getAlto_Pantalla() {
  return this.ancho_Pantalla;
}

int getAncho_Pantalla() {
  return this.ancho_Pantalla;
}

int pestanas() {
  return this.pestanas;
}

void abrir(){
System.out.println("Se abre la ventana");
pestanas++;
System.out.println("Ahora mismo hay " + pestanas + " pestañas abiertas");
  if (pestanas > 10){
    System.out.println("Hay muchas pestañas abiertas");
  }
}

void cerrar(){
System.out.println("Se cierra la ventana");
pestanas--;
System.out.println("Ahora mismo hay " + pestanas + " pestañas abiertas");
  if (pestanas <= 0) {
    System.out.println("No hay pestañas para cerrar");
  }
}

void cambiarTitulo(){
  System.out.println("El titulo actualmente es: " + tituloArchivo);
  tituloArchivo = System.console().readLine("Introduce el nombre a cambiar: ");
  System.out.println("El titulo cambiado es: " + tituloArchivo);
}

void mover(){
  System.out.println("Se mueve la ventana");
}

void desacopla(){
  System.out.println("Se desacopla la ventana");
}

  public static void main(String[] args) {
    Ventana v1 = new Ventana(null, null, null, 0, 0, 0);
    v1.abrir();
    System.out.println();
    v1.cerrar();
    System.out.println();
    v1.cerrar();
    System.out.println();
    v1.cambiarTitulo();
    System.out.println();
    v1.desacopla();
    
  }
}


