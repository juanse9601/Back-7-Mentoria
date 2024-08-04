package Composicion;

public class Main {

    public static void main(String[] args) {


        Direccion direccion = new Direccion("calle 24","35","23","Medellin","Envigado");
        FechaNacimiento fechaNacimiento = new FechaNacimiento(1987,07,12);

        Cliente cliente = new Cliente("Carlos","Mejia","Castro",fechaNacimiento,direccion);

        System.out.println(cliente.toString());

    }
}
