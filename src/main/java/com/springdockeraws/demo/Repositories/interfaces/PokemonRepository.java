package com.springdockeraws.demo.Repositories.interfaces;

import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository {

    String GetPokemonInfo(String pokemonName);
}
