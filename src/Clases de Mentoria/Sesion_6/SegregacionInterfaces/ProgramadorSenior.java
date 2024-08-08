package SegregacionInterfaces;

public class ProgramadorSenior implements Programador{

    private String nombre;
    private double salario;


    public ProgramadorSenior(double salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }

    @Override
    public void escribirCodigo() {
        System.out.println("Programador Senior codeando");
    }

    @Override
    public void revisarCodigo() {
        System.out.println("Programador Senior revisando...");
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
