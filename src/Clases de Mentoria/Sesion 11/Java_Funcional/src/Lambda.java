public class Lambda {
    public static void main(String[] args) {
        Sumador sumador = (a,b) -> a+b;

        int resultado = sumador.sumar(5, 10);

        System.out.println("El resultado de la suma es: " +  resultado);

    }

}
