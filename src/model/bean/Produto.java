
package model.bean;

public class Produto {
    
    private int id;
    private String descricao;
    private int quantidade;
    private float valor;
    private String data_entrada;
    
    
    public Produto() {
    }
    

    public Produto(int id, String descricao, int quantidade, float valor,String data_entrada) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
        this.data_entrada = data_entrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
      public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }
    
    public String toString(){
       return getDescricao();
    }
 
 
}
