package br.com.lifejesus.minivenda.domain;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;

@Repository
public class UsuarioRepository {

    @PersistenceContext
    private EntityManager em;

    public Set<User> buscaTodos() {
        return Sets.newHashSet(em.createQuery("select u from User u", User.class).getResultList());
    }
}
