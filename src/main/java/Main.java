public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.presentacion();
        juego.crearJugadores();
        juego.repartirCartas();
        juego.jugar();
        juego.mostrarResultados();
    }

}
