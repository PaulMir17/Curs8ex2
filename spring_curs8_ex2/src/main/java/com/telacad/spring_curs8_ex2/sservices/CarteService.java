package com.telacad.spring_curs8_ex2.sservices;

import com.telacad.spring_curs8_ex2.model.Carte;
import com.telacad.spring_curs8_ex2.repositories.CarteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarteService {

    private final CarteRepository carteRepository;
    private List<Carte> cartiList=new ArrayList<>();

    public CarteService(CarteRepository carteRepository) {
        this.carteRepository = carteRepository;
        cartiList.add(new Carte("carte1", 10));
        cartiList.add(new Carte("carte2", 20));
        cartiList.add(new Carte("carte3", 30));
        cartiList.add(new Carte("carte4", 40));
        cartiList.add(new Carte("carte5", 50));
    }

    public int addCarte(Carte carte){

        return carteRepository.addCarte(carte);
    }

    @Transactional
    public void add10Carti(){

        for(int i=0; i<=cartiList.size();i++){

            if(i==3){
                throw new RuntimeException("crash test");
            }
            carteRepository.addCarte(cartiList.get(i));
        }
    }

    public List<Carte> getCarti(){

        return carteRepository.getCarti();
    }
}
