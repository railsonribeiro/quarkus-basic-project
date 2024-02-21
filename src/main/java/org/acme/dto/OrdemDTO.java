package org.acme.dto;

import java.math.BigDecimal;
public class OrdemDTO {
 
    private String userName;
    private String transacao;
    private BigDecimal preco;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getTransacao() {
        return transacao;
    }

    public void setTransacao(String transacao) {
        this.transacao = transacao;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}