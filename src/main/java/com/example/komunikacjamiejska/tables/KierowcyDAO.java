package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KierowcyDAO {
    private final JdbcTemplate jdbcTemplate;

    public KierowcyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Kierowcy> list(){
        String sql = "SELECT * FROM KIEROWCY";
        List<Kierowcy> listKierowcy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Kierowcy.class));
        return listKierowcy;
    }
}
