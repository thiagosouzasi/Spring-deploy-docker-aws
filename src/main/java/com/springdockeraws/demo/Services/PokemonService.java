package com.springdockeraws.demo.Services;

import com.springdockeraws.demo.Repositories.interfaces.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;
    public String GetPokemonInfo(String pokemonName) {
      return pokemonRepository.GetPokemonInfo(pokemonName);
    }
}
