
package dao;

/**
 *
 * @Edmilson
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Conect.Conexao;
import model.Doador;

// Traduz o conteudo do Bando de Dados Para Objetos do Tipo Cliente ( DoadotDAO ) 
public class DoadorDAO {

    private final Connection connection = Conexao.getConexao();

    
// MÉTODO PARA SALVAR O OBJETO NO BANCO DE DADOS
    
   public void save(Doador objectdoador) {
    try {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO tbldoadores (nome, endereco, bairro, cidade, telefone) VALUES (?,?,?,?,?)");
        
        // Usando os valores do objeto objectdoador
        ps.setString(1, objectdoador.getNome());
        ps.setString(2, objectdoador.getEndereco());
        ps.setString(3, objectdoador.getBairro());
        ps.setString(4, objectdoador.getCidade());
        ps.setString(5, objectdoador.getTelefone());
        
        //Executando o comando
        ps.execute();
        JOptionPane.showMessageDialog(null, "Informações Inseridas Com Sucesso!");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao Inserir as Informações!");
    }
}
   
// MÉTODO PARA ATUALIZAR O OBJETO NO BANCO DE DADOS
   
public void atualizar(Doador objectdoador) {
    String query = "UPDATE tbldoadores SET nome=?, endereco=?, bairro=?, cidade=?, telefone=? WHERE id=?";

    try {
        PreparedStatement ps = connection.prepareStatement(query);
        
        // Usando os valores do objeto objectdoador
        ps.setString(1, objectdoador.getNome());
        ps.setString(2, objectdoador.getEndereco());
        ps.setString(3, objectdoador.getBairro());
        ps.setString(4, objectdoador.getCidade());
        ps.setString(5, objectdoador.getTelefone());
        //ps.setInt(6, objectdoador.getId()); // Supondo que você tenha um método getId() para obter o ID

        // Executando o comando
        int linhasAfetadas = ps.executeUpdate();
        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma informação foi atualizada.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao Atualizar as Informações: " + e.getMessage());
    }
    
}


}
