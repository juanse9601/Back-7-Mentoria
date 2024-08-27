package Stream;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.List;

public class PredicateMain {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", "Colombia", 25));
        personas.add(new Persona("Maria", "Argentina", 16));
        personas.add(new Persona("Pedro", "Colombia", 30));

        //Filtrado por nacionalidad
        personas.forEach(persona -> System.out.println(persona.getNacionalidad().equals("Colombia")));



    }
}
