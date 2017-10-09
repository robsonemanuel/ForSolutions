/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author BOBSON
 */
public class FormaPagamento {
    private int codigo;
    private String forma_pagamento;
    private int vezes;
    private int id_pagamento;

    public FormaPagamento() {
    }

    public FormaPagamento(int codigo, String forma_pagamento, int vezes, int id_pagamento) {
        this.codigo = codigo;
        this.forma_pagamento = forma_pagamento;
        this.vezes = vezes;
        this.id_pagamento = id_pagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }
    
    
    
}
