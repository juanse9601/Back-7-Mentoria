package SegregacionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Programador> programadores = new ArrayList<>();
        programadores.add(new ProgramadorSenior(2000,"Carlos"));
        programadores.add(new ProgramadorSenior(1000,"Juan"));

        EquipoDesarrollo equipoDesarrollo = new EquipoDesarrollo(programadores);

        equipoDesarrollo.realizarRevisionCodigo();

    }
}
