import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {


    //metodos de los map
    //get  = obtner el valor asociado a la clave
    //put = agregar un nuevo par clave-valor
    //remove == eliminar
    //isEmptu = verifica que el mapa este vacio
    //size = obtener el numero de pares

    //metodos para recorrer el mapa
    //entrySet = las entradas o los objetos
    //heyset  = obtener el conjunto de las claves del mapa



    private static final List<Empleado> EMPLEADOS = List.of(
            new Empleado("Ana", "Ventas", 30000,2),
            new Empleado("Juan", "Marketing", 40000,5),
            new Empleado("Pedro", "Ventas", 35000,10),
            new Empleado("Maria", "Marketing", 50000,3),
            new Empleado("Luis", "Recursos Humanos", 33000,7)
    );


    public static void main(String[] args) {
        //Conjunto de empleados por departamento
        Map<String , Set<String>> empleadosPorDepatamento = EMPLEADOS.stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento,
                        Collectors.mapping(Empleado::getNombre, Collectors.toSet())));

        System.out.println("Conjuntos de empleados por departamento: ");
        empleadosPorDepatamento.forEach((departamento,empleados) -> System.out.println(departamento + " : " + empleados ));

    }







    private static class Empleado{

        private final String nombre;
        private final String departamento;
        private final double salario;
        private final int antiguedad;

        public Empleado(String nombre, String departamento, double salario, int antiguedad) {
            this.nombre = nombre;
            this.departamento = departamento;
            this.salario = salario;
            this.antiguedad = antiguedad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDepartamento() {
            return departamento;
        }

        public double getSalario() {
            return salario;
        }

        public int getAntiguedad() {
            return antiguedad;
        }
    }

}