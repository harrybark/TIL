package me.harry.designpatterns.designpatterns.structural_patterns.adaptor.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
