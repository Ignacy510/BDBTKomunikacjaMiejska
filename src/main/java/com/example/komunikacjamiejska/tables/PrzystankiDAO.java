package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrzystankiDAO {
    private final JdbcTemplate jdbcTemplate;

    public PrzystankiDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Przystanki> list(){
        String sql = "SELECT * FROM PRZYSTANKI";
        List<Przystanki> listPrzystanki = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Przystanki.class));
        return listPrzystanki;
    }
}
