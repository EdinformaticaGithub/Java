package Conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @Edmilson
 */

// Faz a concxão com o Banco de Dados ( Conexao )
public class Conexao {

    public static Connection getConexao() {
            
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcDoadores",
            "postgres","123456789");
            System.out.println("Conectado com Sucesso!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados!\nErro: "+ e);
        }
        return null;
    }
}
