package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ColaServicio {

    private String servicio;

    Queue<Paciente> pacientes;

    public ColaServicio(String servicio){
        this.servicio = servicio;
        this.pacientes = new ArrayDeque<>();
    }


    public void agregarPaciente(Paciente paciente){
        pacientes.offer(paciente);
    }

    public Paciente atenderSiguientePaciente(){
        return pacientes.poll();
    }

    public boolean isEmpty(){
        return pacientes.isEmpty();
    }

    public String toString(){
        return pacientes.toString();
    }

    //Un metodo para priorizar la cola de pacientes
    public void priorizarPorPrioridadAscendente(){
        Queue<Paciente> colaPriorizada = new ArrayDeque<>();

        while (!pacientes.isEmpty()){ //mientras mi cola de pacientes no este vacia

            Paciente paciente = pacientes.poll();
            if (paciente != null){
                if (paciente.getServicioRequerido().equals(servicio)){
                    colaPriorizada.offer(paciente);
                // si el servicio del paciente coincide con el servicio de la cola, se agrega el paciente a la cola colaPriorizada utilizando el metodo offter
                }
            }
        }

        pacientes = colaPriorizada;
        //Reemmplazar la cola original pacientes por la cola colaPriorizada que contiene los pacientes ordenados por prioridad
    }



}
