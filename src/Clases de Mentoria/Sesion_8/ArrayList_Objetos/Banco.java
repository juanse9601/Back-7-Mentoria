package ArrayList_Objetos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Banco {

    private LinkedList<CuentaBancaria> cuentas;

    public Banco(){
        this.cuentas = new LinkedList<>();
    }




    public void agregarCuenta(CuentaBancaria cuenta){
        cuentas.add(cuenta);
        System.out.println("Cuenta agregada: " + cuenta);
    }




    public void eliminarCuenta(String numeroCuenta){
        for (int i = 0; i < cuentas.size(); i ++){
           if (cuentas.get(i).getNumeroCuenta().equals(numeroCuenta)){
               System.out.println("Cuenta eliminada: " + cuentas.get(i));
               cuentas.remove(i);
               return;
           }

        }

        System.out.println("Cuenta no encontrada:" + numeroCuenta);
    }



    public CuentaBancaria buscarCuenta(String numeroCuenta){
        for (CuentaBancaria cuenta : cuentas){
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)){
                return cuenta;
            }
        }

        return null;
    }




    public void mostrarCuentas(){
        for (CuentaBancaria cuenta : cuentas){
            System.out.println(cuenta);
        }
    }


}
