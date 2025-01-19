package main;

import java.util.Scanner;

import converter.Converter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optionToChoose = 0;
        String menu = """
                /n ********************************
                Hola soy el Conversor de Monedas
              
                1) United States Dollar a Pesos Colombianos
                2) Euro a Pesos Colombianos
                3) Personaliza que monedas deseas convertir (Ejemplo: USD-COP)
                4) Salir
              
                *************************************
              """;

        while (optionToChoose != 4) {
            try {
                System.out.println(menu);
                optionToChoose = sc.nextInt();
                sc.nextLine();
                // Crear un objeto para realizar la conversión
                Converter calculions;
                String message = "";

                switch (optionToChoose) {
                    case 1:
                        // Solicitar la cantidad a convertir
                        System.out.print("Ingrese la cantidad a convertir: ");
                        double amount1 = sc.nextDouble();
                        sc.nextLine();
                        calculions = new Converter("USD", "COP", String.valueOf(amount1));
                        message = "La conversion de " + calculions.makeCurrencyExchange();
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad a convertir: ");
                        double amount2 = sc.nextDouble();
                        sc.nextLine();
                        calculions = new Converter("EUR", "COP", String.valueOf(amount2));
                        message = "La conversion de " + calculions.makeCurrencyExchange();
                        break;
                    case 3:
                        // Opción personalizada
                        System.out.print("Ingrese la moneda base (ejemplo: USD, EUR, MXN): ");
                        String baseCurrency = sc.nextLine().toUpperCase();
                        System.out.print("Ingrese la moneda destino (ejemplo: COP, USD, EUR): ");
                        String quoteCurrency = sc.nextLine().toUpperCase();
                        System.out.print("Ingrese la cantidad a convertir: ");
                        double amount3 = sc.nextDouble();
                        sc.nextLine();
                        //System.out.println("Base: " + baseCurrency + " Quote: " + quoteCurrency + " Amount: " + amount3);
                        calculions = new Converter(baseCurrency, quoteCurrency.toUpperCase(), String.valueOf(amount3));
                        message = calculions.makeCurrencyExchange();
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida.");
                }
                if (!message.isEmpty()) {
                    System.out.println(message);
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
