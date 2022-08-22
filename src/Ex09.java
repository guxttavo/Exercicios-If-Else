/*
-->Faça um programa que pergunte em que turno você estuda.
-->Peça para digitar M-Matutino ou V-Vespertino ou N-Noturno.
-->Imprima a mensagem "Bom dia!", "Boa tarde!", ou "Boa noite!" ou "Valor Inválido!", conforme o caso.
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Em qual turno voce estuda(M-Matutino ou V-Vespertino ou N-Noturno)?");
        String turno = sc.next();

        switch (turno) {
            case "m", "M" -> System.out.println("Bom dia!");
            case "v", "V" -> System.out.println("Boa tarde!");
            case "n", "N" -> System.out.println("Boa noite!");
            default -> System.out.println("Valor inválido!");
        }
    }
}
