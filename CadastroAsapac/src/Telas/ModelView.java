// CÓDIGO DA CLASSE MODELVIEW FUNCIONANDO

package Telas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Conect.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;


// Cria um modelo da minha jTableView
public class ModelView {
    
    private final Connection connection = Conexao.getConexao();
    
    private final JTable jTableView;

    public ModelView(JTable jTableView) {
        this.jTableView = jTableView;
    }

    // Método para conectar ao banco de dados e buscar os dados
    public void buscarDados() {
                
        String query;
        query = "SELECT id, nome, endereco, bairro, cidade, telefone FROM tbldoadores ORDER BY \"nome\" ASC ";
        
        try ( 
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
             
            // Limpa a tabela antes de adicionar novos dados
            DefaultTableModel model = (DefaultTableModel) jTableView.getModel();
            model.setRowCount(0);
            
            // Percorre os resultados e adiciona ao modelo da tabela
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String telefone = rs.getString("telefone");
                
                model.addRow(new Object[]{id, nome, endereco, bairro, cidade, telefone});
            }
            // Fechar Statement e ResultSet
                rs.close(); // Fecha o ResultSet
                stmt.close(); // Fecha o Statement
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados: " + e.getMessage());
        }
    }
    
    // Metodo Exclir Registro
    public void excluirRegistro() {
        int linhaSelecionada = jTableView.getSelectedRow();
        // Testa se a Linha foi Selecionada
        if (linhaSelecionada != -1) {
            int idRegistro = (int) jTableView.getValueAt(linhaSelecionada, 0);

            // Chamar o método para excluir o registro do banco de dados
            boolean sucesso = excluirDoBanco(idRegistro);

            if (sucesso) {
                // Remova a linha da tabela
                DefaultTableModel model = (DefaultTableModel) jTableView.getModel();
                model.removeRow(linhaSelecionada);
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir registro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Clique na Linha que deseja Excluir");
        }
    }

    private boolean excluirDoBanco(int id) {
       
        String query;
		query = "DELETE FROM tbldoadores WHERE id = ?";

        try (
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
        
    }
      
}
   