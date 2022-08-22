/*
-->Faça um programa que pergunte o preço de três produtos e informe qual produto
   você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor dos tres produtos: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Voce deve compra o produto de valor: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Voce deve compra o produto de valor: " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("Voce deve compra o produto de valor: " + num3);

        }
    }
}

