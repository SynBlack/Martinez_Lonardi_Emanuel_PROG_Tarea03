package tarea03;

/**
 * @author Emanuel Martínez Lonardi
 * @version 1.0 Se crea la clase posicion
 */
public class Posicion {

    // Creamos los atributos fila y columna.
    private int fila;
    private char columna;

    /**
     * Creamos el constructor de la clase Posicion a la que pasaremos los parámetros fila y columna.
     * 
     * @param fila recibirá el constructor un valor entero de la fila por parámetro.
     * @param columna recibirá el constructor un valor carácter de la columna por parámetro.
     */
    
    public Posicion(int fila, char columna) {
        if ((fila >= 1 && fila <= 8) && (columna >= 97 && columna <= 104)) {
            this.fila = fila;
            this.columna = columna;
        } else {
            this.fila = 1;
            this.columna = 'a';
            System.out.printf("Error. No se ha definido una posición válida.\n");
        }
    }
    
    /**
     * Primero creamos el getFila.
     * Devolverá un entero entre 1 y 8.
     */
    public int getFila() {
        return fila;
    }
    
    /**
     * Creamos el getColumna.
     * Devolverá un carácter entre a y h.
     */
    public char getColumna() {
        return columna;
    }
    
    /**
     * Creamos el método setFila con una comprobación de valor.
     */
    public void setFila() {
        if (fila >= 1 && fila <= 8) {
            this.fila = fila;
        } else {
            this.fila = 1;
            System.out.printf("Error. La posición indicada para fila no es válida.");
        }
    }
    
    /**
     * Creamos el método setColumna con una comprobación de valor.
     */
    public void setColumna() {
        if (columna >= 97 && columna <= 104) {
            this.columna = columna;
        } else {
            this.columna = 'a';
            System.out.printf("Error. La posición indicada para columna no es válida.");
        }
    }
    
}