package Queue;

public class AdministradorCola {

    //Crear y gestionar las colas de los diferentes servicios
    //agregar pacientes a las colas segun su servicio requerido
    //Atender a los pacientes de las colas segun su prioridad
    //Monitoriar el estado de las colas


    ColaServicio colaConsultaGeneral;
    ColaServicio colaUrgencias;
    ColaServicio colaLaboratorio;
    ColaServicio colaVacunacion;

    public AdministradorCola(){
        colaConsultaGeneral = new ColaServicio("Consulta General");
        //Crear una nueva instancia de la clase ColaServicio con el nombre "Consulta General " y la asigno al atributo cola consulta general
        colaUrgencias = new ColaServicio("Urgencias");
        colaLaboratorio = new ColaServicio("Laboratorio");
        colaVacunacion = new ColaServicio("Vacunacion");

    }

    public void agregarPaciente(Paciente paciente){
        switch (paciente.getServicioRequerido()){
           case "Consulta General" :
               colaConsultaGeneral.agregarPaciente(paciente);
               break;
            case "Urgencias" :
                colaUrgencias.agregarPaciente(paciente);
               break;
            case "Laboratorio" :
                colaLaboratorio.agregarPaciente(paciente);
               break;
            case "Vacunacion" :
                colaVacunacion.agregarPaciente(paciente);
               break;
            default:
                System.out.println("No se pudo agregar el paciente, servicio no valido: " + paciente);
        }

    }


    public Paciente atenderSiguientePaciente(){
        Paciente pacienteAtendido = colaUrgencias.atenderSiguientePaciente();  //para almacenar el pacienteque se atiende

        if (pacienteAtendido == null){
            pacienteAtendido = colaConsultaGeneral.atenderSiguientePaciente();
            //obtener
            if (pacienteAtendido == null){
                pacienteAtendido = colaLaboratorio.atenderSiguientePaciente();
                if (pacienteAtendido == null){
                    pacienteAtendido = colaVacunacion.atenderSiguientePaciente();
                }
            }
        }

        return pacienteAtendido;

    }

    //verificar que todas las colas esten vacias
    public boolean todasColasVacias(){
        return colaConsultaGeneral.isEmpty() && colaUrgencias.isEmpty() && colaLaboratorio.isEmpty() && colaVacunacion.isEmpty();
    }


    public void mostrarColas(){
        System.out.println("Pacientes en la cola Consulta general: " + colaConsultaGeneral);
        System.out.println("Pacientes en la cola de urgencias: " + colaUrgencias);
        System.out.println("Pacientes en la cola de vacunacion: " + colaVacunacion);
        System.out.println("Pacientes en la cola de laboratorio: " + colaLaboratorio);

    }


    public void priorizarPorPrioridadAscendente(String servicio){
        switch (servicio){
            case "Consulta General" :
                colaConsultaGeneral.priorizarPorPrioridadAscendente();
                break;
            case "Urgencias" :
                colaUrgencias.priorizarPorPrioridadAscendente();
                break;
            case "Laboratorio" :
                colaLaboratorio.priorizarPorPrioridadAscendente();
                break;
            case "Vacunacion" :
                colaVacunacion.priorizarPorPrioridadAscendente();
                break;
            default:
                System.out.println("No se pudo priorizar, servicio no valido: " +  servicio);


        }

    }

}
