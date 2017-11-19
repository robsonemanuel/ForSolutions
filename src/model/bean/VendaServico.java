
package model.bean;


public class VendaServico {
    private int id;
    private int id_os;
    private String nome;
    private String data_venda;
    private float valor_venda;
    private String pecas;
    private String horas;
    private String desc;

    public VendaServico() {
    }

    public VendaServico(int id, int id_os, String nome, String data_venda, float valor_venda, String pecas,String horas,String desc) {
        this.id = id;
        this.id_os = id_os;
        this.nome = nome;
        this.data_venda = data_venda;
        this.valor_venda = valor_venda;
        this.pecas = pecas;
        this.horas = horas;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_os() {
        return id_os;
    }

    public void setId_os(int id_os) {
        this.id_os = id_os;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public float getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }

    public String getPecas() {
        return pecas;
    }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

   
    

   
    
    
  
}
