package me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after;

import lombok.RequiredArgsConstructor;
import me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after.security.UserDetails;
import me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after.security.UserDetailsService;

@RequiredArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;
    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);

        return new AccountUserDetails(account);
    }
}
