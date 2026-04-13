package aula02;

public class Variaveis {

    public static void main(String[] args) {
        String msgPt1 = "Olá ";
        String msgPt2 = "mundo!";
        String msgPt3 = "A soma dos números é: ";
        int n1 = 18;
        int n2 = 22;

        System.out.println(msgPt1.concat(msgPt2));
        System.out.println(msgPt3 + (n1 + n2));
    }
}