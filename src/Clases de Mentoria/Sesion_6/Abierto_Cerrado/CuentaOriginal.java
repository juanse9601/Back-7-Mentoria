package Sesion_7.Abierto_Cerrado;

public class CuentaOriginal {

    private double saldo;
    public String tipoCuenta;

    public CuentaOriginal(double saldo, String tipoCuenta) {
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }


    public void depositar(double monto){
        this.saldo += monto;
    }

    public void retirar(double monto){
        if(saldo >= monto){
            saldo -= monto;
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }

}
