package com.juegodedados.security;

import com.juegodedados.model.Player;
import com.juegodedados.repository.PlayerRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

    @Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{

    @Autowired
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Player player = PlayerRepository.findByName(username);
        if (player == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(Player.getName(), Player.getPassword(), new ArrayList<>());
    }
}