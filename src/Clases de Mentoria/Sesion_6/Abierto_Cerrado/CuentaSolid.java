package Sesion_7.Abierto_Cerrado;

public abstract class CuentaSolid extends CuentaOriginal {

    public CuentaSolid(double saldo, String tipoCuenta) {
        super(saldo, tipoCuenta);
    }

    public abstract void depositar(double monto);

    public abstract void retirar(double monto);


}
