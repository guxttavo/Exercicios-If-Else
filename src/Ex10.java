/*
-->As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver
   o programa que calculará os reajustes.
-->Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
   -Salários até R$280(incluindo): aumento de 20%;
   -Salários entre R$280 e R$700: aumento de 15%;
   -Salários entre R$700 e R$1500: aumento de 10%;
   -Salários de R$1500 em diante: aumento de 5%;
-->Após o aumento ser realizado, informe na tela:
   -O salário antes do reajute;
   -O percentual de aumento aplicado;
   -O valor do aumento;
   -O novo salário, após o aumento.
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double atualSalario = sc.nextDouble();

        double percentual = 0;
        if (atualSalario <= 280) {
            percentual = 0.20;
        } else if (atualSalario >= 280 && atualSalario <= 700) {
            percentual = 0.15;
        } else if (atualSalario >= 700 && atualSalario <= 1500) {
            percentual = 0.10;
        } else if (atualSalario >= 1500) {
            percentual = 0.10;
        }

        double aumento = (atualSalario * percentual) + atualSalario;
        double valorAumentado = atualSalario * percentual;

        System.out.println("Salário antes do reajuste: " + atualSalario);
        System.out.println("Percentual aplicado: " + percentual);
        System.out.println("Valor aumentado: " + valorAumentado);
        System.out.println("Salário após o reajuste: " + aumento);
    }
}
