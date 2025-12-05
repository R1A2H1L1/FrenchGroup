package com.FrenchGroup.FrenchGroup.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    private Long id;
    private String username;
    private String email;
    private String password;
    

    public Long getId() {
        return id;
    }    
    public String getusername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public void setusername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
