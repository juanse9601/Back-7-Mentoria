package Patron_Factory;

public class FabricaFigura {

    public FabricaFigura(){}

    public static Figura crearFigura(String tipo){
        if (tipo.equalsIgnoreCase("Patron_Factory.Cuadrado")){
            return new Cuadrado();
        } else {
            return tipo.equalsIgnoreCase("Patron_Factory.Circulo") ? new Circulo() : null;
        }
    }
}
