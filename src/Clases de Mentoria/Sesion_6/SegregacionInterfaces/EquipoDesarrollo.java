package SegregacionInterfaces;

import java.util.List;

public class EquipoDesarrollo {

    private List<Programador> programadores;

    public EquipoDesarrollo(List<Programador> programadores) {
        this.programadores = programadores;
    }

    public void realizarRevisionCodigo(){
        for (Programador programador : programadores){
            programador.revisarCodigo();
        }
    }
}
