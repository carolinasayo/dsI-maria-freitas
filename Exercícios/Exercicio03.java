import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado A: ");
        double ladoA = entrada.nextDouble();

        System.out.print("Digite o comprimento do lado B: ");
        double ladoB = entrada.nextDouble();

        System.out.print("Digite o comprimento do lado C: ");
        double ladoC = entrada.nextDouble();

        // Coloca os três lados em ordem decrescente,
        // assim o maior lado fica sempre guardado em "maior"
        double maior = ladoA;
        double medio = ladoB;
        double menor = ladoC;
        double aux;

        if (maior < medio) {
            aux = maior;
            maior = medio;
            medio = aux;
        }
        if (medio < menor) {
            aux = medio;
            medio = menor;
            menor = aux;
        }
        if (maior < medio) {
            aux = maior;
            maior = medio;
            medio = aux;
        }

        // Mostra os valores já organizados do maior para o menor
        System.out.println("Valores lidos, em ordem decrescente: "
                + "maior = " + maior + ", medio = " + medio + ", menor = " + menor);

        // Verifica se esses três valores conseguem formar um triângulo
        if (maior >= medio + menor) {
            System.out.println("Esses valores não formam um triângulo.");
        } else {
            System.out.println("Esses valores formam um triângulo.");

        // Classificação pelo tamanho dos lados
            if (maior == medio && medio == menor) {
                System.out.println("É um triângulo equilátero (todos os lados iguais).");
            } else if (maior == medio || medio == menor || maior == menor) {
                System.out.println("É um triângulo isósceles (dois lados iguais).");
            } else {
                System.out.println("É um triângulo escaleno (todos os lados diferentes).");
            }

            // Classificação pelo tipo de ângulo, usando o maior lado como referência
            double quadradoMaior = maior * maior;
            double somaQuadradosMenores = medio * medio + menor * menor;

            if (quadradoMaior == somaQuadradosMenores) {
                System.out.println("Também é um triângulo retângulo.");
            } else if (quadradoMaior > somaQuadradosMenores) {
                System.out.println("Também é um triângulo obtusângulo.");
            } else {
                System.out.println("Também é um triângulo acutângulo.");
            }
        }

        entrada.close();
    }
}