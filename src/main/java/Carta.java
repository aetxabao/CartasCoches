/**
 * Clase que representa una carta de un juego de cartas de coches
 */
public class Carta {

    // TODO 11: constantes

    //region atributos
    // TODO 12: atributos

    //endregion

    /**
     * Constructor por defecto
     */
    public Carta() {
        // TODO 13: Carta 1
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
        // TODO 14: Carta 2
    }

    // region getters y setters
    // TODO 15: getters y setters

    //endregion

    /**
     * Compara la carta actual con otra carta
     * @param otra Carta con la que comparar
     * @param caracteristica Característica a comparar, valores de 1 a 4
     * @return true si la carta actual gana o empata a la otra, false en caso contrario
     */
    public boolean gana(Carta otra, int caracteristica) {
        // TODO 16: gana
        return false;
    }

    /**
     * Pinta la carta por pantalla
     */
    public void pintar() {
        // TODO 17: pintar
    }

}
