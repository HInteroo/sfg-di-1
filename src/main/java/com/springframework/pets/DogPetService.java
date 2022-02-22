package com.springframework.pets;

/**
 * Created by jt on 12/28/19.
 */

public class DogPetService implements PetService { //Error #5, didn't implement PerService

    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
