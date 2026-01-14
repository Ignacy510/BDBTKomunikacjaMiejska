package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BiletyDAO {
    private final JdbcTemplate jdbcTemplate;

    public BiletyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Bilety> list(){
        String sql = "SELECT * FROM BILETY";
        List<Bilety> listBilety = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Bilety.class));
        return listBilety;
    }
}
