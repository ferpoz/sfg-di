package io.strichpunkt.sfgdi.services;

import org.springframework.context.annotation.Profile;

@Profile({ "dog", "default" })
public class DogPetService implements PetService {
    public String getPetType() {
        return "Dogs are the best!";
    }
    
}