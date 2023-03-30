package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.entity.Actor;
import com.jpa.service.ActorService;
import com.jpa.service.IActorService;

@SpringBootApplication
public class Sbjpa1Application {

	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Sbjpa1Application.class, args);
		IActorService actorService=context.getBean(ActorService.class);
		List<Actor> actorsList=List.of(new Actor(202,"Rajani","Hero",123444L),
				new Actor(203,"Venkatesh","Hero",873444L),new Actor(204,"Mahesh","Hero",3412344L),
				new Actor(205,"Sridevi","Hero",12323L)
										);
										/*
										 * Actor actor=new Actor(); actor.setAid(1); actor.setActorName("Charan New");
										 * actor.setCategory("Hero"); actor.setMobile(1234567890L); String
										 * response=actorService.registerActor(actor); System.out.println(response);
										 */
		String response=actorService.registerActors(actorsList);
		System.out.println(response);
		
	}

}
