package com.example.demo.service;

import com.example.demo.config.CustomUserDetails;
import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<Users> users = userRepository.findUsersByName(s);
        if(users.isEmpty()){
            throw new DataNotFoundException("Can't find any User for UserName: "+s);
        }
        return new CustomUserDetails(users.get());
    }

    public UserDetails loadUserByUserID(Long userId) throws UsernameNotFoundException {
        Optional<Users> users = userRepository.findById(userId);
        if(users.isEmpty()){
            throw new DataNotFoundException("Can't find any User for UserName: "+userId);
        }
        return new CustomUserDetails(users.get());
    }

    public Boolean addUser(RegisterRequest request) {
        Optional<Users> optionalUser = userRepository.findUsersByName(request.getUserName());
        if(optionalUser.isPresent()){
            throw new DataNotFoundException("Username already exists");
        }
        try {
            userRepository.save(optionalUser.get());
            return true;
        } catch (Exception ex){
            return false;
        }
    }
}
