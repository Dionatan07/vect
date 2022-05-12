package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vect {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Enter number of products to add: ");
        int n = teclado.nextInt();

        Product[] vect = new Product[n];

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            teclado.nextLine();
            System.out.print("Produto: ");
            String name = teclado.nextLine();

            System.out.print("Price: ");
            double price = teclado.nextDouble();
            vect[i] = new Product(name, price);

            sum += vect[i].getPrice();

        }
        double average = sum / vect.length;

        System.out.println();
        System.out.println("AVERAGE PRICE: " + String.format("%.2f%n", average ));


    }

}
