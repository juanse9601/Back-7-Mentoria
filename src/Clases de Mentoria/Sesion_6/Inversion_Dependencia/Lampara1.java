package Inversion_Dependencia;

//clase de bajo nivel porque implementa los metodos o como se hacen
public class Lampara1 implements DispositivoEncendible{


    @Override
    public void encender() {
        System.out.println("Lampara encendida...");
    }
}
