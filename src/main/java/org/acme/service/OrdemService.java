package org.acme.service;

import java.time.LocalDate;
import java.util.List;

import org.acme.dto.OrdemDTO;
import org.acme.enums.StatusTransacaoEnum;
import org.acme.enums.TransacaoEnum;
import org.acme.model.Ordem;
import org.acme.repository.OrdemRepository;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.SecurityContext;

@RequestScoped
public class OrdemService {

    @Inject
    OrdemRepository repository;

    // TODO: Tratar casos de exceção: preço negativo, transacaoEnum invalido, etc

    @Transactional
    public void inserir(SecurityContext sc, OrdemDTO ordemDTO) {
        var ordem = new Ordem();
        ordem.setDataCriacao(LocalDate.now());
        ordem.setUserName(sc.getUserPrincipal().getName());
        ordem.setPreco(ordemDTO.getPreco());
        ordem.setTransacaoEnum(TransacaoEnum.valueOf(ordemDTO.getTransacao().toUpperCase()));
        ordem.setStatusTransacaoEnum(StatusTransacaoEnum.EM_ANDAMENTO);

        try {
            repository.persist(ordem);
            ordem.setStatusTransacaoEnum(StatusTransacaoEnum.PROCESSADA);
        } catch (Exception e) {
            ordem.setStatusTransacaoEnum(StatusTransacaoEnum.CANCELADA);
            repository.persist(ordem);
        }
    }

    public List<Ordem> listarOrders() {
        return repository.listAll();
    }

}
