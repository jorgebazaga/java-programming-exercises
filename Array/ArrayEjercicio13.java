public class ArrayEjercicio13 {
    public static void main(String[] args) {
        
        //Definimos el array de 100 números.
        int [] num = new int [100];
        int i = 0;
        
        //Iteramos para almacenar números aleatorios (0-500) y lo almacenamos en el array.
        for(i = 0; i < 100; i++){
            num[i] = (int)(Math.random()*500 +1 );
            System.out.print(num[i] + " ");
        }

        int max = num[0];
        int min = num[0];

        System.out.println();
        System.out.println();
        System.out.print("¿Qué quiere descatar? (1 - mínimo, 2 - máximo): ");
        int comparacion = Integer.parseInt(System.console().readLine());
        
        //Si no está en el rango especificado, iteramos hasta que introduzca un número en el rango
        while ((comparacion != 1) && (comparacion !=2)){
            System.out.print("Por favor, introduce un número entre 1 o 2: ");
            comparacion = Integer.parseInt(System.console().readLine());
        }        

        System.out.println();
        
        //Hacemos la comparación para obtener máximo y mínimo
        for(i = 0; i < 100; i++){
            if (num[i] > max){
                max = num[i];
            }

            if (num[i] < min){
                min = num[i];
            }
        }

        //
        for(i = 0; i < 100; i++){

            if ((num[i] == min) && (comparacion == 1)){
                System.out.print(" **"+num[i]+ "** ");
            }

            if ((num[i] == max) && (comparacion == 2)){
                System.out.print(" **" +num[i]+ "** ");
            }
            

            if ((num[i] != min) && (num[i] != max))
            System.out.print(num[i] + " ");
            }     
        
    }
} 

