package com.projects.fruitStore.services;

import com.projects.fruitStore.models.FruitModel;
import com.projects.fruitStore.repositories.FruitRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FruitService {
    @Autowired
    FruitRespository fruitRespository;

    public ArrayList<FruitModel> getFruits() {
        return (ArrayList<FruitModel>) fruitRespository.findAll();
    }

    public FruitModel saveFruit(FruitModel fruit) {
        return fruitRespository.save(fruit);
    }

    public boolean deleteFruit(Long id) {
        try {
            fruitRespository.deleteById(id);
            return true;
        }
        catch (Exception err) {
            return false;
        }
    }
}
