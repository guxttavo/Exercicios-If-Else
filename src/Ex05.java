/*
-->Faça um programa para leitura de duas notas parciais de um aluno.
-->O programa deve calcular a média alcançada por aluno e apresentar:
   — A mensagem "Aprovado", se a média alcançada for maior ou igual a sete.
   — A mensagem "Reprovado", se a média for menor que sete.
   — A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double num1 = sc.nextInt();
        System.out.println("Digite sua segunda nota: ");
        double num2 = sc.nextInt();

        double media = num1 + num2 / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção!!");
        } else if (media <= 7) {
            System.out.println("Reprovado!");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        }

    }
}
