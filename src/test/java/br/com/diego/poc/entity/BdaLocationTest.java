package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BdaLocationTest {

    @Test
    void bdaLocationShouldHaveId() {
        BdaLocation bdaLocation = new BdaLocation();
        bdaLocation.setId(1L);
        assertEquals(1L, bdaLocation.getId());
    }

    @Test
    void bdaLocationShouldHaveName() {
        BdaLocation bdaLocation = new BdaLocation();
        bdaLocation.setName("Test Location");
        assertEquals("Test Location", bdaLocation.getName());
    }

    @Test
    void bdaLocationShouldHaveType() {
        BdaLocation bdaLocation = new BdaLocation();
        bdaLocation.setType("TypeA");
        assertEquals("TypeA", bdaLocation.getType());
    }

    @Test
    void bdaLocationShouldHaveBdaType() {
        BdaLocation bdaLocation = new BdaLocation();
        bdaLocation.setBdaType("BdaTypeA");
        assertEquals("BdaTypeA", bdaLocation.getBdaType());
    }

    @Test
    void bdaLocationShouldHaveLocation() {
        BdaLocation bdaLocation = new BdaLocation();
        Location location = new Location();
        bdaLocation.setLocation(location);
        assertEquals(location, bdaLocation.getLocation());
    }

    @Test
    void bdaLocationShouldHandleNullLocation() {
        BdaLocation bdaLocation = new BdaLocation();
        bdaLocation.setLocation(null);
        assertNull(bdaLocation.getLocation());
    }

    @Test
    void bdaLocationShouldHaveAlternateCodes() {
        BdaLocation bdaLocation = new BdaLocation();
        List<BdaLocationAlternateCode> alternateCodes = new ArrayList<>();
        bdaLocation.setAlternateCodes(alternateCodes);
        assertEquals(alternateCodes, bdaLocation.getAlternateCodes());
    }

    @Test
    void bdaLocationShouldHandleNullAlternateCodes() {
        BdaLocation bdaLocation = new BdaLocation();
        bdaLocation.setAlternateCodes(null);
        assertNull(bdaLocation.getAlternateCodes());
    }
}