package com.jpa.service;

import java.util.List;

import com.jpa.entity.Actor;

public interface IActorService {
	public String registerActor(Actor actor);
	public String registerActors(List<Actor> actor);
}
