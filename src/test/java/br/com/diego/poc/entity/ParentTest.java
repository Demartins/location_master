package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParentTest {

    @Test
    void parentShouldHaveId() {
        Parent parent = new Parent();
        parent.setId(1L);
        assertEquals(1L, parent.getId());
    }

    @Test
    void parentShouldHaveName() {
        Parent parent = new Parent();
        parent.setName("Parent Name");
        assertEquals("Parent Name", parent.getName());
    }

    @Test
    void parentShouldHaveType() {
        Parent parent = new Parent();
        parent.setType("TypeA");
        assertEquals("TypeA", parent.getType());
    }

    @Test
    void parentShouldHaveBdaType() {
        Parent parent = new Parent();
        parent.setBdaType("BdaTypeA");
        assertEquals("BdaTypeA", parent.getBdaType());
    }

    @Test
    void parentShouldHaveLocation() {
        Parent parent = new Parent();
        Location location = new Location();
        parent.setLocation(location);
        assertEquals(location, parent.getLocation());
    }

    @Test
    void parentShouldHandleNullLocation() {
        Parent parent = new Parent();
        parent.setLocation(null);
        assertNull(parent.getLocation());
    }

    @Test
    void parentShouldHaveAlternateCodes() {
        Parent parent = new Parent();
        List<AlternateCode> alternateCodes = new ArrayList<>();
        parent.setAlternateCodes(alternateCodes);
        assertEquals(alternateCodes, parent.getAlternateCodes());
    }

    @Test
    void parentShouldHandleNullAlternateCodes() {
        Parent parent = new Parent();
        parent.setAlternateCodes(null);
        assertNull(parent.getAlternateCodes());
    }
}