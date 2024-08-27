import java.util.function.Function;

public class Funcion1 {
    // acepta 1 parametro y nos devuelve <T, R> T = ES EL PARAMETRO Y R ES EL RETORNO
    // apply

    public static void main(String[] args) {

        Function<String, Integer> stringLength = (s) -> s.length();

        System.out.println(stringLength.apply("Hello"));
        System.out.println(stringLength.apply("Lambda"));
        System.out.println(stringLength.apply("Programacion"));
        System.out.println(stringLength.apply("Poo"));
    }

}
