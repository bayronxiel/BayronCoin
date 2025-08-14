package com.bayron.bayroncoin;

import java.util.Map;
import java.util.TreeMap;

public class GestorDeMonedas {

    private static final Map<Integer, String[]> MONEDAS_DISPONIBLES = new TreeMap<>();

    static {
        MONEDAS_DISPONIBLES.put(1, new String[]{"ARS", "Peso argentino"});
        MONEDAS_DISPONIBLES.put(2, new String[]{"BRL", "Real brasileño"});
        MONEDAS_DISPONIBLES.put(3, new String[]{"CLP", "Peso chileno"});
        MONEDAS_DISPONIBLES.put(4, new String[]{"CNY", "Yuan chino"});
        MONEDAS_DISPONIBLES.put(5, new String[]{"COP", "Peso colombiano"});
        MONEDAS_DISPONIBLES.put(6, new String[]{"EUR", "Euro"});
        MONEDAS_DISPONIBLES.put(7, new String[]{"GBP", "Libra Esterlina"});
        MONEDAS_DISPONIBLES.put(8, new String[]{"JPY", "Yen Japonés"});
        MONEDAS_DISPONIBLES.put(9, new String[]{"MXN", "Peso mexicano"});
        MONEDAS_DISPONIBLES.put(10, new String[]{"USD", "Dólar estadounidense"});
    }

    public static void mostrarMenu() {
        System.out.println("***************************************************");
        System.out.println("         Por favor, elija una moneda: ");
        System.out.println("***************************************************");
        for (Map.Entry<Integer, String[]> entry : MONEDAS_DISPONIBLES.entrySet()) {
            System.out.printf("%2d) %-25s (%s)\n", entry.getKey(), entry.getValue()[1], entry.getValue()[0]);
        }
        System.out.println("***************************************************");
    }

    public static String getCodigo(int opcion) {
        return MONEDAS_DISPONIBLES.get(opcion)[0];
    }

    public static boolean esOpcionValida(int opcion) {
        return MONEDAS_DISPONIBLES.containsKey(opcion);
    }
}