
package model.bean;

public class Funcionario implements Autenticacao {
   private float salario;
   private String departamento;
   private String cargo;
   private String data_admissao;
   private int login;
   private String cpf;
   private String email;
   private String nome;
   private String logradouro;
   private int numero;
   private String telefone;

    public Funcionario() {
    }
    public Funcionario(float salario, String departamento, String cargo, String data_admissao, int login, String cpf, String email, String nome, String logradouro, int numero, String telefone) {
        this.salario = salario;
        this.departamento = departamento;
        this.cargo = cargo;
        this.data_admissao = data_admissao;
        this.login = login;
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.telefone = telefone;
    }
    
    
    

    @Override
    public void verificarPerfil() {
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
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
   
   

    
   
}
