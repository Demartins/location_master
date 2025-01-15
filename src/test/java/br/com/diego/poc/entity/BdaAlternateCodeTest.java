package br.com.diego.poc.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BdaAlternateCodeTest {

    @Test
    void bdaAlternateCodeShouldHaveId() {
        BdaAlternateCode bdaAlternateCode = new BdaAlternateCode();
        bdaAlternateCode.setId(1L);
        assertEquals(1L, bdaAlternateCode.getId());
    }

    @Test
    void bdaAlternateCodeShouldHaveCode() {
        BdaAlternateCode bdaAlternateCode = new BdaAlternateCode();
        bdaAlternateCode.setCode("ABC123");
        assertEquals("ABC123", bdaAlternateCode.getCode());
    }

    @Test
    void bdaAlternateCodeShouldHaveCodeType() {
        BdaAlternateCode bdaAlternateCode = new BdaAlternateCode();
        bdaAlternateCode.setCodeType("TypeA");
        assertEquals("TypeA", bdaAlternateCode.getCodeType());
    }

    @Test
    void bdaAlternateCodeShouldHaveBdaLocation() {
        BdaAlternateCode bdaAlternateCode = new BdaAlternateCode();
        BdaLocation bdaLocation = new BdaLocation();
        bdaAlternateCode.setBdaLocation(bdaLocation);
        assertEquals(bdaLocation, bdaAlternateCode.getBdaLocation());
    }

    @Test
    void bdaAlternateCodeShouldHandleNullBdaLocation() {
        BdaAlternateCode bdaAlternateCode = new BdaAlternateCode();
        bdaAlternateCode.setBdaLocation(null);
        assertNull(bdaAlternateCode.getBdaLocation());
    }
}