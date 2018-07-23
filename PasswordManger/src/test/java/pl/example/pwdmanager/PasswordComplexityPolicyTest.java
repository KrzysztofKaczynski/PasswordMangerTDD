package pl.example.pwdmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordComplexityPolicyTest {

    private static final String CORRECT_PASSWORD = "qwert123";
    private static final String CORRECT_PASSWORD_DIGITS_FIRST = "123zxcvb";

    @Test
    public void shouldBeCorrectForVerifyOnPasswordWith3Digits() {
        PasswordComplexityPolicy policyUnderTest = new PasswordComplexityPolicy();
        boolean result = policyUnderTest.verify(CORRECT_PASSWORD);
        assertTrue("wynik dla qwert123", result);
    }
    @Test
    public void shouldBeCorrectForVerifyOnPasswordWith3DigitsOnBegining() {
        PasswordComplexityPolicy policyUnderTest = new PasswordComplexityPolicy();
        boolean result = policyUnderTest.verify(CORRECT_PASSWORD_DIGITS_FIRST);
        assertTrue("wynik dla 123zxcvb", result);
    }
}