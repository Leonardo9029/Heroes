package com.argandona.heroes.service;

import com.argandona.heroes.controller.HeroesController;
import com.argandona.heroes.dto.HeroeDto;

public interface IHeroesService {
    public void crear(HeroeDto Heroe);
    public void eliminar(HeroeDto Heroe);


}
