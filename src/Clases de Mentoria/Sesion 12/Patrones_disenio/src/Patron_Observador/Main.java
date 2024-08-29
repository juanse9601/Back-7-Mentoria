package Patron_Observador;

public class Main {
    public static void main(String[] args) {

        Clima clima = new Clima();

        DispositivoMovil movil1 = new DispositivoMovil("Movil 1");
        DispositivoMovil movil2 = new DispositivoMovil("Movil 2");
        DispositivoMovil movil3 = new DispositivoMovil("Movil 3");

        System.out.println("Actulizando el clima sin observadores");
        clima.actualizarClima(20.0, 50.0);

        System.out.println("---------------------------------------------------------------");

        System.out.println("Agregando observadores");
        clima.registrarObservador(movil1);
        clima.registrarObservador(movil2);

        System.out.println("---------------------------------------------------------------");

        System.out.println("Actualizando el clima con los dos suscriptores");
        clima.actualizarClima(15.0,80.0);

        System.out.println("---------------------------------------------------------------");

        System.out.println("Eliminando observador no agregado");
        clima.eliminarObservador(movil3);

        System.out.println("---------------------------------------------------------------");
        clima.mostrarObservadores();

        System.out.println("---------------------------------------------------------------");

        System.out.println("Eliminando observador");
        clima.eliminarObservador(movil2);

        System.out.println("---------------------------------------------------------------");
        clima.mostrarObservadores();

        System.out.println("---------------------------------------------------------------");
        System.out.println("Actualizando clima a movil 1");
        clima.actualizarClima(13.0,76.0);

        System.out.println();
        clima.mostrarObservadores();



    }
}
