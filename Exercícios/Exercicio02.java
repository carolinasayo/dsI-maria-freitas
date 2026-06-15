import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Cálculo do Bônus de Natal ===\n");

        // Coleta os dados do funcionário
        System.out.print("Digite o código do funcionário: ");
        int codigoFuncionario = entrada.nextInt();

        System.out.print("Digite o sexo do funcionário (M para masculino, F para feminino): ");
        char sexo = entrada.next().toUpperCase().charAt(0);

        System.out.print("Digite quantos anos o funcionário trabalha na empresa: ");
        int anosDeEmpresa = entrada.nextInt();

        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();

        // Calcula o bônus de acordo com as regras da empresa
        double valorDoBonus;

        boolean homemComMaisDe15Anos = (sexo == 'M' && anosDeEmpresa > 15);
        boolean mulherComMaisDe10Anos = (sexo == 'F' && anosDeEmpresa > 10);

        if (homemComMaisDe15Anos) {
            valorDoBonus = salario * 0.20;
        } else if (mulherComMaisDe10Anos) {
            valorDoBonus = salario * 0.25;
        } else {
            valorDoBonus = 100;
        }

        // Mostra o resultado para o usuário
        System.out.println("Resultado");
        System.out.println("Funcionário código " + codigoFuncionario + " receberá um bônus de R$ "
                + String.format("%.2f", valorDoBonus));

        entrada.close();
    }
}
}