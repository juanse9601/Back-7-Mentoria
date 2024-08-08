package SegregacionInterfaces;

public class DiseñadorUI implements Diseñador{

    private String nombre;
    private double salario;

    public DiseñadorUI(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public void diseñarInterfaz() {
        System.out.println("Diseñador UI diseñando interfaz...");
    }

    @Override
    public void revisarDiseño() {
        System.out.println("Diseñador UI REVISANDO DISEÑO...");
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
