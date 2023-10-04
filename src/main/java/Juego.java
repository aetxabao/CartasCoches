import java.util.Scanner;

/**
 * Clase que representa un juego de cartas de coches que tiene todos los elementos
 * necesarios para jugar una partida completa según las reglas establecidas.
 */
public class Juego {

    // region Atributos
    // TODO 51: atributos
    // endregion

    /**
     * Imprime un mensaje de presentación del juego
     */
    public void presentacion() {
        int n = 93, m = 33;
        String s = "JUEGO DE CARTAS DE COCHES";
        System.out.println("~".repeat(n));
        System.out.println("~" + " ".repeat(m) + s + " ".repeat(m) + "~");
        System.out.println("~".repeat(n));
    }

    /**
     * Crea los jugadores del juego. Pide el nombre de cada uno de ellos por teclado.
     */
    public void crearJugadores() {
        // TODO 52: Descomentar y adaptar el código a los atributos de la clase Juego
//        Scanner teclado = new Scanner(System.in);
//        String nombre;
//
//        System.out.print("Nombre del jugador 1: ");
//        nombre = teclado.nextLine();
//        jugador1 = new Jugador(nombre);
//
//        System.out.print("Nombre del jugador 2: ");
//        nombre = teclado.nextLine();
//        jugador2 = new Jugador(nombre);
//
//        System.out.print("Nombre del jugador 3: ");
//        nombre = teclado.nextLine();
//        jugador3 = new Jugador(nombre);
//
//        System.out.print("Nombre del jugador 4: ");
//        nombre = teclado.nextLine();
//        jugador4 = new Jugador(nombre);
    }

    /**
     * Devuelve el jugador que se pasa como parámetro
     * @param numeroJugador número del jugador que se quiere devolver del 1 al 4
     * @return referencia al jugador
     */
    public Jugador getJugador(int numeroJugador) {
        // TODO 53: getJugador
        return null;
    }

    /**
     * Asigna el jugador que se pasa como parámetro al atributo correspondiente en base al número de jugador.
     * @param jugador referencia a una instancia de Jugador
     * @param numeroJugador número del jugador al que corresponde del 1 al 4
     */
    public void setJugador(Jugador jugador, int numeroJugador) {
        // TODO 54: setJugador
    }

    /**
     * Devuelve el turno actual
     * @return
     */
    // TODO 55: getTurno

    /**
     * Asigna el turno actual, 1 para el jugador 1, 2 para el jugador 2, etc.
     * @param turno número del turno actual
     */
    // TODO 56: setTurno

    /**
     * Reparte las cartas entre los jugadores.
     * Crea una baraja y va sacando cartas que reparte a los jugadores
     * de uno en uno hasta que todos tienen 4 cartas.
     * Inicializa el turno a 0.
     */
    public void repartirCartas() {
        // TODO 56: repartirCartas
    }

    /**
     * Juega una partida completa que consiste en jugar cuatro jugadas.
     */
    public void jugar() {
        jugarJugada();
        jugarJugada();
        jugarJugada();
        jugarJugada();
    }

    /**
     * Juega una jugada. Se incrementa el turno para que todos decidan la característica una vez.
     * Se saca una carta de cada jugador y se crea una jugada con ellas.
     * Se pinta la carta del jugador que le toca jugar y
     * se pide la característica con la que quiere competir.
     * A continuación se pintan todas las cartas de la jugada y
     * se obtiene el valor devuelto por el método ganadores de la jugada.
     * Con este valor se actualizan los contadores de los jugadores
     * que representan el número de veces que han ganado aun empatando.
     * Finalmente, se muestran los nombres de todos los ganadores de la jugada.
     */
    public void jugarJugada() {
        // TODO 56: jugarJugada
    }

    /**
     * Pide la característica con la que se quiere competir.
     * Muestra en una línea las características con su número.
     * @return número de la característica
     */
    public int pedirCaracteristica() {
        // TODO 57: Descomentar y adaptar el código a los atributos de la clase Juego
//        String nombre = getJugador(turno).getNombre();
//        System.out.println(nombre + ", elige característica");
//        Scanner teclado = new Scanner(System.in);
//        int caracteristica;
//        System.out.print("1. Motor    ");
//        System.out.print("2. Potencia    ");
//        System.out.print("3. Velocidad    ");
//        System.out.print("4. Consumo    ");
//        System.out.println();
//        System.out.print("Característica [1-4]: ");
//        caracteristica = teclado.nextInt();
//        return caracteristica;
        return 0;
    }

    /**
     * Actualiza los contadores de los jugadores que han ganado la jugada.
     * Por ejemplo, si ganadores vale 6 han ganado los jugadores 2 y 3 (2+4=6)
     * y habría que incrementar sus contadores.
     * @param ganadores valor que representa los jugadores que han ganado la jugada, ej. 6
     * @see Jugada#ganadores(int)
     */
    public void actualizarContadores(int ganadores) {
        // TODO 58: actualizarContadores
    }

    /**
     * Muestra los ganadores de la jugada en una lista de nombres separados por espacio.
     * @param ganadores valor que representa los jugadores que han ganado la jugada.
     * @see Jugada#ganadores(int)
     */
    public void mostrarGanadores(int ganadores) {
        // TODO 59: mostrarGanadores
    }

    /**
     * Muestra los resultados de la partida.
     * Muestra el nombre de cada jugador y el número de veces que ha ganado
     * aunque al ganar haya empatado con otro jugador.
     */
    public void mostrarResultados() {
        // TODO 60: mostrarResultados
    }

}
