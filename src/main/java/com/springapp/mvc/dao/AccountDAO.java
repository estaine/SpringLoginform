package com.springapp.mvc.dao;

import com.springapp.mvc.models.Account;
import org.hibernate.SessionFactory;

/**
 * Created by AndreyRykhalsky on 15.01.2015.
 */
public interface AccountDAO {
    public Account getAccountByLogin(String login);
}
