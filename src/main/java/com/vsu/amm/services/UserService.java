package com.vsu.amm.services;

import com.vsu.amm.entities.UserEntity;
import com.vsu.amm.entities.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by antiz_000 on 11/13/2017.
 */
@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public UserEntity createUser(String login, String firstName, String lastName, String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String passHash = generateMd5Hash(pass);
        UserEntity newUser = new UserEntity(login,firstName, lastName, null, passHash);
        repository.save(newUser);
        return newUser;
    }

    public UserEntity findUserById(long id) {
        return repository.findOne(id);
    }

    private String generateMd5Hash(String text) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] bytesOfMessage = text.getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] result = md.digest(bytesOfMessage);
        return new String(result);
    }
}
