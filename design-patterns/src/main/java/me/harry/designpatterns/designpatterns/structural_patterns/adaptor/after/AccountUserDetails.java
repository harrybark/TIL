package me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after;

import lombok.RequiredArgsConstructor;
import me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after.security.UserDetails;

@RequiredArgsConstructor
public class AccountUserDetails implements UserDetails {

    private final Account account;

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
