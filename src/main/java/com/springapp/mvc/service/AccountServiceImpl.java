package com.springapp.mvc.service;

import com.springapp.mvc.dao.AccountDAO;
import com.springapp.mvc.models.Account;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by AndreyRykhalsky on 15.01.2015.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDAO;

    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    @Transactional
    public boolean checkAuthorization(String login, String password) {
        Account account = accountDAO.getAccountByLogin(login);
        if(account == null)
            return false;
        else
            return password.equals(account.getPassword());
    }
}
