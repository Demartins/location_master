package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void locationShouldHaveId() {
        Location location = new Location();
        location.setId(1L);
        assertEquals(1L, location.getId());
    }

    @Test
    void locationShouldHaveName() {
        Location location = new Location();
        location.setName("Test Location");
        assertEquals("Test Location", location.getName());
    }

    @Test
    void locationShouldHaveCountry() {
        Location location = new Location();
        Country country = new Country();
        location.setCountry(country);
        assertEquals(country, location.getCountry());
    }

    @Test
    void locationShouldHandleNullCountry() {
        Location location = new Location();
        location.setCountry(null);
        assertNull(location.getCountry());
    }

    @Test
    void locationShouldHaveLatitude() {
        Location location = new Location();
        location.setLatitude(new BigDecimal("12.345678"));
        assertEquals(new BigDecimal("12.345678"), location.getLatitude());
    }

    @Test
    void locationShouldHaveLongitude() {
        Location location = new Location();
        location.setLongitude(new BigDecimal("98.765432"));
        assertEquals(new BigDecimal("98.765432"), location.getLongitude());
    }

    @Test
    void locationShouldHaveValidFrom() {
        Location location = new Location();
        LocalDate validFrom = LocalDate.of(2023, 1, 1);
        location.setValidFrom(validFrom);
        assertEquals(validFrom, location.getValidFrom());
    }

    @Test
    void locationShouldHaveValidTo() {
        Location location = new Location();
        LocalDate validTo = LocalDate.of(2023, 12, 31);
        location.setValidTo(validTo);
        assertEquals(validTo, location.getValidTo());
    }

    @Test
    void locationShouldHaveAlternateCodes() {
        Location location = new Location();
        List<LocationAlternateCode> alternateCodes = new ArrayList<>();
        location.setAlternateCodes(alternateCodes);
        assertEquals(alternateCodes, location.getAlternateCodes());
    }

    @Test
    void locationShouldHandleNullAlternateCodes() {
        Location location = new Location();
        location.setAlternateCodes(null);
        assertNull(location.getAlternateCodes());
    }

    @Test
    void locationShouldHaveParents() {
        Location location = new Location();
        List<Parent> parents = new ArrayList<>();
        location.setParents(parents);
        assertEquals(parents, location.getParents());
    }

    @Test
    void locationShouldHandleNullParents() {
        Location location = new Location();
        location.setParents(null);
        assertNull(location.getParents());
    }

    @Test
    void locationShouldHaveBdas() {
        Location location = new Location();
        List<BdaLocation> bdas = new ArrayList<>();
        location.setBdas(bdas);
        assertEquals(bdas, location.getBdas());
    }

    @Test
    void locationShouldHandleNullBdas() {
        Location location = new Location();
        location.setBdas(null);
        assertNull(location.getBdas());
    }
}