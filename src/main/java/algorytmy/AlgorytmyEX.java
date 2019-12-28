package algorytmy;

import java.util.Scanner;

public class AlgorytmyEX {

    public static void main(String[] args) {

        /* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.*/

//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita: ");
//        int a = odczyt.nextInt();
//        System.out.println("Podaj liczbe calkowita: ");
//        int b = odczyt.nextInt();
//
//        System.out.println("Dodawanie: " + (a+b) + "Odejmowanie: " + (a-b) + "Mnożenie: " + (a*b) + "Dzielenie: "
//                + (a/b) + "Modulo: " + (a%b));

        /*Write a Java program that takes a number as input and prints its multiplication table upto 10. */

        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int c = liczba.nextInt();

        for(int i=0; i<=10; i++){
            int k = c * i;

            System.out.println(c + " * " + i + " = " + k);
        }



    }
}
