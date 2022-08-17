/*
-->Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String input = sc.next();


        if (input.length() > 1) {
            System.out.println("Invalido, digite apenas uma letra!");
        }else{
            switch (input) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("Consoante");

            }

        }

    }
}
