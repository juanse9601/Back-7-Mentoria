package PrincipioLiskov;

public class Cuadrado extends Forma{

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }



    @Override
    double calcularArea() {
        return lado * lado;
    }
}
