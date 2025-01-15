package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BdaLocationAlternateCodeTest {

    @Test
    void bdaLocationAlternateCodeShouldHaveId() {
        BdaLocationAlternateCode bdaLocationAlternateCode = new BdaLocationAlternateCode();
        bdaLocationAlternateCode.setId(1L);
        assertEquals(1L, bdaLocationAlternateCode.getId());
    }

    @Test
    void bdaLocationAlternateCodeShouldHaveCode() {
        BdaLocationAlternateCode bdaLocationAlternateCode = new BdaLocationAlternateCode();
        bdaLocationAlternateCode.setCode("ABC123");
        assertEquals("ABC123", bdaLocationAlternateCode.getCode());
    }

    @Test
    void bdaLocationAlternateCodeShouldHaveCodeType() {
        BdaLocationAlternateCode bdaLocationAlternateCode = new BdaLocationAlternateCode();
        bdaLocationAlternateCode.setCodeType("TypeA");
        assertEquals("TypeA", bdaLocationAlternateCode.getCodeType());
    }

    @Test
    void bdaLocationAlternateCodeShouldHaveBdaLocation() {
        BdaLocationAlternateCode bdaLocationAlternateCode = new BdaLocationAlternateCode();
        BdaLocation bdaLocation = new BdaLocation();
        bdaLocationAlternateCode.setBdaLocation(bdaLocation);
        assertEquals(bdaLocation, bdaLocationAlternateCode.getBdaLocation());
    }

    @Test
    void bdaLocationAlternateCodeShouldHandleNullBdaLocation() {
        BdaLocationAlternateCode bdaLocationAlternateCode = new BdaLocationAlternateCode();
        bdaLocationAlternateCode.setBdaLocation(null);
        assertNull(bdaLocationAlternateCode.getBdaLocation());
    }
}