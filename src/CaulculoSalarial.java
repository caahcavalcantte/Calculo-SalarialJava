// new Scanner(System.in): cria um leitor de Entrada, com métodos úteis com prefixo "next";
// System.out.printIn: imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;
public class CaulculoSalarial {
  public static void main(String[] args) {
     try (// Lê os valores de Entrada:
      Scanner leitorDeEntradas = new Scanner(System.in)) {
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
          // Atribui a aliquota de 5% mediante o salário
          valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {

          valorImposto = 0.10F * valorSalario;
        } else {
          valorImposto = 0.15F * valorSalario;
        }

        // Calcule e imprime a Saída (com 2 casa decimais)
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2F", saida));
      }
    

  }
}
