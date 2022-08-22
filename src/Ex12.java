/*
-->Faça um programa que leia um número e exiba o dia correspondente da semana,
   ex;(1-Domingo, 2-Segunda etc). Se digitar outro valor deve aparecer valor inválido.
*/

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 1 a 7");
        int numero = sc.nextInt();

        switch (numero) {
            case 1 -> System.out.println("1-Domingo");
            case 2 -> System.out.println("2-Segunda");
            case 3 -> System.out.println("3-Terça");
            case 4 -> System.out.println("4-Quarta");
            case 5 -> System.out.println("5-Quinta");
            case 6 -> System.out.println("6-Sexta");
            case 7 -> System.out.println("7-Sábado");
            default -> System.out.println("Valor inválido!");
        }

    }
}
