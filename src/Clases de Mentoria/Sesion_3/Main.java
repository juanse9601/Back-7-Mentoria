package Sesion_3;

public class Main {
    public static void main(String[] args) {
        //Herencia
        //declarar variables

        Trabajador trabajador;  //clase padre
        Empleado empleado;       //clase hija
        Consultor consultor;     //clase hija

        trabajador = new Trabajador("Jorge");
        empleado = new Empleado("Armando",120.000);
        consultor = new Consultor("Juan",70,50000);

        //Impresion
        System.out.println(trabajador);
        System.out.println(consultor);
        System.out.println(empleado);

        //Polimorfismo
        Trabajador[] trabajadores =  new Trabajador[2];
        trabajadores[0]= new Empleado("Luis",120.000);
        trabajadores[1]= new Consultor("Juan",56,60000);

        for (int i = 0; i < 2 ; i ++){
            System.out.println(trabajadores[i].calcularPago());
        }
    }
}
