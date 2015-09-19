/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Home;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author trossky
 */
@Stateless
@LocalBean
public class HomeDAO {
    
     @PersistenceContext
    EntityManager em;

    public void crear(Home pedido) {
        em.persist(pedido);
    }

    public void actualizar(Home pedido) {
        em.merge(pedido);
    }

    public void borrar(Home pedido) {
        em.remove(pedido);
    }

    public Home buscarPorID(Long id) {
        return (em.find(Home.class, id));
    }

    public List<Home> buscarTodos() {
        Query q = em.createQuery("SELECT p FROM Home p");
        return q.getResultList();
    }

    public List<Home> buscarPorCliente(Integer idPerson) {
        Query q = em.createQuery("SELECT p FROM Home p WHERE p.customer.customerId = :idCliente");

        q.setParameter("idCliente", idPerson);
        return q.getResultList();
    }
    
}
