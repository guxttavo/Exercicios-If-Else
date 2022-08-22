/*
-->Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos
   são do Imposto de Renda, que depende do salário bruto(conforme a tabela abaixo) e 3%
   para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado
   (é a empresa que deposita).
-->O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir
   ao usuário o valor da sua hora e quantidade de horas trabalhadas no mês.
   -Desconto do IR:
     -Salário Bruto até 900(inclusive) - isento.
     -Salário Bruto até 1500(inclusive) - desconto de 5%.
     -Salário Bruto até 2500(inclusive) - desconto de 10%.
     -Salário Bruto acima de 2500 - desconto de 20%.
*/

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorHoraTrabalhada;
        double qtnHoraTrabalhada;

        System.out.println("Valor por hora trabalhada: ");
        valorHoraTrabalhada = sc.nextDouble();

        System.out.println("Quantidade de horas trabalhadas: ");
        qtnHoraTrabalhada = sc.nextDouble();

        double salarioBruto = valorHoraTrabalhada * qtnHoraTrabalhada;

        double percentualIR = 0;
        if (salarioBruto <= 900) {
            percentualIR = 0.0;
        } else if (salarioBruto <= 1500) {
            percentualIR = 0.15;
        } else if (salarioBruto <= 2500) {
            percentualIR = 0.10;
        } else if (salarioBruto >= 2500) {
            percentualIR = 0.20;
        }

        double ir = salarioBruto - (salarioBruto * percentualIR);
        double inss = salarioBruto - (salarioBruto * 10);
        double fgts = salarioBruto - (salarioBruto * 11);
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Salário líquido: " + salarioLiquido);

    }
}
