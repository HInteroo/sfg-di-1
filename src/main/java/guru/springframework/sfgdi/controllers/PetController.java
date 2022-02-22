package guru.springframework.sfgdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */
@Controller //added Controller (Assignment) Error #1

public class PetController {

    private final PetService petService;

    public PetController(PetService petService) { //added constructor (Assignment) Error #2
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
