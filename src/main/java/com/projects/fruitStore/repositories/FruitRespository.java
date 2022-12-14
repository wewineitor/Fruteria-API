package com.projects.fruitStore.repositories;

import com.projects.fruitStore.models.FruitModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRespository extends CrudRepository<FruitModel, Long> {
}
