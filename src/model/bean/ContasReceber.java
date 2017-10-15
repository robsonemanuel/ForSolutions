
package model.bean;


public class ContasReceber {
    private int codigo;
    private String desc;
    private float valor;

    public ContasReceber() {
    }

    public ContasReceber(int codigo, String desc, float valor) {
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
    
    
}
