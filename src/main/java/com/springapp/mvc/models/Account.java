package com.springapp.mvc.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Created by AndreyRykhalsky on 14.01.2015.
 */
@Entity
@Table(name="accounts")
public class Account {
    @Id
    @Column(name="login")
    private String login;

    @Column(name="password")
    private String password;

    public Account() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
