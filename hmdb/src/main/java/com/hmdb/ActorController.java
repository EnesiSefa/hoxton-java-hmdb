package com.hmdb;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {

    @GetMapping("/actors")// cannot get @GetMapping
  public ArrayList<Actor> getAllCats() {
    return Actor.actors;
  }

  @GetMapping("/actors/{id}")
  public Actor getSingleActor(@PathVariable Integer id) {
    Actor match = null;

    for (Actor actor : Actor.actors) {
      if (actor.id == id) {
        match = actor;
      }
    }

    if (match == null)
      throw new Error("Actor nout found.");

    return match;
  }

    
    
    
}
