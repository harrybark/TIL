package me.harry.designpatterns.designpatterns.structural_patterns.adaptor.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
