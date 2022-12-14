package com.projects.fruitStore.services;

import com.projects.fruitStore.models.UserModel;
import com.projects.fruitStore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public String saveUser(UserModel user) {
        try {
            userRepository.save(user);
            return "Usuario guardado correctamente";

        }
        catch (Exception err) {
            return "No se pudo guardar el usuario debido al siguiente error: " + err;
        }
    }
}
