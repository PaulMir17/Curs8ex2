package com.telacad.spring_curs8_ex2.repositories;

import com.telacad.spring_curs8_ex2.model.Carte;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CarteRepository {

    private final JdbcTemplate jdbcTemplate;


    public CarteRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public int addCarte(Carte carte){

        return jdbcTemplate.update("INSERT INTO CARTI(denumire,pret) VALUES(?,?)", carte.getDenumire(),carte.getPret());

    }

    public List<Carte> getCarti(){

       return jdbcTemplate.query("SELECT * from CARTI",
                (rs,i) -> {
            Carte carte=new Carte();
            carte.setDenumire(rs.getString(1));
            carte.setPret((int) rs.getDouble(1));
            return carte;
                }

                );
    }


}
