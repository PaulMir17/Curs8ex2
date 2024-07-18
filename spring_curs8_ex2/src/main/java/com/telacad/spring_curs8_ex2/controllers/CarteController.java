package com.telacad.spring_curs8_ex2.controllers;

import com.telacad.spring_curs8_ex2.model.Carte;
import com.telacad.spring_curs8_ex2.sservices.CarteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carti")
public class CarteController {

    private CarteService carteService;

    public CarteController(CarteService carteService) {
        this.carteService = carteService;
    }

    @GetMapping("/add")
    public String add10Carti(){

        carteService.add10Carti();

        return "Inregistrare reusita";
    }

    @GetMapping("/get")
    public List<Carte> getCarti(){

        return carteService.getCarti();
    }

}
