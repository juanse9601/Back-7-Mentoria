package Sesion_3;

public class Consultor extends Trabajador{

    private int horas;
    private long tarifa;


    public Consultor(String nombre,int horas, long tarifa) {
        super(nombre);
        this.horas = horas;
        this.tarifa= tarifa;
    }

    public double calcularPago(){
        return (horas * tarifa);
    }

    public String toString1(){
        return "Consultor: " + super.toString();
    }

    @Override
    public String toString() {
        return "Consultor{" +
                "horas=" + horas +
                ", tarifa=" + tarifa +
                '}';
    }
}
