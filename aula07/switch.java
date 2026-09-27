package aula07;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número do dia da semana? ");
        int day = sc.nextInt();
        switch (day) {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda-feita");
            break;
        case 3:
            System.out.println("Terça-feira");  
            break;
        case 4:
            System.out.println("Quarta-feita");
            break;
        case 5:
            System.out.println("Quinta-feita");
            break;
        case 6:
            System.out.println("Sexta-feira");
            break;
        case 7:
            System.out.println("Sábado");
            break;
            default: 
            System.out.println("Não existe nenhum dia que corresponde a esse número");
        }
    }
}