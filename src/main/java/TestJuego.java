public class TestJuego {
//
//    public static void main(String[] args) {
//        testPresentacion();
//        testCrearJugadores();
//        testRepartirCartas();
//        testPedirCaracteristica();
//        testMostrarGanadores();
//        testJugarJugada();
//        testMostrarResultados();
//        testActualizarContadores1();
//        testActualizarContadores2();
//        testActualizarContadores3();
//        testActualizarContadores4();
//        testActualizarContadores5();
//    }
//
//    public static void testPresentacion() {
//        Juego juego = new Juego();
//        juego.presentacion();
//    }
//
//    private static void testCrearJugadores() {
//        Juego juego = new Juego();
//        juego.crearJugadores();
//        System.out.println("Nombres de los jugadores:");
//        System.out.println("Jugador 1: " + juego.getJugador(1).getNombre());
//        System.out.println("Jugador 2: " + juego.getJugador(2).getNombre());
//        System.out.println("Jugador 3: " + juego.getJugador(3).getNombre());
//        System.out.println("Jugador 4: " + juego.getJugador(4).getNombre());
//    }
//
//    private static void testRepartirCartas() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.repartirCartas();
//        System.out.println("Cartas de los jugadores:");
//        System.out.println("Jugador 1: " + juego.getJugador(1).getNumeroCartas());
//        System.out.println("Jugador 2: " + juego.getJugador(2).getNumeroCartas());
//        System.out.println("Jugador 3: " + juego.getJugador(3).getNumeroCartas());
//        System.out.println("Jugador 4: " + juego.getJugador(4).getNumeroCartas());
//        System.out.println("Cartas de los jugadores:");
//        System.out.println(juego.getJugador(1).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(1).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(1).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(1).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(2).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(2).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(2).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(2).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(3).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(3).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(3).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(3).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(4).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(4).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(4).sacarCarta().getNombre());
//        System.out.println(juego.getJugador(4).sacarCarta().getNombre());
//        System.out.println("Turno: " + juego.getTurno());
//    }
//
//    private static void testPedirCaracteristica() {
//        Juego juego = new Juego();
//        juego.setTurno(1);
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        int i = juego.pedirCaracteristica();
//        System.out.println("Característica: " + i);
//    }
//
//    private static void testMostrarGanadores() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.mostrarGanadores(1);
//        juego.mostrarGanadores(5);
//        juego.mostrarGanadores(7);
//        juego.mostrarGanadores(9);
//        juego.mostrarGanadores(12);
//        juego.mostrarGanadores(15);
//    }
//
//    private static void testJugarJugada() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.repartirCartas();
//        juego.jugarJugada();
//    }
//
//    private static void testMostrarResultados() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.mostrarResultados();
//    }
//
//    private static void testActualizarContadores1() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.actualizarContadores(1);
//        juego.actualizarContadores(2);
//        juego.actualizarContadores(4);
//        juego.actualizarContadores(8);
//        juego.mostrarResultados();
//    }
//
//    private static void testActualizarContadores2() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.actualizarContadores(2);
//        juego.actualizarContadores(1);
//        juego.actualizarContadores(8);
//        juego.actualizarContadores(4);
//        juego.mostrarResultados();
//    }
//
//    private static void testActualizarContadores3() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.actualizarContadores(15);
//        juego.actualizarContadores(7);
//        juego.actualizarContadores(3);
//        juego.actualizarContadores(9);
//        juego.mostrarResultados();
//    }
//
//    private static void testActualizarContadores4() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.actualizarContadores(14);
//        juego.actualizarContadores(13);
//        juego.actualizarContadores(11);
//        juego.actualizarContadores(12);
//        juego.mostrarResultados();
//    }
//
//    private static void testActualizarContadores5() {
//        Juego juego = new Juego();
//        juego.setJugador(new Jugador("Jugador1"), 1);
//        juego.setJugador(new Jugador("Jugador2"), 2);
//        juego.setJugador(new Jugador("Jugador3"), 3);
//        juego.setJugador(new Jugador("Jugador4"), 4);
//        juego.actualizarContadores(6);
//        juego.actualizarContadores(10);
//        juego.actualizarContadores(5);
//        juego.actualizarContadores(15);
//        juego.mostrarResultados();
//    }

}
