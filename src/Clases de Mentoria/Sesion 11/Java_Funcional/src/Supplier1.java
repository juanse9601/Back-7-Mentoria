import java.util.function.Supplier;

public class Supplier1 {
    //get
    //cuando necesite generar objetos sin argumentos

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hola mundo!";

        System.out.println(supplier.get());

    }


}
