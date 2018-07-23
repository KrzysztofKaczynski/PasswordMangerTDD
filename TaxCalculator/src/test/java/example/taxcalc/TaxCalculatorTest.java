package example.taxcalc;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxCalculatorTest {

    @Test
    public void shouldBeTaxFree() {
        TaxCalculator calc = new TaxCalculator();
        double tax = calc.calculateTax(3091d);
        assertEquals(0d, tax, 0.000001);
    }
        @Test
    public void shouldBeHighTax() {
        TaxCalculator calc = new TaxCalculator();
        double tax = calc.calculateTax(100000d);
        assertEquals(19470.06d, tax, 0.000001);
    }

}
