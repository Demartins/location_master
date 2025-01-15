package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryAlternateCodeTest {

    @Test
    void countryAlternateCodeShouldHaveId() {
        CountryAlternateCode countryAlternateCode = new CountryAlternateCode();
        countryAlternateCode.setId(1L);
        assertEquals(1L, countryAlternateCode.getId());
    }

    @Test
    void countryAlternateCodeShouldHaveCode() {
        CountryAlternateCode countryAlternateCode = new CountryAlternateCode();
        countryAlternateCode.setCode("ABC123");
        assertEquals("ABC123", countryAlternateCode.getCode());
    }

    @Test
    void countryAlternateCodeShouldHaveCodeType() {
        CountryAlternateCode countryAlternateCode = new CountryAlternateCode();
        countryAlternateCode.setCodeType("TypeA");
        assertEquals("TypeA", countryAlternateCode.getCodeType());
    }

    @Test
    void countryAlternateCodeShouldHaveCountry() {
        CountryAlternateCode countryAlternateCode = new CountryAlternateCode();
        Country country = new Country();
        countryAlternateCode.setCountry(country);
        assertEquals(country, countryAlternateCode.getCountry());
    }

    @Test
    void countryAlternateCodeShouldHandleNullCountry() {
        CountryAlternateCode countryAlternateCode = new CountryAlternateCode();
        countryAlternateCode.setCountry(null);
        assertNull(countryAlternateCode.getCountry());
    }
}