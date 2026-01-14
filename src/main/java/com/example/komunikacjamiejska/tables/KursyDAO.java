package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KursyDAO {
    private final JdbcTemplate jdbcTemplate;

    public KursyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Kursy> list(){
        String sql = "SELECT * FROM KURSY";
        List<Kursy> listKursy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Kursy.class));
        return listKursy;
    }
}
