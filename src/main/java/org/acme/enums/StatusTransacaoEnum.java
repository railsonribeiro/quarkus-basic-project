package org.acme.enums;

public enum StatusTransacaoEnum {
    DISPONIVEL("disponivel"),
    INDISPONIVEL("indisponivel"),
    EM_ANDAMENTO("em_andamento"),
    PROCESSADA("processada"),
    CANCELADA("cancelada");

    private String status;

    public String getStatus() {
        return status;
    }

    StatusTransacaoEnum(String status){
        this.status = status;
    }

}
