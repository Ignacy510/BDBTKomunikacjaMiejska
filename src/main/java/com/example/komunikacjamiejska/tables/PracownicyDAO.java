package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PracownicyDAO {
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public PracownicyDAO(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public List<Pracownicy> list(){
        String sql = "SELECT * FROM PRACOWNICY ORDER BY nr_pracownika";
        List<Pracownicy> listPracownicy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pracownicy.class));
        return listPracownicy;
    }

    public void save(Pracownicy pracownik) {
        String sql = "INSERT INTO PRACOWNICY (imie, nazwisko, pesel, plec, data_zatrudnienia, nr_telefonu, email, nr_jednostki, nr_adresu) " +
                "VALUES (:imie, :nazwisko, :pesel, :plec, :data_zatrudnienia, :nr_telefonu, :email, :nr_jednostki, :nr_adresu)";

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownik);
        namedParameterJdbcTemplate.update(sql, param);
    }

    public void update(Pracownicy pracownik){
        String sql = "UPDATE PRACOWNICY SET imie=:imie, nazwisko=:nazwisko, pesel=:pesel, " +
                "plec=:plec, data_zatrudnienia=:data_zatrudnienia, nr_telefonu=:nr_telefonu, " +
                "email=:email, nr_jednostki=:nr_jednostki, nr_adresu=:nr_adresu " +
                "WHERE nr_pracownika=:nr_pracownika";

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownik);
        namedParameterJdbcTemplate.update(sql, param);
    }

    public void delete(int id){
        String sql = "DELETE FROM PRACOWNICY WHERE NR_PRACOWNIKA = ?";
        jdbcTemplate.update(sql, id);
    }
}