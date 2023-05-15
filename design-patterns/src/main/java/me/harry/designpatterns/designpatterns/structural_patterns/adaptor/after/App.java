package me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after;

import me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after.security.LoginHandler;
import me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
