/*
-->Faça um programa que peça dois números e imprima o maior deles.
*/

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro numero digitado eh o maior entre eles");
        } else {
            System.out.println("O segundo numero digitado eh o maior entre eles");
        }
    }
}
