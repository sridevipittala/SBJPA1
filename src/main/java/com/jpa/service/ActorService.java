package com.jpa.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.Actor;
import com.jpa.repository.IActorRepository;

@Service
public class ActorService implements IActorService {
	@Autowired
	IActorRepository iActorRepository;

	@Override
	public String registerActor(Actor actor) {

		System.out.println("Proxy class name:" + iActorRepository.getClass() + " implemented interfaces...."
				+ Arrays.toString(iActorRepository.getClass().getInterfaces()));
		Actor savedActor = iActorRepository.save(actor);

		return "Actor with id:" + savedActor.getAid() + "  is saved";
	}

	@Override
	public String registerActors(List<Actor> actors) {
		String response="Saved Objects:";
		/*
		 * if (actors != null) { Iterable<Actor> savedActors =
		 * iActorRepository.saveAll(actors); int ids[]=new int[actors.size()]; int i=0;
		 * for(Actor actor:actors) { ids[i++]=actor.getAid(); response.concat(ids.length
		 * +" with these ids"+Arrays.toString(ids)) ; } }
		 */
		System.out.println("All registered actors are :"+ iActorRepository.count());
		if (actors != null) {
			List<Actor> savedActors = (List<Actor>) iActorRepository.saveAll(actors);
			
			int i=0;
			List ids=savedActors.stream().map(actor->actor.getAid()).collect(Collectors.toList());
			
			response.concat(ids.size() +" with these ids"+ids.toString())	;
			
		}
		return response;
	}

}
