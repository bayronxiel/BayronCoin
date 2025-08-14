package com.bayron.bayroncoin;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion = 0;

        System.out.println("\n***************************************************");
        System.out.println("      ¡Bienvenido al conversor BayronCoin!      ");
        System.out.println("***************************************************");

        while (opcion != 9) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1) Realizar una conversión");
            System.out.println("9) Salir");
            System.out.print("Elija una opción: ");

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
                teclado.nextLine();

                if (opcion == 1) {
                    realizarConversion(teclado, consulta);
                } else if (opcion != 9) {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                teclado.next();
            }
        }
        System.out.println("\nGracias por usar BayroinCoin. ¡Vuelve pronto!");
        teclado.close();
    }

    public static void realizarConversion(Scanner teclado, ConsultaMoneda consulta) {
        GestorDeMonedas.mostrarMenu();
        System.out.print("\nElija la moneda de ORIGEN: ");
        int opcionOrigen = leerOpcionValida(teclado);
        String monedaOrigen = GestorDeMonedas.getCodigo(opcionOrigen);

        GestorDeMonedas.mostrarMenu();
        System.out.print("\nElija la moneda de DESTINO: ");
        int opcionDestino = leerOpcionValida(teclado);
        String monedaDestino = GestorDeMonedas.getCodigo(opcionDestino);

        System.out.print("Ingrese la cantidad a convertir de " + monedaOrigen + " a " + monedaDestino + ": ");
        double cantidad = leerCantidadValida(teclado);

        try {
            Moneda resultado = consulta.buscaMoneda(monedaOrigen, monedaDestino, cantidad);
            System.out.println("\n****************** RESULTADO ******************");
            System.out.printf("   %.2f [%s] equivalen a %.2f [%s]\n",
                    cantidad, monedaOrigen, resultado.conversion_result(), monedaDestino);
            System.out.println("***********************************************");
        } catch (RuntimeException e) {
            System.out.println("\nError al realizar la conversión: " + e.getMessage());
        }
    }

    private static int leerOpcionValida(Scanner teclado) {
        while (true) {
            if (teclado.hasNextInt()) {
                int opcion = teclado.nextInt();
                teclado.nextLine();
                if (GestorDeMonedas.esOpcionValida(opcion)) {
                    return opcion;
                } else {
                    System.out.print("Opción fuera de rango. Intente de nuevo: ");
                }
            } else {
                System.out.print("Entrada inválida. Ingrese un número del menú: ");
                teclado.next();
            }
        }
    }

    private static double leerCantidadValida(Scanner teclado) {
        while (true) {
            if (teclado.hasNextDouble()) {
                double cantidad = teclado.nextDouble();
                teclado.nextLine();
                if (cantidad > 0) {
                    return cantidad;
                } else {
                    System.out.print("La cantidad debe ser positiva. Intente de nuevo: ");
                }
            } else {
                System.out.print("Entrada inválida. Ingrese un valor numérico: ");
                teclado.next();
            }
        }
    }
}