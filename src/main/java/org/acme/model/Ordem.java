package org.acme.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.acme.enums.StatusTransacaoEnum;
import org.acme.enums.TransacaoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "DB_DEFAULT", name = "ORDEM")
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "data_criacao")
    private LocalDate dataCriacao;
    @Column(name = "status_transacao_enum")
    private StatusTransacaoEnum statusTransacaoEnum;
    @Column(name = "transacao_enum")
    private TransacaoEnum transacaoEnum;
    private BigDecimal preco;
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public TransacaoEnum getTransacaoEnum() {
        return transacaoEnum;
    }

    public void setTransacaoEnum(TransacaoEnum transacaoEnum) {
        this.transacaoEnum = transacaoEnum;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public StatusTransacaoEnum getStatusTransacaoEnum() {
        return statusTransacaoEnum;
    }

    public void setStatusTransacaoEnum(StatusTransacaoEnum statusTransacaoEnum) {
        this.statusTransacaoEnum = statusTransacaoEnum;
    }

}
