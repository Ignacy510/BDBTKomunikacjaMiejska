package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MarkiDAO {
    private final JdbcTemplate jdbcTemplate;

    public MarkiDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Marki> list(){
        String sql = "SELECT * FROM MARKI";
        List<Marki> listMarki = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Marki.class));
        return listMarki;
    }
}
