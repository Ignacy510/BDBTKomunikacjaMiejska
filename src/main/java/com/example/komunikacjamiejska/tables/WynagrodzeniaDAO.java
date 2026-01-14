package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WynagrodzeniaDAO {
    private final JdbcTemplate jdbcTemplate;

    public WynagrodzeniaDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Wynagrodzenia> list(){
        String sql = "SELECT * FROM WYNAGRODZENIA";
        List<Wynagrodzenia> listWynagrodzenia = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Wynagrodzenia.class));
        return listWynagrodzenia;
    }
}
