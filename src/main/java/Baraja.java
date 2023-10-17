/**
 * Clase que representa un mazo de cartas de coches.
 * Por ahora solo tiene 16 cartas y cada vez que se ejecuta el método sacarCarta devuelve una distinta.
 * Cada partida jugada que instancie Baraja sacará las mismas cartas en el mismo orden.
 * De momento no utiliza ni arrays, ni listas, ni otro tipo de estructuras complejas.
 * No se pueden revolver.
 */
public class Baraja {

    /** Número de cartas totales de la baraja */
    private final int NUM_CARTAS = 16;

    /** Posición de la carta que se va a sacar, la primera es la uno. */
    private int pos;

    /**
     * Constructor por defecto, inicializa la posición de la carta a sacar a 0
     */
    public Baraja() {
        pos = 0;
    }

    /**
     * Método que saca una carta de la baraja. Incrementa la posición de la carta y devuelve la carta correspondiente.
     * @return Carta sacada de la baraja según la posición
     */
    public Carta sacarCarta() {
        pos++;
        switch (pos) {
            case 1:
                return new Carta("Jaguar XJ 6 3.6", "GB", 3590, 221, 219, 13.5);
            case 2:
                return new Carta("Mercury Sable", "EEUU", 2513, 102, 185, 13.5);
            case 3:
                return new Carta("Seat Ibiza 1.5 GLX", "ES", 1461, 85, 168, 9.5);
            case 4:
                return new Carta("Audi 80 Quattro", "DE", 1847, 113, 193, 11.2);
            case 5:
                return new Carta("Volvo 780", "SWE", 2458, 165, 200, 14.5);
            case 6:
                return new Carta("Opel Omega 2.0i", "DE", 1998, 122, 200, 10.4);
            case 7:
                return new Carta("Citroen ZX 1.9i", "FR", 1905, 130, 200, 9.8);
            case 8:
                return new Carta("Ford Sierra 2.0i", "ES", 1993, 120, 200, 10.5);
            case 9:
                return new Carta("Fiat Tipo 1.6ie", "IT", 1581, 110, 200, 9.8);
            case 10:
                return new Carta("Peugeot 405 1.9i", "FR", 1905, 130, 200, 9.8);
            case 11:
                return new Carta("Renault 19 1.8i", "FR", 1764, 95, 200, 9.8);
            case 12:
                return new Carta("BMW 318i", "DE", 1796, 113, 200, 9.8);
            case 13:
                return new Carta("Rover Sterling", "GB", 2494, 167, 211, 9.5);
            case 14:
                return new Carta("Emelba Siete", "ES", 1461, 86, 160, 13);
            case 15:
                return new Carta("Fiat Croma 2000 i.e.", "IT", 1995, 120, 195, 11);
            case 16:
                return new Carta("Nissan Sunny", "JP", 1585, 73, 160, 8.7);
            default:
                return null;
        }
    }

    /**
     * Método que devuelve el número de cartas que quedan por sacar de la baraja
     * @return cartas pendientes por sacar
     */
    public int getNumeroCartasPendientes() {
        return NUM_CARTAS - pos;
    }

    /**
     * Método que devuelve el número de cartas que se han sacado de la baraja
     * @return cartas sacadas
     */
    public int getNumeroCartasSacadas() {
        return pos;
    }

    /**
     * Método que devuelve el número total de cartas de la baraja
     * @return cartas totales
     */
    public int getNumeroCartasTotales() {
        return NUM_CARTAS;
    }

}
