package Sesion_7.Abierto_Cerrado;

public class CuentaAhorro extends CuentaSolid{

    private double saldo;

    public CuentaAhorro(double saldo, String tipoCuenta) {
        super(saldo, tipoCuenta);
    }

    @Override
    public void depositar(double monto) {
        saldo = saldo + monto;
        aplicarInteres(monto);
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto){
            saldo = saldo - monto;
        } else{
            System.out.println("Fondos insuficientes");
        }
    }

    private void aplicarInteres(double monto){
        //logica para aplicar interes
    }
}
