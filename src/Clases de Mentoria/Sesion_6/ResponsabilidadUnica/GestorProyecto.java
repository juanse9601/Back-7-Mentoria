package ResponsabilidadUnica;

import java.util.Date;

public class GestorProyecto {
    private String nombreProyecto;
    private Date fechaInicio;
    private Date fechaFinal;

    //Constructor


    public GestorProyecto(String nombreProyecto, Date fechaInicio, Date fechaFinal) {
        this.nombreProyecto = nombreProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }


    public void asignarTarea(String tarea){
        //logica para asignar la tarea
    }

    public String ObtenerInformacionProyecto(){
        return "Informacion del proyecto" + nombreProyecto + "fechas" +fechaInicio + "-" + fechaFinal;

    }



}
