package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DlugoterminoweDAO {
    private final JdbcTemplate jdbcTemplate;

    public DlugoterminoweDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Dlugoterminowe> list(){
        String sql = "SELECT * FROM DLUGOTERMINOWE";
        List<Dlugoterminowe> listDlugoterminowe = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Dlugoterminowe.class));
        return listDlugoterminowe;
    }
}
