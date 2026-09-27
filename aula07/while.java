package aula07;

public class While {

    public static void main(String[] args) {
        int number = 1;

        //Vai contar até 100
        while (number < 101) {
            System.err.println(number);
            number += 1;
        }

        System.out.println("\n"+ " ");
        
        //Exemplo do/while
        int doWhile = 0;
        do {
            System.err.println(doWhile);
            //pode usar também o doWhile++
            doWhile += 1;
        }
        while(doWhile < 5);
    }
}