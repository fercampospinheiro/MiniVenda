package br.com.lifejesus.minivenda.domain;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fernando_2 on 09/07/2014.
 */
@Component
public class FornecedorRepository {
    @PersistenceContext
    private EntityManager em ;

    public Fornecedor buscaFornecedorEspecifico(Fornecedor fornecedor){
        Fornecedor fornecedorEspecifico;
        return fornecedorEspecifico = em.find(Fornecedor.class,fornecedor);
    }
    public List<Fornecedor> buscaTodosFornecedores(){
        return Lists.newArrayList(em.createQuery("select f from Fornecedor f").getResultList());
    }
    public void adicionaNovoFornecedor(Fornecedor fornecedor){
        em.persist(fornecedor);
    }

    public void alteraFornecedorCadastrado(Fornecedor fornecedor){
        em.merge(fornecedor);
    }

    public void removeFornecedorCadastrado(Fornecedor fornecedor){
        em.remove(fornecedor);
    }
}
