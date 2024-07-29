package Sesion_3;

public class Empleado extends Trabajador{

    private double sueldo;
    private double deducciones;

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        this.deducciones = 0.45 * sueldo;
    }

    //Polimorfismo = Poli = diferentes o varias    // morfismo =  formas

    public double calcularPago(){
        return (sueldo - deducciones);
    }

    public String toString1(){
        return "Empleado: " + super.toString();
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                ", deducciones=" + deducciones +
                '}';
    }
}
