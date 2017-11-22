package tarea03;

import utilidades.Entrada;

/**
 * @author Emanuel Martínez Lonardi
 * @ version 1.0
 * Creación de la clase Principal con el método main
 */
public class Principal {
    public static void main(String[] args) {
        int valor_color;
        // Pequeño menú improvisado para ser más agradable a la vista
        System.out.println("Inicio del programa creado para la Tarea 3.");
        System.out.println("-------------------------------------------");
        System.out.println("     Color número 1: BLANCO.");
        System.out.println("     Color número 2: NEGRO.");
        System.out.print("Introduzca el número del color del Rey que desea: ");
        
        // Creamos una comprobación para asegurarnos de que selecciona un color.
        do {
            valor_color = Entrada.entero();
            if (valor_color != 1 && valor_color != 2) {
                System.out.print("ERROS. No ha seleccionado un color correcto. Vuelva a intentarlo: ");
            }
        }while (valor_color != 1 && valor_color != 2);
        
        Rey rey_creado = new Rey(valor_color);
        System.out.println("Rey "+ rey_creado.color + " creado");
        
        /* Ahora vamos a crear un pequeño menú para mover el Rey de posición. Pediremos al usuario una opción
        * y para salir del menú, tendremos que elegir la opción de "salir"
        */
        
        int opcion_menu = 0;
        int opcion_movimiento = 0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("-      Opción 1: Mover el Rey        -");
            System.out.println("-      Opción 2: Mostrar Posición    -");
            System.out.println("-      Opción 3: Salir               -");
            System.out.println("--------------------------------------");
            System.out.print("Elija una Opción: ");
            opcion_menu = Entrada.entero();
            switch(opcion_menu){
                case 1:     // Mostramos las opciones de movimiento
                            System.out.println("");
                            System.out.println("---- OPCIONES de MOVIMIENTO ----");
                            System.out.println("-       Opción 1: NORTE        ");
                            System.out.println("-       Opción 2: NORESTE      ");
                            System.out.println("-       Opción 3: ESTE         ");
                            System.out.println("-       Opción 4: SURESTE      ");
                            System.out.println("-       Opción 5: SUR          ");
                            System.out.println("-       Opción 6: SUROESTE     ");
                            System.out.println("-       Opción 7: OESTE        ");
                            System.out.println("-       Opción 8: NOROESTE     ");
                            System.out.println("--------------------------------");
                            System.out.print("Elije un movimiento a realizar: ");
                            opcion_movimiento = Entrada.entero();
                            // comprobamos que ha introducido un entero correcto
                            do{
                                if(opcion_movimiento >= 1 && opcion_movimiento <= 8){
                                    /* Movemos al rey a la posicion deseada, el metodo llamado 
                                    * comprobará si puede moverse ahí o no.
                                    */
                                    switch(opcion_movimiento){
                                        case 1: rey_creado.mueve(Direccion.NORTE);
                                                break;
                                        case 2: rey_creado.mueve(Direccion.NORESTE);
                                                break;
                                        case 3: rey_creado.mueve(Direccion.ESTE);
                                                break;
                                        case 4: rey_creado.mueve(Direccion.SURESTE);
                                                break;
                                        case 5: rey_creado.mueve(Direccion.SUR);
                                                break;
                                        case 6: rey_creado.mueve(Direccion.SUROESTE);
                                                break;
                                        case 7: rey_creado.mueve(Direccion.OESTE);
                                                break;
                                        case 8: rey_creado.mueve(Direccion.NOROESTE);
                                                break;
                                        default:break;
                                    }       
                                }else{
                                    // La opción de movimiento no es correcta
                                    System.out.print("Opción de movimiento no válida. Escoja otra opción: ");
                                    opcion_movimiento = Entrada.entero();
                                }
                            }while(opcion_movimiento < 1 || opcion_movimiento > 8);
                            break;
                case 2:     // Mostramos por pantalla la posicion actual del rey
                            System.out.println("La posicio actual del Rey " + rey_creado.color + " es:");
                            System.out.println("    Está en la fila    : " + rey_creado.posicion.getFila());
                            System.out.println("    Está en la columna : " + rey_creado.posicion.getColumna());
                            break;
                default:    System.out.println("Opción no existente en el menú");
                            break;
            }
        }while(opcion_menu!=3);
    }
}
