package MainRunners;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userOpcion = 0;

        while (userOpcion != 9 ) {

            System.out.println("""
                --- Menu de opciones ---
                1) Dolar (USD) a Pesos Mexicanos (MXN)
                2) Pesos Mexicanos (MXN) a Dolar (USD)
                3) Dolar (USD) a Real Brasileño (BLR)
                4) Real Brasileño (BLR) a Dolar (USD)
                5) Dolar (USD) a Peso Colombiano (COP)
                6) Peso Colombiano a Dolar (USD)
                9) Salir
                """);
            System.out.print("Que conversión quiere realizar: ");
            userOpcion = scanner.nextInt();

            switch (userOpcion) {
                case 1:
                    System.out.println("1) Dolar (USD) a Pesos Mexicanos (MXN)");
                    break;
                case 2:
                    System.out.println("2) Pesos Mexicanos (MXN) a Dolar (USD)");
                    break;
                case 3:
                    System.out.println("3) Dolar (USD) a Real Brasileño (BLR)");
                    break;
                case 4:
                    System.out.println("4) Real Brasileño (BLR) a Dolar (USD)");
                    break;
                case 5:
                    System.out.println("5) Dolar (USD) a Peso Colombiano (COP)");
                    break;
                case 6:
                    System.out.println("6) Peso Colombiano a Dolar (USD)");
                    break;
                case 9:
                    System.out.println("Gracias por usar Currency Converter!, Saliendo del programa...");
                    break;
                default:
                    System.out.println("El número ingresado no coincide con uan opción.");
                    break;
            }
        }




        scanner.close();
    }
}
