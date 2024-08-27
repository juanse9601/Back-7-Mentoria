import java.util.Arrays;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice","Bob", "Juan");

        //Imprimir cada nombre usando una lambda con un foreach
        names.forEach(name -> System.out.println(name));

    }

}
