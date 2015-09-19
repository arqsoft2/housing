/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.PersonDAO;
import DataAccess.Entity.Person;
import java.math.BigInteger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Query;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author trossky
 */
public class ManagePerson {
    
    
    public String createPerson(Long idperson,String address , BigInteger document, String eMail,String lastName,String name,
            String password,String phone,String profession, String rol,BigInteger salary, String user   )
    {
        Person person = new  Person();
        
        person.setDocument(document);
        person.setAddress(address);
        person.setEMail(eMail);
        person.setIdperson(idperson);
        person.setLastName(lastName);
        person.setName(name);
        person.setPassword(password);
        person.setPhone(phone);
        person.setProfession(profession);
        person.setRol(rol);
        person.setSalary(salary);
        person.setUser(user);
        
                
        
        
        PersonDAO personDAO= new PersonDAO();
        Person personE= personDAO.persist(person);
        
        
        if (personE!=null) {
            return "the account was created, your user is : "+person.getUser();
            
        }else{
            return "The person could not be created";
        }
    }
    
    public String authPerson(String password, String user)
    {
        return "la mierda";
        
    }

    


}
