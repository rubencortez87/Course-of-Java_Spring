package com.platzi.market.domain;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlatziUserDetailService implements UserDetailService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UserNameNotFoundException {
        return new User("alejandro", "{noop}platzi", new ArrayList<>());
    }
}
