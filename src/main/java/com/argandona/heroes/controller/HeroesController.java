package com.argandona.heroes.controller;

import com.argandona.heroes.service.HeroesService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HeroesController {

    @FXML
    public TextField txtId;
    @FXML
    public TextField txtNombre;



    private HeroesService heroesService;

    public HeroesController(){
        this.heroesService = new HeroesService();
    }

    public void HandleCrear(MouseEvent mouseEvent) {
    }




}
