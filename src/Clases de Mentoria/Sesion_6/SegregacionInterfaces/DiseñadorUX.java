package SegregacionInterfaces;

public class DiseñadorUX implements Diseñador{

    private String nombre;
    private double salario;

    public DiseñadorUX(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public void diseñarInterfaz() {
        System.out.println("Diseñador UX diseñando interfaz...");
    }

    @Override
    public void revisarDiseño() {
        System.out.println("Diseñador UX REVISANDO DISEÑO...");
    }

    @Override
    public String obtenerNombre() {
        return "";
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
