package model;

/**
 *
 * @Edmilson
 */

// Objeto com Atributos da Tabela do Banco de Dados ( tbldoadores )
public class Doador {
    
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String telefone;

    

// Chamadas Getters e Setters
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
  
}    
