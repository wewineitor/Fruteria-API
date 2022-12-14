package com.projects.fruitStore.controller;

import com.projects.fruitStore.models.FruitModel;
import com.projects.fruitStore.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    FruitService fruitService;

    @GetMapping()
    public ArrayList<FruitModel> getFruits() {
        return fruitService.getFruits();
    }

    @PostMapping
    public FruitModel saveFruit(@RequestBody FruitModel fruit) {
        return this.fruitService.saveFruit(fruit);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.fruitService.deleteFruit(id);

        if(!ok) return "No se pudo eliminar la fruta con el id " + id;
        return "Se elimino la fruta con el id " + id;
    }
}
