package psv;

import java.sql.*;
import java.util.*;

public class Teste {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();

        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

        // Testando método inserir
        /*
        cb.setPlaca("JKL2897");
        cb.setCor("Verde");
        cb.setDescricao("Carro 3");

        System.out.println(cd.inserir(cb));
        */

        // Testando método alterar
        /*
        cb.setPlaca("JKL2897");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro 3");

        System.out.println(cd.alterar(cb));
        */

        // Testando excluir
        /*
        cb.setPlaca("JKL2897");

        System.out.println(cd.excluir(cb));
        */

        List<CarroBean> li
    }
}
