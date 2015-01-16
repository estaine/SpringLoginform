package com.springapp.mvc.controllers;

import com.springapp.mvc.models.Account;
import com.springapp.mvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by AndreyRykhalsky on 14.01.2015.
 */
@Controller
public class AccountController {

    private AccountService accountService;

    @Autowired
    @Qualifier(value = "accountService")
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value="/")
    public ModelAndView loadLoginPage() {
        return new ModelAndView("index", "loginForm", new Account());
    }

    @RequestMapping(value="/authorize")
    public ModelAndView loadAuthorizePage(@ModelAttribute("account") Account account) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("loginAttempt");
         if(accountService.checkAuthorization(account.getLogin(), account.getPassword())) {
            modelAndView.addObject("notificationColor", "green");
            modelAndView.addObject("notificationText", "Access granted");
        }
        else {
            modelAndView.addObject("notificationColor", "red");
            modelAndView.addObject("notificationText", "Access denied");
        }
        return modelAndView;
    }
}
