package io.strichpunkt.sfgdi.controllers;

import io.strichpunkt.sfgdi.services.PetService;

public class PetController {
    
    private final PetService petService;

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
    
}