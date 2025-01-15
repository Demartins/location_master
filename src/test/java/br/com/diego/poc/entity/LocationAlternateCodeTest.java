package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationAlternateCodeTest {

    @Test
    void locationAlternateCodeShouldHaveId() {
        LocationAlternateCode locationAlternateCode = new LocationAlternateCode();
        locationAlternateCode.setId(1L);
        assertEquals(1L, locationAlternateCode.getId());
    }

    @Test
    void locationAlternateCodeShouldHaveCode() {
        LocationAlternateCode locationAlternateCode = new LocationAlternateCode();
        locationAlternateCode.setCode("ABC123");
        assertEquals("ABC123", locationAlternateCode.getCode());
    }

    @Test
    void locationAlternateCodeShouldHaveCodeType() {
        LocationAlternateCode locationAlternateCode = new LocationAlternateCode();
        locationAlternateCode.setCodeType("TypeA");
        assertEquals("TypeA", locationAlternateCode.getCodeType());
    }

    @Test
    void locationAlternateCodeShouldHaveLocation() {
        LocationAlternateCode locationAlternateCode = new LocationAlternateCode();
        Location location = new Location();
        locationAlternateCode.setLocation(location);
        assertEquals(location, locationAlternateCode.getLocation());
    }

    @Test
    void locationAlternateCodeShouldHandleNullLocation() {
        LocationAlternateCode locationAlternateCode = new LocationAlternateCode();
        locationAlternateCode.setLocation(null);
        assertNull(locationAlternateCode.getLocation());
    }
}