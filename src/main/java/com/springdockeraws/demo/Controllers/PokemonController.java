package com.springdockeraws.demo.Controllers;


import com.springdockeraws.demo.Services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("pokemon-info")
    public String GetPokemonInfo(@RequestParam String pokemonName){

        return pokemonService.GetPokemonInfo(pokemonName);
    }
}
