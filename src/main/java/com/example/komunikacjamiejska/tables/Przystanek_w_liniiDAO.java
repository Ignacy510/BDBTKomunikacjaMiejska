package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Przystanek_w_liniiDAO {
    private final JdbcTemplate jdbcTemplate;

    public Przystanek_w_liniiDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Przystanek_w_linii> list(){
        String sql = "SELECT * FROM PRZYSTANEK_W_LINII";
        List<Przystanek_w_linii> listPrzystanek_w_linii = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Przystanek_w_linii.class));
        return listPrzystanek_w_linii;
    }
}
