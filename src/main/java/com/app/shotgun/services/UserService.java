package com.app.shotgun.services;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.data.User;
import com.app.shotgun.repositories.UserRepository;

@Service
public class UserService {

    Random random = new Random();

    @Autowired
    private UserRepository UserRepository;

    public List<User> getAllUsers() {
        return (List<User>) UserRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return UserRepository.findById(id);
    }

    public User createUser(User user) {
        return UserRepository.save(user);
    }

    public User updateUser(Integer id, User user) {
        Optional<User> optionalUser = UserRepository.findById(id);
        if(!optionalUser.isPresent()){
            return null;
        }

        User existingUser = optionalUser.get();
        existingUser.setEmail(user.getEmail());
        existingUser.setImg(user.getImg());
        existingUser.setNom(user.getNom());
        existingUser.setPrenom(user.getPrenom());
        existingUser.setPassword(user.getPassword());
        return UserRepository.save(existingUser);
    }

    public void deleteUser(Integer id) {
        UserRepository.deleteById(id);
    }
}
