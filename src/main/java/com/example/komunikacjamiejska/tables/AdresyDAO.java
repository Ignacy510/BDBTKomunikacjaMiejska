package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdresyDAO {
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public AdresyDAO(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public List<Adresy> list(){
        String sql = "SELECT * FROM ADRESY ORDER BY nr_adresu";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Adresy.class));
    }

    public void save(Adresy adres) {
        String sql = "INSERT INTO ADRESY (miasto, ulica, nr_domu, nr_lokalu, kod_pocztowy) " +
                "VALUES (:miasto, :ulica, :nr_domu, :nr_lokalu, :kod_pocztowy)";

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adres);
        namedParameterJdbcTemplate.update(sql, param);
    }

    public int getLastId() {
        String sql = "SELECT MAX(nr_adresu) FROM ADRESY";
        Integer id = jdbcTemplate.queryForObject(sql, Integer.class);
        return id != null ? id : 0;
    }
}