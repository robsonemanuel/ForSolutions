
package model.bean;


public class ContaPagar {
    private int codigo;
    private String desc;
    private float valor;
    private String data_venc;
    
    public ContaPagar() {
    }

    public ContaPagar(int codigo, String desc, float valor) {
        this.codigo = codigo;
        this.desc = desc;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData_venc() {
        return data_venc;
    }

    public void setData_venc(String data_venc) {
        this.data_venc = data_venc;
    }
    
    
}
