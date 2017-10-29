package model.bean;

/**
 *
 * @author LUCAS
 */
public class Cargo {
    private String nome;
    private float salario;
    private int id;
    private int dpto;

    public Cargo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getDpto(){
        return dpto;
    }
    
    public void setDpto(int dpto){
        this.dpto = dpto;
    }
    
}
