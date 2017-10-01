
package model.bean;

public class Funcionario implements Autenticacao {
   private float salario;
   private String departamento;
   private String cargo;
   private String data_admissao;
   private Login login;
   private String cpf;
   private String email;
   private String nome;
   private String logradouro;
   private int numero;
   private String telefone;

    public Funcionario() {
    }
    public Funcionario(float salario, String departamento, String cargo, String data_admissao, Login login, String cpf, String email, String nome, String logradouro, int numero, String telefone) {
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
   
   

    
   
}
