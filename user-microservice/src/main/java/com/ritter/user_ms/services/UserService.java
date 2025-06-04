package com.ritter.user_ms.services;

import com.ritter.user_ms.models.UserModel;
import com.ritter.user_ms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

}
