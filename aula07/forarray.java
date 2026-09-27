package aula07;

public class ForArray {
    public static void main(String[] args) {
        //Temos que criar um array antes
        String[] studentNames = {"Carolina", "Sayo", "Freitas", "Marolina Carol", "Cloud", "Kevin..."};

        for(String names : studentNames) {
            System.out.println(names);
        }
        //Ele vai pegar o elemento do indice 0( que é "Carolina")
        System.out.println("\n"+ studentNames[0]);
    }
}