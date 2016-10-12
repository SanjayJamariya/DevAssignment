package com.devassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devassignment.entity.ShopEntity;

/**
 * The repository interface to store information into h2 database
 */
@Repository
public interface ShopRepository extends JpaRepository<ShopEntity, Integer>{

}
