
package model.bean;

public class Cliente {
    private String cpf;
    private String email;
    private String nome;
    private String logradouro;
    private int numero;
    private String telefone;
    private int id;
    private String celular;
    private String cnpj;

    public Cliente() {
    }

    public Cliente(String cpf, String email, String nome, String logradouro, int numero, String telefone, int id, String celular, String cnpj) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.telefone = telefone;
        this.id = id;
        this.celular = celular;
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}