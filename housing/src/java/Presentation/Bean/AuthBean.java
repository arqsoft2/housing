/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.ManagePerson;
import DataAccess.DAO.HomeDAO;
import DataAccess.DAO.PersonDAO;
import DataAccess.Entity.Home;
import DataAccess.Entity.Person;
import java.math.BigInteger;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author trossky
 */

@ManagedBean
@ViewScoped
public class AuthBean {

    private Long idperson;
    private String address;
    private BigInteger document;
    private String EMail;

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
    private String lastName;
    private String name;
    private String password;
    private String phone;
    private String profession;
    private String rol;
    private BigInteger salary;
    private String user;
    private String message;

    public Long getIdperson() {
        return idperson;
    }

    public void setIdperson(Long idperson) {
        this.idperson = idperson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getDocument() {
        return document;
    }

    public void setDocument(BigInteger document) {
        this.document = document;
    }

 

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public AuthBean() {
        
    }
    
    public  void authPerson(){
        message="  the Shit";
        //ManagePerson managePerson= new ManagePerson();
       // message =managePerson.authPerson( password, user);
        
    }
}
