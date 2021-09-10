package com.auto.bdd.utils;

import java.util.Objects;

public class Verify {

    static public void isTrue(boolean value) {
        assertEquals(true, value);
    }

    static public void assertEquals(Object expectedResult, Object actualResult) {
        Objects.equals(expectedResult, actualResult);
    }
}
