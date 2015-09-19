/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Person;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author trossky
 */

public class PersonDAO {
 
  
    
    
    
    public Person persist(Person person){
       EntityManager em;
       EntityManagerFactory emf;
       
       emf=Persistence.createEntityManagerFactory("housingPU");
       em=emf.createEntityManager();
       
        em.getTransaction().begin();
        
        try{
            em.persist(person);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            em.close();
            
            return person;
        }
        
        
    }
    
    
    
  

    
}
