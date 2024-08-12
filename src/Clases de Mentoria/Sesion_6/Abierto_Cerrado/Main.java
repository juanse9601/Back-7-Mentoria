package Sesion_7.Abierto_Cerrado;

public class Main {
    public static void main(String[] args) {

        CuentaOriginal cuentaAhorro = new CuentaOriginal(1000,"Cuenta ahorro");
        CuentaOriginal cuentaCorriente = new CuentaOriginal(500,"Cuenta corriente");

        cuentaCorriente.depositar(200);
        cuentaAhorro.retirar(100);

        System.out.println("Saldo cuenta corriente:" + cuentaCorriente.getSaldo());
        System.out.println("Saldo cuenta ahorro:" + cuentaAhorro.getSaldo());


        CuentaOriginal cuentaAhorro2 = new CuentaAhorro(1000, "Cuenta ahorro");
        CuentaOriginal cuentaCorriente2 = new CuentaCorriente(500,"Cuenta Corriente");

        cuentaCorriente2.depositar(200);
        cuentaAhorro2.retirar(100);

        System.out.println("Saldo de cuenta corriente:" + cuentaCorriente2.getSaldo());
        System.out.println("Saldo de cuenta de ahorro: " + cuentaAhorro2.getSaldo());


        CuentaSolid cuentaSolid = new CuentaAhorro(1000,"Cuenta ahorro");
        cuentaSolid.depositar(200);
        cuentaSolid.retirar(100);

        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(1000,"Cuenta ahorro");
        cuentaAhorro1.depositar(200);
        cuentaAhorro1.retirar(100);


    }
}
