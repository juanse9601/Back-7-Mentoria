import java.util.function.Consumer;

public class Consumer1 {
    //toma un argumento y no devuelve ningun resultado
    // accept

    public static void main(String[] args) {

        //definir el consumidor
        Consumer<String> imprimirEnMayuscula = (s) -> System.out.println(s.toUpperCase());

        imprimirEnMayuscula.accept("hello");
        imprimirEnMayuscula.accept("java");
        imprimirEnMayuscula.accept("patrones");
    }

}
