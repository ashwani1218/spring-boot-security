package com.ashwani.springsecurity.service;

import com.ashwani.springsecurity.entity.User;
import com.ashwani.springsecurity.model.UserDetailsModel;
import com.ashwani.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @created 16/12/2022
 */
@Service
public class SpringUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user  = userRepository.findByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found "+username ));
        return user.map(UserDetailsModel::new).get();
    }
}
