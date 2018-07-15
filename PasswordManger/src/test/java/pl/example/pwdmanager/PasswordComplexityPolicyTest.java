package pl.example.pwdmanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordComplexityPolicyTest {

    @Test
    public void testverify() {
        PasswordComplexityPolicy policyUnderTest = new PasswordComplexityPolicy();
        boolean result = policyUnderTest.verify("qwert123");
        assertTrue("wynik dla qwert123", result);
    }
    @Test
    public void testverify2() {
        PasswordComplexityPolicy policyUnderTest = new PasswordComplexityPolicy();
        boolean result = policyUnderTest.verify("123zxcvb");
        assertTrue("wynik dla 123zxcvb", result);
    }
}