import java.util.Scanner;

/**
 * Clase que representa un juego de cartas de coches que tiene todos los elementos
 * necesarios para jugar una partida completa según las reglas establecidas.
 */
public class Juego {

    // region Atributos
    private Jugador jugador1, jugador2, jugador3, jugador4;

    private Baraja baraja;

    private int turno;

    private int contador1, contador2, contador3, contador4;

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
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.print("Nombre del jugador 1: ");
        nombre = teclado.nextLine();
        jugador1 = new Jugador(nombre);

        System.out.print("Nombre del jugador 2: ");
        nombre = teclado.nextLine();
        jugador2 = new Jugador(nombre);

        System.out.print("Nombre del jugador 3: ");
        nombre = teclado.nextLine();
        jugador3 = new Jugador(nombre);

        System.out.print("Nombre del jugador 4: ");
        nombre = teclado.nextLine();
        jugador4 = new Jugador(nombre);
    }

    /**
     * Devuelve el jugador que se pasa como parámetro
     * @param numeroJugador número del jugador que se quiere devolver del 1 al 4
     * @return referencia al jugador
     */
    public Jugador getJugador(int numeroJugador) {
        if (numeroJugador == 1) {
            return jugador1;
        } else if (numeroJugador == 2) {
            return jugador2;
        } else if (numeroJugador == 3) {
            return jugador3;
        } else if (numeroJugador == 4) {
            return jugador4;
        }
        return null;
    }

    /**
     * Asigna el jugador que se pasa como parámetro al atributo correspondiente en base al número de jugador.
     * @param jugador referencia a una instancia de Jugador
     * @param numeroJugador número del jugador al que corresponde del 1 al 4
     */
    public void setJugador(Jugador jugador, int numeroJugador) {
        if (numeroJugador == 1) {
            jugador1 = jugador;
        } else if (numeroJugador == 2) {
            jugador2 = jugador;
        } else if (numeroJugador == 3) {
            jugador3 = jugador;
        } else if (numeroJugador == 4) {
            jugador4 = jugador;
        }
    }

    /**
     * Devuelve el turno actual
     * @return
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Asigna el turno actual, 1 para el jugador 1, 2 para el jugador 2, etc.
     * @param turno número del turno actual
     */
    public void setTurno(int turno) {
        this.turno = turno % 4;
    }

    /**
     * Reparte las cartas entre los jugadores.
     * Crea una baraja y va sacando cartas que reparte a los jugadores
     * de uno en uno hasta que todos tienen 4 cartas.
     * Inicializa el turno a 0.
     */
    public void repartirCartas() {
        baraja = new Baraja();
        jugador1.meterCarta(baraja.sacarCarta());
        jugador2.meterCarta(baraja.sacarCarta());
        jugador3.meterCarta(baraja.sacarCarta());
        jugador4.meterCarta(baraja.sacarCarta());
        jugador1.meterCarta(baraja.sacarCarta());
        jugador2.meterCarta(baraja.sacarCarta());
        jugador3.meterCarta(baraja.sacarCarta());
        jugador4.meterCarta(baraja.sacarCarta());
        jugador1.meterCarta(baraja.sacarCarta());
        jugador2.meterCarta(baraja.sacarCarta());
        jugador3.meterCarta(baraja.sacarCarta());
        jugador4.meterCarta(baraja.sacarCarta());
        jugador1.meterCarta(baraja.sacarCarta());
        jugador2.meterCarta(baraja.sacarCarta());
        jugador3.meterCarta(baraja.sacarCarta());
        jugador4.meterCarta(baraja.sacarCarta());
        turno = 0;
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
        turno++;
        Carta carta1 = jugador1.sacarCarta();
        Carta carta2 = jugador2.sacarCarta();
        Carta carta3 = jugador3.sacarCarta();
        Carta carta4 = jugador4.sacarCarta();
        Jugada jugada = new Jugada(carta1, carta2, carta3, carta4);
        jugada.pintarCarta(turno);
        int caracteristica = pedirCaracteristica();
        jugada.pintaCartas();
        int ganadores = jugada.ganadores(caracteristica);
        actualizarContadores(ganadores);
        mostrarGanadores(ganadores);
    }

    /**
     * Pide la característica con la que se quiere competir.
     * Muestra en una línea las características con su número.
     * @return número de la característica
     */
    public int pedirCaracteristica() {
        String nombre = getJugador(turno).getNombre();
        System.out.println(nombre + ", elige característica");
        Scanner teclado = new Scanner(System.in);
        int caracteristica;
        System.out.print("1. Motor    ");
        System.out.print("2. Potencia    ");
        System.out.print("3. Velocidad    ");
        System.out.print("4. Consumo    ");
        System.out.println();
        System.out.print("Característica [1-4]: ");
        caracteristica = teclado.nextInt();
        return caracteristica;
    }

    /**
     * Actualiza los contadores de los jugadores que han ganado la jugada.
     * Por ejemplo, si ganadores vale 6 han ganado los jugadores 2 y 3 (2+4=6)
     * y habría que incrementar sus contadores.
     * @param ganadores valor que representa los jugadores que han ganado la jugada, ej. 6
     * @see Jugada#ganadores(int)
     */
    public void actualizarContadores(int ganadores) {
        int g = ganadores;
        if ((g & 1) == 1) {
            contador1++;
        }
        if ((g & 2) == 2) {
            contador2++;
        }
        if ((g & 4) == 4) {
            contador3++;
        }
        if ((g & 8) == 8) {
            contador4++;
        }
    }

    /**
     * Muestra los ganadores de la jugada en una lista de nombres separados por espacio.
     * @param ganadores valor que representa los jugadores que han ganado la jugada.
     * @see Jugada#ganadores(int)
     */
    public void mostrarGanadores(int ganadores) {
        String nombres = "";
        if ((ganadores & 1) == 1) {
            nombres += jugador1.getNombre() + " ";
        }
        if ((ganadores & 2) == 2) {
            nombres += jugador2.getNombre() + " ";
        }
        if ((ganadores & 4) == 4) {
            nombres += jugador3.getNombre() + " ";
        }
        if ((ganadores & 8) == 8) {
            nombres += jugador4.getNombre() + " ";
        }
        System.out.println("Ganador(es) de la jugada: " + nombres);
    }

    /**
     * Muestra los resultados de la partida.
     * Muestra el nombre de cada jugador y el número de veces que ha ganado
     * aunque al ganar haya empatado con otro jugador.
     */
    public void mostrarResultados() {
        System.out.println("Resultados:");
        System.out.println("-".repeat(20));
        System.out.println(jugador1.getNombre() + " ha ganado: " + contador1);
        System.out.println(jugador2.getNombre() + " ha ganado: " + contador2);
        System.out.println(jugador3.getNombre() + " ha ganado: " + contador3);
        System.out.println(jugador4.getNombre() + " ha ganado: " + contador4);
        System.out.println("-".repeat(20));
    }

}
