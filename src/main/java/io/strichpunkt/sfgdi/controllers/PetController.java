package io.strichpunkt.sfgdi.controllers;

import io.strichpunkt.sfgdi.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    
    private final PetService petService;

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }

    public PetController(@Qualifier("pet") PetService petService) {
        this.petService = petService;
    }
    
}