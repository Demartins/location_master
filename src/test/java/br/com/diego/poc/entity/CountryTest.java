package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    @Test
    void countryShouldHaveId() {
        Country country = new Country();
        country.setId(1L);
        assertEquals(1L, country.getId());
    }

    @Test
    void countryShouldHaveName() {
        Country country = new Country();
        country.setName("Brazil");
        assertEquals("Brazil", country.getName());
    }

    @Test
    void countryShouldHaveAlternateCodes() {
        Country country = new Country();
        List<CountryAlternateCode> alternateCodes = new ArrayList<>();
        country.setAlternateCodes(alternateCodes);
        assertEquals(alternateCodes, country.getAlternateCodes());
    }

    @Test
    void countryShouldHandleNullAlternateCodes() {
        Country country = new Country();
        country.setAlternateCodes(null);
        assertNull(country.getAlternateCodes());
    }
}