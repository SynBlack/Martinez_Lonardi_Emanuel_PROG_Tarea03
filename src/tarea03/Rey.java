package tarea03;

/**
 *
 * @author Emanuel Martínez Lonardi Creamos la clase Rey con los atributos Color
 * y posicion
 */
public class Rey {

    private Color color;
    private Posicion posicion = new Posicion();

    /**
     * Constructor que acepte como parámetros el color.
     * @param color es un enumerado.
     */
    
    public Rey(Color color) {
        this.color = color;
        switch (color) {
            case BLANCO:
                posicion = new Posicion(1, 'e');
                break;
            case NEGRO:
                posicion = new Posicion(8, 'e');
                break;
        }
    }
    
    /**
     * Constructor por defecto que cree un rey blanco
     */
    public Rey() {
        posicion = new Posicion(1, 'e');
    }
}
