package Inversion_Dependencia;

//clase de alto nivel solo llama a los metodos no se enfoca en como lo hacen
public class Interruptor1 {

    private DispositivoEncendible dispositivo;

    public Interruptor1(DispositivoEncendible dispositivo){
        this.dispositivo = dispositivo;
    }

    public void presionarInterruptor(){
        dispositivo.encender();
    }
}
