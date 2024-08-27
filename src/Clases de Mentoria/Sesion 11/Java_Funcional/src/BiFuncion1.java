import java.util.function.BiFunction;

public class BiFuncion1 {
    // toma dos argumentos y devuelve 1 resultado
    //apply

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> suma = (a,b) -> a+b;

        System.out.println(suma.apply(2,5));
        System.out.println(suma.apply(10,2));

    }


}
