/*
-->Faça um programa que verifique se uma letra digitada é "F" ou "M".
-->Conforme a letra escrever: F - Feminino, M - Masculinho, Sexo inválido.
 */


import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma letra(F ou M)");
        String input = sc.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("F- Feminino");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo invalido");
        }
    }
}
