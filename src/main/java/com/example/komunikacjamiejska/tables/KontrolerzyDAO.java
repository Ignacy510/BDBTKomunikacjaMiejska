package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KontrolerzyDAO {
    private final JdbcTemplate jdbcTemplate;

    public KontrolerzyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Kontrolerzy> list(){
        String sql = "SELECT * FROM KONTROLERZY";
        List<Kontrolerzy> listKontrolerzy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Kontrolerzy.class));
        return listKontrolerzy;
    }
}
