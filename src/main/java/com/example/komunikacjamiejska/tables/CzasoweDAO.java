package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CzasoweDAO {
    private final JdbcTemplate jdbcTemplate;

    public CzasoweDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Czasowe> list(){
        String sql = "SELECT * FROM CZASOWE";
        List<Czasowe> listCzasowe = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Czasowe.class));
        return listCzasowe;
    }
}
