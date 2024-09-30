
package Telas;
/**
 *
 * @Edmilson
 */
import dao.DoadorDAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Doador;
import Conect.Conexao;
import java.sql.Connection;

// Classe Principal Main
public class DoadorView extends javax.swing.JFrame {

    DoadorDAO objDAO = new DoadorDAO();
    
        
// Inicia os componentes da tela pronripal
 public DoadorView() {
        initComponents();
        selecionarLinha();
        iniciarJtable();
                
    }
 public void limparCampos(){
    // Limpar os campos
        txtId.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtTelefone.setText("");
 }
 
 public void iniciarJtable(){
        ModelView modelView = new ModelView(jTableView); 
        modelView.buscarDados(); // Chama o Método da Classe ModelView
 }
 
 private void selecionarLinha(){
// Adiciona um listener para quando o usuário clicar em uma linha da tabela
jTableView.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        int row = jTableView.rowAtPoint(e.getPoint()); // Obtém a linha clicada
        if (row != -1) { // Verifica se uma linha foi clicada
            // Obtém o código como inteiro e converte para String
            int codigo = (int) jTableView.getValueAt(row, 0); // Faz o cast para int
            txtId.setText(String.valueOf(codigo)); // Converte para String
            
            // Preenche os outros campos
            txtNome.setText(jTableView.getValueAt(row, 1).toString());
            txtEndereco.setText(jTableView.getValueAt(row, 2).toString());
            txtBairro.setText(jTableView.getValueAt(row, 3).toString());
            txtCidade.setText(jTableView.getValueAt(row, 4).toString());
            txtTelefone.setText(jTableView.getValueAt(row, 5).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela.");
        }
    }
});

}    
 
 
 @SuppressWarnings("unchecked")
 
    
// Conecxão com o Banco de Dados    
private final Connection connection = Conexao.getConexao();
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelMeio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableView = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE DOADORES ASAPAC SÃO JOÃO DEL REI");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTitulo.setBackground(new java.awt.Color(162, 217, 247));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Babylon5", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/LogoAsapac.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        jPanelMeio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMeio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("ENDEREÇO:");

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("BAIRRO:");

        txtBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setText("CIDADE:");

        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("TELEFONE:");

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText("CÓDIGO:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelMeioLayout = new javax.swing.GroupLayout(jPanelMeio);
        jPanelMeio.setLayout(jPanelMeioLayout);
        jPanelMeioLayout.setHorizontalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefone))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeioLayout.createSequentialGroup()
                        .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(jPanelMeioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMeioLayout.createSequentialGroup()
                                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelMeioLayout.createSequentialGroup()
                                .addGap(555, 555, 555)
                                .addComponent(jLabel6))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanelMeioLayout.setVerticalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableView.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "ENDEREÇO", "BAIRRO", "CIDADE", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableView.setShowGrid(true);
        jTableView.getTableHeader().setReorderingAllowed(false);
        jTableView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableView);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSalvar.setBackground(new java.awt.Color(162, 217, 247));
        btnSalvar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(162, 217, 247));
        btnLimpar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.setToolTipText("");
        btnLimpar.setBorder(null);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(162, 217, 247));
        btnAtualizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setToolTipText("");
        btnAtualizar.setBorder(null);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir1.setBackground(new java.awt.Color(162, 217, 247));
        btnExcluir1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnExcluir1.setText("EXCLUIR");
        btnExcluir1.setToolTipText("");
        btnExcluir1.setBorder(null);
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(668, 668, 668))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //Capturando os dados dos campos de entrada
        Doador doador = new Doador();
        doador.setNome(txtNome.getText());
        doador.setEndereco(txtEndereco.getText());
        doador.setBairro(txtBairro.getText());
        doador.setCidade(txtCidade.getText());
        doador.setTelefone(txtTelefone.getText());
        
        // Validação dos campos para gravaçao
        if (doador.getNome().isEmpty() || doador.getEndereco().isEmpty() || 
        doador.getBairro().isEmpty() || doador.getCidade().isEmpty() || 
        doador.getTelefone().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        return;
    }

        // Salvando o Objeto Doador
        objDAO.save(doador);

        // Limpar os campos do formulário
        limparCampos();
        
        //Recarregar Tabela
        ModelView modelView = new ModelView(jTableView); 
        modelView.buscarDados(); // Chama o Método da Classe ModelView
        
                
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Limpar os campos do formulário
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
// Captura os dados dos campos de texto
       
        String id = txtId.getText();
        String nome = txtNome.getText();
        String endereco = txtEndereco.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();
        String telefone = txtTelefone.getText();

        String query;
                query = "UPDATE tbldoadores SET nome=?, endereco=?, bairro=?, cidade=?, telefone=? WHERE id=?";

    try {
        
        PreparedStatement pst = connection.prepareStatement(query);
        
        // Usando os valores do objeto objectdoador
            pst.setString(1, nome);
            pst.setString(2, endereco);
            pst.setString(3, bairro);
            pst.setString(4, cidade);
            pst.setString(5, telefone);
            pst.setInt(6, Integer.parseInt(id));
        
        // Executando o comando
        int linhasAfetadas = pst.executeUpdate();
        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma informação foi atualizada.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao Atualizar as Informações: " + e.getMessage());
    } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Clique na linha que deseja Atualizar. " );
    }
    // Limpar os campos do formulário
       limparCampos();
       
    //Recarregar Tabela
        ModelView modelView = new ModelView(jTableView); 
        modelView.buscarDados(); // Chama o Método da Classe ModelView   
       
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
            /*Busca dos dados da tabela tbldoadores e mostra na jTableView*/
            // Instancia um novo objeto da classe ModelView, passando a jTableView como parâmetro
            ModelView modelView = new ModelView(jTableView); 
            modelView.excluirRegistro(); // Chama o Método da Classe ModelView
            modelView.buscarDados(); // Chama o Método da Classe ModelView
            limparCampos();
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void jTableViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableViewMouseClicked
                    
    }//GEN-LAST:event_jTableViewMouseClicked
   

    
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DoadorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableView;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
