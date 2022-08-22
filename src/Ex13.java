/*
-->Faça um programa que lê as duas notas parcias obtidas por um aluno numa disciplina
   ao longo de um semestre, e calcule a sua média.
-->O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a
   mensagem "APROVADO" se o conceito for A, B ou C ou "REPROVADO" se o conceito for D
   ou E.
 */

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1º semestre: ");
        double nota01 = sc.nextDouble();
        System.out.println("Nota 2º semestre: ");
        double nota02 = sc.nextDouble();

        double media = (nota01 + nota02) / 2;

        String aproveitamento = "";
        if (media >= 0 && media <= 4) {
            aproveitamento = "A";
        } else if (media >= 4.0 && media <= 6) {
            aproveitamento = "B";
        } else if (media >= 6.0 && media <= 7.5) {
            aproveitamento = "C";
        } else if (media >= 7.5 && media <= 9.0) {
            aproveitamento = "D";
        } else if (media >= 9.0 && media <= 10.0) {
            aproveitamento = "E";
        }

        switch (aproveitamento) {
            case "A", "B", "C" -> System.out.println("Aprovado!");
            case "D", "E" -> System.out.println("Reprovado!");
        }
    }
}
