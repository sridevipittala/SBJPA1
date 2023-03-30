package com.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer> {

}
