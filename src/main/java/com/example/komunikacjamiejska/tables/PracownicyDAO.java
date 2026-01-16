package com.example.komunikacjamiejska.tables;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PracownicyDAO {
    private final JdbcTemplate jdbcTemplate;

    public PracownicyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Pracownicy> list(){
        String sql = "SELECT * FROM PRACOWNICY";
        List<Pracownicy> listPracownicy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pracownicy.class));
        return listPracownicy;
    }

    public void save(Pracownicy pracownicy){
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("pracownicy").usingColumns("imie","nazwisko","pesel","plec","data_zatrudnienia","nr_telefonu","email","nr_jednostki","nr_adresu");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownicy);
        insertActor.execute(param);
    }

    public void update(Pracownicy pracownicy){
        String sql = "UPDATE SALES SET imie = " + pracownicy.getImie() + ", nazwisko = " + pracownicy.getNazwisko()
                + ", pesel = " + pracownicy.getPesel()
                + ", plec = " + pracownicy.getPlec()
                + ", data_zatrudnienia = " + pracownicy.getData_zatrudnienia()
                + ", nr_telefonu = " + pracownicy.getNr_telefonu()
                + ", email = " + pracownicy.getEmail()
                + ", nr_jednostki = " + pracownicy.getNr_jednostki()
                + ", nr_adresu = " + pracownicy.getNr_adresu()
                + " where nr_pracownika = " + pracownicy.getNr_pracownika();
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownicy);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
        template.update(sql, param);
    }

    public void delete(int id){
        String sql = "DELETE FROM PRACOWNICY WHERE NR_PRACOWNIKA = ?";
        jdbcTemplate.update(sql, id);
    }
}
