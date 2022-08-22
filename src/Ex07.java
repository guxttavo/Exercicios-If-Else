/*
-->Faça um programa que leia três números e mostre o maior e o menor deles
 */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Primeiro numero eh o maior: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Segundo numero eh o maior: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Terceiro numero eh o maior: " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("Primeiro numero eh o menor: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Segundo numero eh o menor: " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("Terceiro numero eh o menor: " + num3);
        }
    }
}
