package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LinieDAO {
    private final JdbcTemplate jdbcTemplate;

    public LinieDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Linie> list(){
        String sql = "SELECT * FROM LINIE";
        List<Linie> listLinie = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Linie.class));
        return listLinie;
    }
}
