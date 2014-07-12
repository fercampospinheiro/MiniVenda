package br.com.lifejesus.minivenda.domain;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by FERNANDOSIS on 08/07/14.
 */
@Component
public class ProdutoRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Produto> buscaProdutos(){
        return Lists.newArrayList(em.createQuery("select p from Produto p",Produto.class).getResultList());
    }

    public void adicionaNovoProduto(Produto produto){
        em.persist(produto);
    }

    public void alteraProduto(Produto produto){
        em.merge(produto);
    }

    public void removeProduto(Produto produto){
        em.remove(produto);
    }

    public List<Produto> buscaProdutosPorPagina(int numeroDeRegistros , int indiceInicial){
        Query query = em.createQuery("select p from Produto p");
        query.setMaxResults(numeroDeRegistros);
        query.setFirstResult(indiceInicial);
        return Lists.newArrayList(query.getResultList());
    }

    public List<Produto> buscaProdutosEmPromocao(){
        Query query = em.createNativeQuery("select ");
        return new ArrayList<Produto>();
    }


}
