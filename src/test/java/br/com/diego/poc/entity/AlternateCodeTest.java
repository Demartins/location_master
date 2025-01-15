package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternateCodeTest {

    @Test
    void alternateCodeShouldHaveId() {
        AlternateCode alternateCode = new AlternateCode();
        alternateCode.setId(1L);
        assertEquals(1L, alternateCode.getId());
    }

    @Test
    void alternateCodeShouldHaveCode() {
        AlternateCode alternateCode = new AlternateCode();
        alternateCode.setCode("ABC123");
        assertEquals("ABC123", alternateCode.getCode());
    }

    @Test
    void alternateCodeShouldHaveCodeType() {
        AlternateCode alternateCode = new AlternateCode();
        alternateCode.setCodeType("TypeA");
        assertEquals("TypeA", alternateCode.getCodeType());
    }

    @Test
    void alternateCodeShouldHaveParent() {
        AlternateCode alternateCode = new AlternateCode();
        Parent parent = new Parent();
        alternateCode.setParent(parent);
        assertEquals(parent, alternateCode.getParent());
    }

    @Test
    void alternateCodeShouldHandleNullParent() {
        AlternateCode alternateCode = new AlternateCode();
        alternateCode.setParent(null);
        assertNull(alternateCode.getParent());
    }
}