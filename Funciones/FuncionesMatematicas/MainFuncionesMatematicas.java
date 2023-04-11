package Funciones.FuncionesMatematicas;

public class MainFuncionesMatematicas{
public static void main (String[] args) {

    int capicuo = 1221;
    int primo = 7;
    int base = -5;
    int exponente = 2;

    
    System.out.println("¿Es capicuo?: " + FuncionesMatematicas.esCapicua(capicuo));
    System.out.println("¿Es primo?: " + FuncionesMatematicas.esPrimo(primo));
    System.out.println("Siguiente primo?: " + FuncionesMatematicas.siguientePrimo(primo));
    System.out.println("Potencia: " + FuncionesMatematicas.potencia(base, exponente));
    System.out.println("¿Cuantos dígitos?: " + FuncionesMatematicas.digitos(capicuo));
    System.out.println("Número volteado: " + FuncionesMatematicas.voltea(11112222)); 

    System.out.println("Digito ene: "+ FuncionesMatematicas.digitoN(123456, 5));
    System.out.println("Digito en la posición: "+ FuncionesMatematicas.posicionDeDigito(321782, 8));
    
    System.out.println("quita por detras: " + FuncionesMatematicas.quitaPorDetras(17181920, 6));
    System.out.println("quita por delante: " + FuncionesMatematicas.quitaPorDelante(17181920,3 ));
    
    System.out.println("Pega detrás: " + FuncionesMatematicas.pegaPorDetras(11111, 22222));
    System.out.println("Pega delante: " + FuncionesMatematicas.pegaPorDelante(11111, 22222));
    System.out.println("Junta numeros: " + FuncionesMatematicas.juntaNumeros(11111, 22222));
    System.out.println("Trozo numero: " + FuncionesMatematicas.trozoDeNumero(12345678, 2, 2 ));
    }
}