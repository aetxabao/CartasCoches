/**
 * Clase que representa una carta de un juego de cartas de coches
 */
public class Carta {

    /** Constantes para la característica del motor */
    public final int MOTOR = 1;
    /** Constantes para la característica de la potencia */
    public final int POTENCIA = 2;
    /** Constantes para la característica de la velocidad */
    public final int VELOCIDAD = 3;
    /** Constantes para la característica del consumo */
    public final int CONSUMO = 4;
    
    /** Nombre del modelo */
    private String nombre;
    /** País de fabricación */
    private String pais;
    /** Centímetros cúbicos del motor */
    private int motor;
    /** Caballos de potencia */
    private int potencia;
    /** Velocidad máxima */
    private int velocidad;
    /** Consumo en litros a los 100 km */
    private double consumo;

    /**
     * Constructor por defecto
     */
    public Carta() {
        this.nombre = "";
        this.pais = "";
        this.motor = 0;
        this.potencia = 0;
        this.velocidad = 0;
        this.consumo = 0.0;
    }

    /**
     * Constructor con parámetros
     * @param nombre Nombre del modelo
     * @param pais País de fabricación
     * @param motor Centímetros cúbicos del motor
     * @param potencia Caballos de potencia
     * @param velocidad Velocidad máxima
     * @param consumo Consumo en litros a los 100 km
     */
    public Carta(String nombre, String pais, int motor, int potencia, int velocidad, double consumo) {
        this.nombre = nombre;
        this.pais = pais;
        this.motor = motor;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.consumo = consumo;
    }

    // region Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    //endregion

    /**
     * Compara la carta actual con otra carta
     * @param otra Carta con la que comparar
     * @param caracteristica Característica a comparar, valores de 1 a 4
     * @return true si la carta actual gana o empata a la otra, false en caso contrario
     */
    public boolean gana(Carta otra, int caracteristica) {
        boolean gana = false;
        switch (caracteristica) {
            case MOTOR:
                gana = motor >= otra.motor;
                break;
            case POTENCIA:
                gana = potencia >= otra.potencia;
                break;
            case VELOCIDAD:
                gana = velocidad >= otra.velocidad;
                break;
            case CONSUMO:
                gana = consumo <= otra.consumo;
                break;
        }
        return gana;
    }

    /**
     * Pinta la carta por pantalla
     */
    public void pintar() {
        int n, t = 22;
        String s;
        System.out.println("|" + "-".repeat(t) + "|");
        s = nombre + " (" + pais + ")";
        n = t - s.length();
        System.out.println("|" + s + " ".repeat(n) + "|");
        System.out.println("|" + "-".repeat(t) + "|");
        s = "Motor: " + motor + " cc";
        n = t - s.length();
        System.out.println("|" + s + " ".repeat(n) + "|");
        s = "Potencia: " + potencia + " CV";
        n = t - s.length();
        System.out.println("|" + s + " ".repeat(n) + "|");
        s = "Velocidad: " + velocidad + " km/h";
        n = t - s.length();
        System.out.println("|" + s + " ".repeat(n) + "|");
        s = "Consumo 100km: " + consumo + " l";
        n = t - s.length();
        System.out.println("|" + s + " ".repeat(n) + "|");
        System.out.println("|" + "-".repeat(t) + "|");
    }

}
