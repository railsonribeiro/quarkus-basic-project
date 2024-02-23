package org.acme.enums;

public enum TransacaoEnum {
    COMPRA("compra"), VENDA("venda");

    String transacao;
    
    TransacaoEnum( String transacao){
        this.transacao = transacao;
    }

    public String getTransacao() {
        return transacao;
    }
}
