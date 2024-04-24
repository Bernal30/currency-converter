package MainRunners;

import Models.Currency;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaramos 3 divisas con el constructor de clase y con valor en pesos mexicanos
        Currency currency1 = new Currency("Dolar");
        currency1.setCurrencyValue(0.059);

        Currency currency2 = new Currency("Euro");
        currency2.setCurrencyValue(0.055);

        Currency currency3 = new Currency("Yen");
        currency3.setCurrencyValue(9.13);

        int userOpcion = 0;

        while (userOpcion != 9) {
            System.out.println("Bienvenido/a al conversor de divisas");
            System.out.println("""
                    --- Menu de Opciones ---
                    1) Pesos mexicanos a Dolares
                    2) Pesos mexicanos a Euros
                    3) Pesos mexicanos a Yenes
                    9) Salir
                    """);
            System.out.print("Que operación quiere realizar: ");
            userOpcion = scanner.nextInt();

            double userAmount;

            switch (userOpcion) {
                case 1:
                    //se obtien el monto en pesos mexicanos
                    System.out.print("Ingrese la cantidad en pesos mexicanos: ");
                    userAmount = scanner.nextDouble();
                    //calculo pesos mexicanos a dolares
                    double result1 =  userAmount * currency1.getCurrencyValue();
                    System.out.println("El valor de " + userAmount + " pesos mexicanos a dolares es de: " + result1 + "$");
                    break;
                case 2:
                    //se obtien el monto en pesos mexicanos
                    System.out.print("Ingrese la cantidad en pesos mexicanos: ");
                    userAmount = scanner.nextDouble();
                    //calculo de pesos mexicanos a euros
                    double result2 = userAmount * currency2.getCurrencyValue();
                    System.out.println("El valor de " + userAmount + " pesos mexicanos a euros es de: " + result2 + "€");
                    break;
                case 3:
                    //se obtien el monto en pesos mexicanos
                    System.out.print("Ingrese la cantidad en pesos mexicanos: ");
                    userAmount = scanner.nextDouble();
                    //calculo de pesos mexicanos a yenes
                    double result3 = userAmount * currency3.getCurrencyValue();
                    System.out.println("El valor de " + userAmount + " pesos mexicanos a yenes es de: " + result3 + "¥");
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro servicio, saliendo...");
                    break;
                default:
                    System.out.println("El número ingresado no coincide con ninguna acción.");
                    break;
            }
        }

        scanner.close();
    }
}
