package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ModeleDAO {
    private final JdbcTemplate jdbcTemplate;

    public ModeleDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Modele> list(){
        String sql = "SELECT * FROM MODELE";
        List<Modele> listModele = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Modele.class));
        return listModele;
    }
}
