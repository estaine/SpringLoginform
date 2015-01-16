package com.springapp.mvc.service;

import com.springapp.mvc.models.Account;

/**
 * Created by AndreyRykhalsky on 15.01.2015.
 */
public interface AccountService {
    public boolean checkAuthorization(String login, String password);
}
