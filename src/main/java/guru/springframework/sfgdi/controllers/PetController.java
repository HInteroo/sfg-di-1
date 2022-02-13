package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */
@Controller //added Controller (Assignment)

public class PetController {

    private final PetService petService;

    public PetController(PetService petService) { //added constructor (Assignment)
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
