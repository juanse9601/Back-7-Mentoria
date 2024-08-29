package Patron_Factory;

public class Main {

    public static void main(String[] args) {
        Figura figura1 = FabricaFigura.crearFigura("Patron_Factory.Cuadrado");
        figura1.dibujar();

        Figura figura2 = FabricaFigura.crearFigura("Patron_Factory.Circulo");
        figura2.dibujar();
    }

}
