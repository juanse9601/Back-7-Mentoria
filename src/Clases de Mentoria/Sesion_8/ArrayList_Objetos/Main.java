package ArrayList_Objetos;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        CuentaBancaria cuenta1 = new CuentaBancaria("001","Juan Perez",1500.50);
        CuentaBancaria cuenta2 = new CuentaBancaria("002","Maria Lopez",2500.50);
        CuentaBancaria cuenta3 = new CuentaBancaria("003","Carlos Gomez",500.00);

        //Añadir cuentas a la lista
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);
        banco.agregarCuenta(cuenta3);

        System.out.println("Mostrar todas las cuentas");
        banco.mostrarCuentas();

        System.out.println("Buscar una cuenta 002");
        CuentaBancaria cuentaBuscada = banco.buscarCuenta("002");

        if (cuentaBuscada != null){
            System.out.println("Cuenta encontrada:" + cuentaBuscada);
        }else {
            System.out.println("Cuenta no encontrada");
        }


        System.out.println("Eliminar cuenta 001:");
        banco.eliminarCuenta("001");

        System.out.println("Mostrar la lista despes de los procesos");
        banco.mostrarCuentas();
    }
}
