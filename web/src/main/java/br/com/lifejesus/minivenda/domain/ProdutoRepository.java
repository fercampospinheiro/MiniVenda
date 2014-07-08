package br.com.lifejesus.minivenda.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by FERNANDOSIS on 08/07/14.
 */
public class ProdutoRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Produto> buscaProdutos(){
        return new ArrayList<Produto>(em.createQuery("select p from Produto p",Produto.class).getResultList());
    }

    public void cadastraProduto (Produto produto){
        em.persist(produto);
    }

    public void alteraProdutoCadastrado(Produto produto){
        em.merge(produto);
    }

    public void removeProdutoCadastrado(Produto produto){
        em.remove(produto);
    }

    public List<Produto> buscaProdutosPorPagina(int numeroDeRegistros , int indiceInicial){
        Query query = em.createQuery("select p from Produto p");
        query.setMaxResults(numeroDeRegistros);
        query.setFirstResult(indiceInicial);
        return new ArrayList<Produto>(query.getResultList());
    }

    public List<Produto> buscaProdutosEmPromocao(){
        Query query = em.createNativeQuery("select ");
        return new ArrayList<>();
    }


}
