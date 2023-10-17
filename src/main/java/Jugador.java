/**
 * Clase Jugador que representa a un jugador de un juego de cartas de coches.
 * Tiene un nombre y 4 cartas, junto con un contador de cartas.
 * El jugador puede sacar una carta si tiene cartas y
 * meter una carta si tiene menos de 4 cartas.
 * La lógica de sacar y meter cartas es de tipo LIFO (Last In First Out) o pila.
 */
public class Jugador {

    // region Atributos
    private String nombre;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;
    private Carta carta4;
    private int numeroCartas;

    // endregion

    /**
     * Constructor de la clase Jugador
     * @param nombre del jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.numeroCartas = 0;
    }

    /**
     * Devuelve el nombre del jugador
     * @return nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el número de cartas por jugar del jugador
     * @return
     */
    public int getNumeroCartas() {
        return numeroCartas;
    }

    /**
     * Según el número de cartas que tenga el jugador
     * asigna a la carta atributo correspondiente (de la 1 a la 4) la carta pasada por parámetro
     * @return carta pasada como parámetro
     */
    public void meterCarta(Carta carta) {
        if (numeroCartas == 0) {
            carta1 = carta;
        } else if (numeroCartas == 1) {
            carta2 = carta;
        } else if (numeroCartas == 2) {
            carta3 = carta;
        } else if (numeroCartas == 3) {
            carta4 = carta;
        }
        numeroCartas++;
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
        Carta carta = null;
        if (numeroCartas == 1) {
            carta = carta1;
            carta1 = null;
        } else if (numeroCartas == 2) {
            carta = carta2;
            carta2 = null;
        } else if (numeroCartas == 3) {
            carta = carta3;
            carta3 = null;
        } else if (numeroCartas == 4) {
            carta = carta4;
            carta4 = null;
        }
        numeroCartas--;
        return carta;
    }

}
