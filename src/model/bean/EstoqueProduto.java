
package model.bean;

import java.util.Date;

public class EstoqueProduto implements Iestoque {
  private Produto produto;
  private int id;
  private Date dataEntrega;

    public EstoqueProduto(Produto produto, int id, Date dataEntrega) {
        this.produto = produto;
        this.id = id;
        this.dataEntrega = dataEntrega;
    }
    

    public EstoqueProduto() {
        
    }
    

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
     @Override
    public void TotalEstoque() {
    }
}
