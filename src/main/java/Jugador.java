/**
 * Clase Jugador que representa a un jugador de un juego de cartas de coches.
 * Tiene un nombre y 4 cartas, junto con un contador de cartas.
 * El jugador puede sacar una carta si tiene cartas y
 * meter una carta si tiene menos de 4 cartas.
 * La lógica de sacar y meter cartas es de tipo LIFO (Last In First Out) o pila.
 */
public class Jugador {

    // region Atributos
    // TODO 41: atributos

    // endregion

    /**
     * Constructor de la clase Jugador
     * @param nombre del jugador
     */
    public Jugador(String nombre) {
        // TODO 42: Jugador
    }

    /**
     * Devuelve el nombre del jugador
     * @return nombre del jugador
     */
    // TODO 43.1: getter 1

    /**
     * Devuelve el número de cartas por jugar del jugador
     * @return
     */
    // TODO 43.2: getter 2

    /**
     * Según el número de cartas que tenga el jugador
     * asigna a la carta atributo correspondiente (de la 1 a la 4) la carta pasada por parámetro
     * @return carta pasada como parámetro
     */
    public void meterCarta(Carta carta) {
        // TODO 44: meterCarta
    }

    /**
     * Devuelve la carta que saca el jugador dependiendo de las cartas que tenga
     * Si tiene 4 cartas, devuelve la carta4 y la pone a null
     * Si tiene 3 cartas, devuelve la carta3 y la pone a null
     * Si tiene 2 cartas, devuelve la carta2 y la pone a null
     * Si tiene 1 carta, devuelve la carta1 y la pone a null
     * Decrementa el número de cartas.
     * @return carta sacada
     */
    public Carta sacarCarta() {
        // TODO 45: sacarCarta
        return null;
    }

}
