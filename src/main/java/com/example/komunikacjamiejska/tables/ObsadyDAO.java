package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ObsadyDAO {
    private final JdbcTemplate jdbcTemplate;

    public ObsadyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Obsady> list(){
        String sql = "SELECT * FROM OBSADY";
        List<Obsady> listObsady = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Obsady.class));
        return listObsady;
    }
}
