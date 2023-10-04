/**
 * Clase que representa una jugada del juego de cartas de coches.
 */
public class Jugada {


    // TODO 31: constantes

    // region Atributos
    // TODO 32: atributos

    // endregion

    /**
     * Constructor de la clase Jugada
     */
    public Jugada(Carta carta1, Carta carta2, Carta carta3, Carta carta4) {
        // TODO 33: Jugada
    }

    /**
     * Devuelve un valor numérico que representa los jugadores que ganan.
     * Puede ser que ganen varios jugadores cuando empatan, por lo que
     * el valor devuelto es la suma de los valores de los jugadores (1, 2, 4, 8).
     * Cuando gana el primer jugador devuelve 1, cuando gana el segundo devuelve 2,
     * cuando ganan el tercero devuelve 4 y cuando gana el cuarto devuelve 8.
     * Cuando ganan varios jugadores porque empatan devuelve la suma de sus valores.
     * Es decir, si ganan el primero y el segundo devuelve 3,
     * si ganan el primero y el tercero devuelve 5,
     * si ganan el primero y el segundo y el tercero devuelve 7,
     * si ganan el segundo y el cuarto devuelve 10, etc.
     * @return valor numérico que representa a los ganadores
     */
    public int ganadores(int caracteristica) {
        // TODO 34: ganadores
        return 0;
    }

    /**
     * Pinta las cartas de la jugada en sentido horizontal
     * poniendo en la misma fila los nombres de las cartas y
     * en las sucesivas filas los valores de las mismas características.
     */
    public void pintaCartas() {
        // TODO 35: Descomentar y adaptar nombres atributos
//        String s = "";
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|\n";
//        s += "|" + String.format("%-22s",carta1.getNombre());
//        s += "|" + String.format("%-22s",carta2.getNombre());
//        s += "|" + String.format("%-22s",carta3.getNombre());
//        s += "|" + String.format("%-22s",carta4.getNombre());
//        s += "|\n";
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|\n";
//        s += "|" + String.format("%-22s","Motor: " + carta1.getMotor() + " cc");
//        s += "|" + String.format("%-22s","Motor: " + carta2.getMotor() + " cc");
//        s += "|" + String.format("%-22s","Motor: " + carta3.getMotor() + " cc");
//        s += "|" + String.format("%-22s","Motor: " + carta4.getMotor() + " cc");
//        s += "|\n";
//        s += "|" + String.format("%-22s","Potencia: " + carta1.getPotencia() + " CV");
//        s += "|" + String.format("%-22s","Potencia: " + carta2.getPotencia() + " CV");
//        s += "|" + String.format("%-22s","Potencia: " + carta3.getPotencia() + " CV");
//        s += "|" + String.format("%-22s","Potencia: " + carta4.getPotencia() + " CV");
//        s += "|\n";
//        s += "|" + String.format("%-22s","Velocidad: " + carta1.getVelocidad() + " km/h");
//        s += "|" + String.format("%-22s","Velocidad: " + carta2.getVelocidad() + " km/h");
//        s += "|" + String.format("%-22s","Velocidad: " + carta3.getVelocidad() + " km/h");
//        s += "|" + String.format("%-22s","Velocidad: " + carta4.getVelocidad() + " km/h");
//        s += "|\n";
//        s += "|" + String.format("%-22s","Consumo 100km: " + carta1.getConsumo() + " l");
//        s += "|" + String.format("%-22s","Consumo 100km: " + carta2.getConsumo() + " l");
//        s += "|" + String.format("%-22s","Consumo 100km: " + carta3.getConsumo() + " l");
//        s += "|" + String.format("%-22s","Consumo 100km: " + carta4.getConsumo() + " l");
//        s += "|\n";
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|" + "-".repeat(22);
//        s += "|\n";
//        System.out.println(s);
    }


    /**
     * Pinta la carta que se le pasa como parámetro.
     * Utiliza el método pintar() de la clase Carta.
     * @param numero
     */
    public void pintarCarta(int numero) {
        // TODO 36: pintarCarta
    }

    /**
     * Pinta los ganadores de cada característica en la jugada.
     * Se puede ver según la característica que se elija quién ganaría.
     * El valor mostrado es el devuelto por el método gana.
     */
    public void pintaGanadoresCaracteristicas() {
        // TODO 37: Descomentar y adaptar nombres atributos
//        System.out.println("=".repeat(22));
//        System.out.println("Ganador a MOTOR: " + ganadores(MOTOR));
//        System.out.println("Ganador a POTENCIA: " + ganadores(POTENCIA));
//        System.out.println("Ganador a VELOCIDAD: " + ganadores(VELOCIDAD));
//        System.out.println("Ganador a CONSUMO: " + ganadores(CONSUMO));
//        System.out.println("=".repeat(22));
    }

    /**
     * Pinta los ganadores de la jugada en una línea separados los ganadores por comas.
     * Los valores son los devueltos por el método gana.
     */
    public void pintaGanadores() {
        // TODO 38: Descomentar y adaptar nombres atributos
//        System.out.println( ganadores(MOTOR) + ", " +
//                            ganadores(POTENCIA) + ", " +
//                            ganadores(VELOCIDAD) + ", " +
//                            ganadores(CONSUMO));
    }

}
