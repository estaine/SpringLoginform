package com.springapp.mvc.dao;

import com.springapp.mvc.models.Account;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by AndreyRykhalsky on 15.01.2015.
 */
public class AccountDAOImpl implements AccountDAO {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Account getAccountByLogin(String login) {
        Session session = this.sessionFactory.getCurrentSession();
        Account account = (Account) session.get(Account.class, login);
        return account;
    }
}
