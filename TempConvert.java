//temperature converter

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------TEMPERATURE CONVERTER----------");
        System.out.println("Choose the correct option in which unit you want to enter temperature ");
        System.out.println("For CELSIUS Press (C), FAHRENHEIT Press (F), KELVIN Press (K)");
        String choice = sc.next();
        System.out.println("Enter temperature");
        double temp1 = sc.nextFloat();
        double cel, fh, kv = 0;

        if (choice.equals("C")) {

            System.out.println("To Convert in Fahrenheit Press (F), in Kelvin Press (K)");
            String ch1 = sc.next();
            if (ch1.equals("F")) {
                fh = (temp1 * 1.8) + 32;
                System.out.println("-----Temperature-----");
                System.out.println("In Celsius : " + temp1);
                System.out.println("In Fahrenheit : " + fh);
            } else if (ch1.equals("f")) {
                fh = (temp1 * 1.8) + 32;
                System.out.println("-----Temperature-----");
                System.out.println("In Celsius : " + temp1);
                System.out.println("In Fahrenheit : " + fh);
            } else if (ch1.equals("K")) {
                kv = temp1 + 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Celsius : " + temp1);
                System.out.println("In Kelvin : " + kv);
            } else if (ch1.equals("k")) {
                kv = temp1 + 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Celsius : " + temp1);
                System.out.println("In Kelvin : " + kv);
            } else {
                System.out.println("You have chosen incorrect option");
            }
        } else if (choice.equals("c")) {
            System.out.println("To Convert in Fahrenheit Press (F), in Kelvin Press (K)");
            String ch1 = sc.next();
            if (ch1.equals("F")) {
                fh = (temp1 * 1.8) + 32;
                System.out.println("-----Temperature-----");
                System.out.println("In Celsius : " + temp1);
                System.out.println("In Fahrenheit : " + fh);
            } else if (ch1.equals("f")) {
                fh = (temp1 * 1.8) + 32;
                System.out.println("-----Temperature-----");
                System.out.println("In Celsius : " + temp1);
                System.out.println("In Fahrenheit : " + fh);
            } else if (ch1.equals("K")) {
                kv = temp1 + 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Celsius : " + temp1);
                System.out.println("In Kelvin : " + kv);
            } else if (ch1.equals("k")) {
                kv = temp1 + 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Celsius : " + temp1);
                System.out.println("In Kelvin : " + kv);
            } else {
                System.out.println("You have chosen incorrect option");
            }
        } else if (choice.equals("K")) {
            System.out.println("To Convert in Celsius Press (C), in Fahrenheit Press (F)");
            String ch1 = sc.next();
            if (ch1.equals("C")) {
                cel = temp1 - 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Kelvin : " + temp1);
                System.out.println("In Celsius : " + cel);
            } else if (ch1.equals("c")) {
                cel = temp1 - 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Kelvin : " + temp1);
                System.out.println("In Celsius : " + cel);
            } else if (ch1.equals("F")) {
                fh = ((temp1 - 273.15) * 1.8) + 32;
                System.out.println("-----Temperature-----");
                System.out.println("In Kelvin : " + temp1);
                System.out.println("In Fahrenheit : " + fh);
            } else if (ch1.equals("f")) {
                fh = ((temp1 - 273.15) * 1.8) + 32;
                System.out.println("-----Temperature-----");
                System.out.println("In Kelvin : " + temp1);
                System.out.println("In Fahrenheit : " + fh);
            } else {
                System.out.println("You have chosen incorrect option");
            }
        } else if (choice.equals("k")) {
            System.out.println("To Convert in Celsius Press (C), in Fahrenheit Press (F)");
            String ch1 = sc.next();
            if (ch1.equals("C")) {
                cel = temp1 - 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Kelvin : " + temp1);
                System.out.println("In Celsius : " + cel);
            } else if (ch1.equals("c")) {
                cel = temp1 - 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Kelvin : " + temp1);
                System.out.println("In Celsius : " + cel);
            } else if (ch1.equals("F")) {
                fh = ((temp1 - 273.15) * 1.8) + 32;
                System.out.println("-----Temperature-----");
                System.out.println("In Kelvin : " + temp1);
                System.out.println("In Fahrenheit : " + fh);
            } else if (ch1.equals("f")) {
                fh = ((temp1 - 273.15) * 1.8) + 32;
                System.out.println("-----Temperature-----");
                System.out.println("In Kelvin : " + temp1);
                System.out.println("In Fahrenheit : " + fh);
            } else {
                System.out.println("You have chosen incorrect option");
            }

        } else if (choice.equals("F")) {
            System.out.println("To Convert in Celsius Press (C), in Kelvin Press (K)");
            String ch1 = sc.next();
            if (ch1.equals("C")) {
                cel = (temp1 - 32) * 0.5556;
                System.out.println("-----Temperature-----");
                System.out.println("In Fahrenheit : " + temp1);
                System.out.println("In Celsius : " + cel);
            } else if (ch1.equals("c")) {
                cel = (temp1 - 32) * 0.5556;
                System.out.println("-----Temperature-----");
                System.out.println("In Fahrenheit : " + temp1);
                System.out.println("In Celsius : " + cel);
            } else if (ch1.equals("K")) {
                kv = ((temp1 - 32) * 0.5556) + 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Fahrenheit : " + temp1);
                System.out.println("In Kelvin : " + kv);
            } else if (ch1.equals("k")) {
                kv = ((temp1 - 32) * 0.5556) + 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Fahrenheit : " + temp1);
                System.out.println("In Klevin : " + kv);
            } else {
                System.out.println("You have chosen incorrect option");
            }
        } else if (choice.equals("f")) {
            System.out.println("To Convert in Celsius Press (C), in Kelvin Press (K)");
            String ch1 = sc.next();
            if (ch1.equals("C")) {
                cel = (temp1 - 32) * 0.5556;
                System.out.println("-----Temperature-----");
                System.out.println("In Fahrenheit : " + temp1);
                System.out.println("In Celsius : " + cel);
            } else if (ch1.equals("c")) {
                cel = (temp1 - 32) * 0.5556;
                System.out.println("-----Temperature-----");
                System.out.println("In Fahrenheit : " + temp1);
                System.out.println("In Celsius : " + cel);
            } else if (ch1.equals("K")) {
                kv = ((temp1 - 32) * 0.5556) + 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Fahrenheit : " + temp1);
                System.out.println("In Kelvin : " + kv);
            } else if (ch1.equals("k")) {
                kv = ((temp1 - 32) * 0.5556) + 273.15;
                System.out.println("-----Temperature-----");
                System.out.println("In Fahrenheit : " + temp1);
                System.out.println("In Klevin : " + kv);
            } else {
                System.out.println("You have chosen incorrect option");
            }
        } else {
            System.out.println("You have chosen incorrect option");
        }

    }
}