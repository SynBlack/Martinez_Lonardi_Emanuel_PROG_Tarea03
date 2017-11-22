package tarea03;

/**
 *
 * @author Emanuel Martínez Lonardi Creamos la clase Rey con los atributos Color
 * y posicion
 */
public class Rey {

    public Color color;
    public Posicion posicion = new Posicion(1,'a');

    /**
     * Constructor en función del color que nos pasen.
     */
    
    public Rey(int color) {
        if (color == 1) {
            this.color = Color.BLANCO;
            this.posicion.setFila(1);
            this.posicion.setColumna('e');
        } else {
            this.color = Color.NEGRO;
            this.posicion.setFila(8);
            this.posicion.setColumna('e');
        }
    }
    
    /**
     * Constructor por defecto que cree un rey blanco
     */
    public Rey() {
        posicion = new Posicion(1, 'e');
    }
    
    /**
     * Creación del método getColor.
     */
    public Color getColor() {
        return this.color;
    }
    
    /** 
     * Creación del método getPosicion
     */
    public Posicion getPosicion() {
        return this.posicion;
    }
    
    /**
     * Creación del método toString que devuelva los atributos del rey. 
     * @return rey devuelve el String creado anteriormente.
     */
    public String toString() {
        String rey = this.color+Integer.toString(this.posicion.getFila())+this.posicion.getColumna();
        return rey;
    }
    
    /**
     * Creamos el método mueve para mover al rey de posición.
     */
    public void mueve (Direccion direccion) {
        // creamos las variables fila y columna para las comprobaciones
        int fila = this.posicion.getFila();
        char columna = this.posicion.getColumna();
        // creación de la cadena que contendrá todas las columnas y una variable para saber a qué columna va
        String cadena = "abcdefgh";
        char columna_final = 'a';
        
        switch (direccion) {
            case NORTE: if (fila == 1) {
                            // no se podría mover en dirección NORTE
                            System.out.println("No está permitido el movimiento en dirección NORTE.");
                        } else {
                            // desplazamiento una casilla hacia el NORTE
                            this.posicion.setFila(fila-1);
                            System.out.println("Movemos el Rey en dirección NORTE.");
                        }
                        break;
            case SUR:   if (fila == 8) {
                            // no se podría mover en dirección SUR
                            System.out.println("No está permitido el movimiento en dirección SUR.");
                        } else {
                            this.posicion.setFila(fila+1);
                            System.out.println("Movemos el Rey en dirección SUR.");
                        }
                        break;
            case ESTE:   if (columna == 'h') {
                            // no se podría mover en dirección ESTE
                            System.out.println("No está permitido el movimiento en dirección ESTE.");
                        } else {
                            columna_final = cadena.charAt((cadena.lastIndexOf(columna)+1));
                            this.posicion.setColumna(columna_final);
                            System.out.println("Movemos el Rey en dirección ESTE.");
                        }
                        break;
            case OESTE:   if (columna == 'a') {
                            // no se podría mover en dirección OESTE
                            System.out.println("No está permitido el movimiento en dirección OESTE.");
                        } else {
                            columna_final = cadena.charAt((cadena.lastIndexOf(columna)-1));
                            this.posicion.setColumna(columna_final);
                            System.out.println("Movemos el Rey en dirección OESTE.");
                        }
                        break;
            case NORESTE:   if (fila == 1 || columna == 'h'){
                                // no se podría mover en dirección NORESTE
                                System.out.println("No está permitido el movimiento en dirección NORESTE.");
                            }else{
                                columna_final = cadena.charAt((cadena.lastIndexOf(columna)+1));
                                this.posicion.setColumna(columna_final);
                                this.posicion.setFila(fila-1);
                                System.out.println("Movemos al rey en dirección NORESTE.");
                            }
                        break;
            case SURESTE:   if (fila == 8 || columna == 'h'){
                                // no se podría mover en dirección SURESTE
                                System.out.println("No está permitido el movimiento en dirección SURESTE.");
                            }else{
                                columna_final = cadena.charAt((cadena.lastIndexOf(columna)+1));
                                this.posicion.setColumna(columna_final);
                                this.posicion.setFila(fila+1);
                                System.out.println("Movemos al rey en dirección SURESTE.");
                            }
                        break;
            case NOROESTE:   if (fila == 1 || columna == 'a'){
                                // no se podría mover en dirección NOROESTE
                                System.out.println("No está permitido el movimiento en dirección NOROESTE.");
                            }else{
                                columna_final = cadena.charAt((cadena.lastIndexOf(columna)-1));
                                this.posicion.setColumna(columna_final);
                                this.posicion.setFila(fila-1);
                                System.out.println("Movemos al rey en la dirección NOROESTE");
                            }
                        break;
            case SUROESTE:   if (fila == 8 || columna == 'a'){
                                // no se podría mover en dirección SUROESTE
                                System.out.println("No está permitido el movimiento en dirección SUROESTE.");
                            }else{
                                columna_final = cadena.charAt((cadena.lastIndexOf(columna)-1));
                                this.posicion.setColumna(columna_final);
                                this.posicion.setFila(fila+1);
                                System.out.println("Movemos al rey en dirección SUROESTE");
                            }
                        break;
            }
        System.out.println("La posición actual del Rey " + this.color + " es: " + this.posicion.getFila() + this.posicion.getColumna());
        }
    }
