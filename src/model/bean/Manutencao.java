
package model.bean;

import java.util.List;

public class Manutencao {
    private String descricao;
    private String nmTecnico;
    private int numero_os;
    private String dt_inicio;
    private String hora;
    private String produtos;

    public Manutencao() {
    }   

    public Manutencao(String descricao, String nmTecnico, int numero_os, String dt_inicio, String hora, String produtos) {
        this.descricao = descricao;
        this.nmTecnico = nmTecnico;
        this.numero_os = numero_os;
        this.dt_inicio = dt_inicio;
        this.hora = hora;
        this.produtos = produtos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNmTecnico() {
        return nmTecnico;
    }

    public void setNmTecnico(String nmTecnico) {
        this.nmTecnico = nmTecnico;
    }

    public int getNumero_os() {
        return numero_os;
    }

    public void setNumero_os(int numero_os) {
        this.numero_os = numero_os;
    }

    public String getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(String dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }
    
    
}
