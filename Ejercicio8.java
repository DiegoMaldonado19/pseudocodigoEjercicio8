/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos arreglo para guardar los multiplos de 5 que generemos
         * Y declaramos variables para poder efectuar los calculos necesarios
         */
        int multiploDeCinco[] = new int [1000];
        int resto=0, contadorMultiploDeCinco=0, opcion=0, numeroAleatorioGenerado=0;
        boolean salir = false;

        /**
         * Ciclo para poder realizar la generacion de numeros aleatorios
         */
        do{
            /**
             * Se le pide al usuario que elija salir o no del programa
             */
            System.out.println("¿Deseas salir?");
            System.out.println("1) No");
            System.out.println("2) Si");
            opcion = scanner.nextInt();
            /**
             * Segun su opcion generamos y almacenamos los multiplos de5
             * O salimos del ciclo do while
             */
            switch (opcion) {
                case 1:
                    numeroAleatorioGenerado = (int)(Math.random()*10000);
                    resto = numeroAleatorioGenerado%5;
                    if (resto == 0) {
                        multiploDeCinco[contadorMultiploDeCinco] = numeroAleatorioGenerado;
                        contadorMultiploDeCinco += 1;
                    }
                    break;
            
                case 2:
                    salir = true;
                    break;

                default:
                    System.out.println("Ingrese una opcion valida al Sistema");
                    break;
            }
        }while(salir == false);
        /**
         * Condicional para que muestre los multiplos generados por el sistema en consola, con la ayuda de una iteracion
         * O muestre en consola un mensaje donde se indique que no se generaron multiplos de 5
         */
        if(contadorMultiploDeCinco!=0){
            for(int i=0; i<contadorMultiploDeCinco; i++){
                System.out.println("El multiplo de 5 generado por el sistema es: "+multiploDeCinco[i]);
            }
        }
        else{
            System.out.println("No se generaron multiplos de cinco en el sistema");
        }
            
    }
}
