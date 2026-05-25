package Exercicios;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // pedindo os valores para o usuário!
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite a idade do funcionário: ");
        int idade = sc.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas em números: ");
        int horas = sc.nextInt();

        System.out.print("Digite o Valor da Hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o Número de Filhos: ");
        int filhos = sc.nextInt();

        System.out.print("Digite o tempo de serviço mensal: ");
        int tempo = sc.nextInt();
        
        // calculando o que foi pedido no enunciado 
        double salarioFamilia = filhos * 50;
        double salarioBruto = horas * valorHora;
        double inps = salarioBruto * 0.085;

        //calculando o IR
        double ir = 0;

         if (salarioBruto > 1500) {
              ir = salarioBruto * 0.15;
           } else if (salarioBruto > 500) {
              ir = salarioBruto * 0.08;
           } else {
            ir = 0;
           }

        double adic = 0;
        if (idade > 40) {
          adic = salarioBruto * 0.02;
        } else if (tempo > 15) {
          adic = salarioBruto * 0.035;
        } else if (tempo > 5 && tempo <= 15 && idade > 30) {
            adic = salarioBruto * 0.015;
        }
        // calculando o salario e descontos e blablabla
        double salarioLiquido = salarioBruto - ir - inps + salarioFamilia + adic;
        double totalDescontos = inps + ir;

       System.out.println("Funcionário: " + nome);
       System.out.println("O Salário Bruto do funcionário é de: R$" + salarioBruto);
       System.out.println("O total de descontos foi de: R$" + totalDescontos);
       System.out.println("Os adicionais foram de: R$" + adic);
       System.out.println("O salário líquido do funcionário é: R$" + salarioLiquido);
    }
}