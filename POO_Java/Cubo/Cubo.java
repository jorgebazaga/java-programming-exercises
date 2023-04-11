package POO_Java.Cubo;

public class Cubo {
  
  //atributos

  int capacidad;
  int contenido;

  //metodos


  //constructor
  Cubo (int c) {
    this.capacidad = c;
  }

  //métodos getter
  int getCapacidad() {
    return this.capacidad;
  }

  int getContenido() {
    return this.contenido;
  }

  //método setter 
  void setContenido(int litros) {
    this.contenido = litros;
  }

  //otros métodos
  void vacia(){
    this.contenido = 0;
  }

  /* LLena el cubo al máximo de su capacidad */

  void llena(){
    this.contenido = this.capacidad;
  }

  void pinta(){
    for (int nivel = 0; nivel < this.capacidad; nivel++) {
      if (this.contenido >= nivel){
        System.out.println("#~~~~#");
      } else { 
        System.out.println("#    #");
      }
    }
    System.out.println("######");
  }
}
