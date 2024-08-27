package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {

        //Lista de numeros
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        //Predicate para saber sun numeros es par o no
        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        //Filtrar la lista de numeros pares
        List<Integer> numerosPares = numeros.stream()
                .filter(esPar) // 2 - 4
                .collect(Collectors.toList());

        //Impresion por referencia
        numerosPares.forEach(System.out::println);

        //Impresion por lambda
        numerosPares.forEach(numero -> System.out.println(numero) );



    }
}
