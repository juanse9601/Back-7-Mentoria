import java.util.function.Predicate;

public class Predicate1 {
    // Nos devuelve un valor boolean
    // test

    public static void main(String[] args) {

        Predicate<Integer> esPar = (n) -> n%2 == 0; //defino la condicono para saber si un numero es par o no

        System.out.println(esPar.test(4)); //true
        System.out.println(esPar.test(5));
    }

}
