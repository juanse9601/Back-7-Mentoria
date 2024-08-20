package Queue;

public class SistemaColaEps {
    public static void main(String[] args) {
        AdministradorCola administrador = new AdministradorCola();

        //Agregar pacientes a la cola
        administrador.agregarPaciente(new Paciente("1","Juan Perez","Consulta General", 5));
        administrador.agregarPaciente(new Paciente("2","Ana Maria","Urgencias", 1));
        administrador.agregarPaciente(new Paciente("6","Jose","Urgencias", 1));
        administrador.agregarPaciente(new Paciente("3","Carlos Lopez","Laboratorio", 4));
        administrador.agregarPaciente(new Paciente("4","Sofia Cruz","Vacunacion", 3));
        administrador.agregarPaciente(new Paciente("5","Diego Ramirez","Urgencias", 2));


        //Priorizar por prioridad ascendente
        System.out.println("Priorizando pacientes por prioridad ascendente en Urgencias:");
        administrador.priorizarPorPrioridadAscendente("Urgencias");
        administrador.mostrarColas();

        //Simular una atencion de pacientes
        System.out.println("Atendiendo pacientes: ");
        while (!administrador.todasColasVacias()){
            Paciente pacienteAtendido = administrador.atenderSiguientePaciente();

            if (pacienteAtendido != null){// que se encontro un paciente en alguna de las colas y fue atendido
                System.out.println("Atendiendo a : " + pacienteAtendido);
            }
        }
        System.out.println("No hay mas pacientes en la cola.");
    }
}
