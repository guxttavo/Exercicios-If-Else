/*
-->Faça um programa que leia três números e mostre o maior deles.
*/

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Primeiro numero eh o maior");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Segundo numero eh o maior");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Terceiro numero eh o maior");
        }
    }
}
