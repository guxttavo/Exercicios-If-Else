/*
-->Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }
    }
}
