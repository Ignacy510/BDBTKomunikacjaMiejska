package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Jednostki_KomunikacjiDAO {
    private final JdbcTemplate jdbcTemplate;

    public Jednostki_KomunikacjiDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Jednostki_Komunikacji> list(){
        String sql = "SELECT * FROM JEDNOSTKI_KOMUNIKACJI";
        List<Jednostki_Komunikacji> listJednostki_Komunikacji = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Jednostki_Komunikacji.class));
        return listJednostki_Komunikacji;
    }
}
