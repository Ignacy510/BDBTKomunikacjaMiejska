package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AutobusyDAO {
    private final JdbcTemplate jdbcTemplate;

    public AutobusyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Autobusy> list(){
        String sql = "SELECT * FROM AUTOBUSY";
        List<Autobusy> listAutobusy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Autobusy.class));
        return listAutobusy;
    }
}
