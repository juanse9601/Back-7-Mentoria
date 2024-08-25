package Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {

        Map<String, String> paisesCapitales = new HashMap<>();

        paisesCapitales.put("España","Madrid");
        paisesCapitales.put("Francia","Paris");
        paisesCapitales.put("Italia","Roma");
        paisesCapitales.put("Alemania","Berlin");

        //IMPRIMIR EL TAMÑO DEL MAPA
        System.out.println("Numero de paises" + paisesCapitales.size());

        //Obtener el valor asociado
        String capitalEspaña = paisesCapitales.get("España");
        System.out.println("Capital de España" + capitalEspaña);

        //Eliminar elemento por clave
        paisesCapitales.remove("Italia");
        System.out.println("Numero de elementos despues de eliminar Italia : " + paisesCapitales.size());

        //Verificar si una clave esta en el mapa
        boolean tieneAlemania = paisesCapitales.containsKey("Alemania");
        System.out.println("Alemania esta en el mapa ? " + tieneAlemania);

        Set<String> capitales = paisesCapitales.keySet();
        for (String capital : capitales){
            System.out.println("Capital : " + capital);
        }

        //Combianar dos mapas
        Map<String, String> otroMapa = new HashMap<>();
        otroMapa.put("Portugal","Lisboa");

        paisesCapitales.putAll(otroMapa);
        System.out.println("NUmero de paises despues de combinar mapas: " + paisesCapitales.size());

    }
}
