package com.springdockeraws.demo.Repositories.implementations;


import com.springdockeraws.demo.Repositories.interfaces.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Repository
public class PokemonRepositoryImplementation implements PokemonRepository {

    @Autowired
    private Environment env;

    @Override
    public String GetPokemonInfo(String pokemonName) {
        try {
          return  new RestTemplate().getForObject(env.getProperty("baseUrl")+pokemonName, String.class);
        }catch (HttpClientErrorException error){
            if (error.getStatusCode() == HttpStatus.NOT_FOUND) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
        }

    }
}
