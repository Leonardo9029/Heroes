package com.argandona.heroes.service;

import com.argandona.heroes.dto.HeroeDto;
import java.util.ArrayList;

public class HeroesService implements IHeroesService{
    private  ArrayList<HeroeDto> heroes;

    public HeroesService() {
        this.heroes = new ArrayList<>();
    }

    @Override
    public void crear(HeroeDto heroe) {
        this.heroes.add(heroe);
    }

    @Override
    public void eliminar(HeroeDto heroe) {
        this.heroes.remove(heroe);
    }
}
