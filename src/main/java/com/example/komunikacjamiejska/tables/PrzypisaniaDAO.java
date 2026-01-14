package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrzypisaniaDAO {
    private final JdbcTemplate jdbcTemplate;

    public PrzypisaniaDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Przypisania> list(){
        String sql = "SELECT * FROM PRZYPISANIA";
        List<Przypisania> listPrzypisania = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Przypisania.class));
        return listPrzypisania;
    }
}
