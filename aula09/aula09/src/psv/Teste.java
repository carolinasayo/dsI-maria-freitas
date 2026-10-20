package psv;

import java.sql.Connection;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Connection con = Conexao.abirConexao();

        if (con == null) {
            System.out.println("Não foi possível conectar ao banco.");
            return;
        }

        try {
            CarroBean cb = new CarroBean();
            CarroDAO cd = new CarroDAO(con);

            cb.setPlaca("JKK1900");
            cb.setCor("Azul");
            cb.setDescricao("Carro 1");

            System.out.println(cd.inserir(cb));
            
            List<CarroBean> lista = cd.listarTodos();

            if (lista != null) {
                for (CarroBean carro : lista) {
                    System.out.println("Placa: " + carro.getPlaca());
                    System.out.println("Cor: " + carro.getCor());
                    System.out.println("Descrição: " + carro.getDescricao());
                    System.out.println("--------------------");
                }
            }

        } finally {
            Conexao.fecharConexao(con);
        }
    }
}