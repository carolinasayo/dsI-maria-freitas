    System.out.println(x + y); // somatória de variáveis
    System.out.println(x - y); // subtração de variáveis
    System.out.println(x * y); // multiplicação de variáveis
    System.out.println(x / y); // divisão de variáveis
    System.out.println(x % y); // porcentagem dessas variáveis

    int z = 5;
    ++z;
    System.out.println(z); // = 6, pois o ++ literalmente soma uma unidade a mais do número guardado na variável
    --z;
    System.out.println(z); // = 4, faz a mesma coisa que o ++ porém subtrai uma unidade

&& -> verifica se duas afirmações são verdadeiras. ex:
public class Main {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 && x < 10); // 5>3 e 5<10, portanto ele apresenatrá um 'true'
  }
}
--
|| -> verifica se uma das afirmações é verdadeira, geralmente a primeira parte apenas
public class Main {
public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 || x < 4); // diz true embora o segundo comando seja falso
  }
}
--
! -> reverte o resultado. tipo, se a afirmação for positiva (tipo, x=2 e 'x > 1'), o sistema responderá com um "false" (embora seja verdadeira)
public class Main {
public static void main(String[] args) {
    int x = 5;
    System.out.println(!(x > 3 && x < 10)); // vai resultar em false mesmo assim..
  }
}
--
x = 5
+= -> basicamente diz x = x + 5
o = após um comando matemático induz uma expressão matemática. o mesmo ocorre quando coloca um +, -, ^, |, /... 
  possui a finalidade de encurtar o código e facilitar sua leitura.

