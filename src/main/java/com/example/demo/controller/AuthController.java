package com.example.demo.controller;

import com.example.demo.config.CustomUserDetails;
import com.example.demo.config.JWTokenProvider;
import com.example.demo.dto.request.LoginRequest;
import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.response.LoginResponse;
import com.example.demo.dto.response.SuccessResponse;
import com.example.demo.exception.InputInvalidException;
import com.example.demo.service.UserService;
import com.example.demo.utils.RequestValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("auth/")
public class AuthController {

//    @Autowired
//    private JWTokenProvider jwTokenProvider;
//    @Autowired
//    private AuthenticationManager authenticationManager;
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/login")
//    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword())
//        );
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String token = jwTokenProvider.generateJWT((CustomUserDetails) authentication.getPrincipal());
//        List<GrantedAuthority> roles = (List<GrantedAuthority>) authentication.getAuthorities();
//        return new ResponseEntity<>(new LoginResponse("true", authentication.getName(), roles, token), HttpStatus.OK);
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<SuccessResponse> register(@Valid @RequestBody RegisterRequest request) {
//        String error = RequestValidation.checkRegisterRequest(request);
//        if(!error.equals("")){
//            throw new InputInvalidException(error);
//        }
//        return new ResponseEntity<>(new SuccessResponse(userService.addUser(request).toString()), HttpStatus.OK);
//    }
}
