package br.com.mercadinhodozezinho;

public class Fornecedor {

    private int idFornecedor;
    private String nome;
    private String contato;
    private String telefone;
    private String email;

    public String imprimirFornecedor(){
        return
            "---------------------------\n" +
            "        FORNECEDORES       \n" +
            "---------------------------\n" +
            "Nome: " + this.nome + "\n" +
            "Contato: " + this.contato + "\n" +
            "Telefone: " + this.telefone + "\n" +
            "E-mail: " + this.email + "\n";
    }


    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
