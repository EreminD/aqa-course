package ru.inno.course.currency_converter.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.inno.course.currency_converter.Converter;

import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConverterTest {

    private Converter converter;

    @BeforeEach
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void shouldConvert() {
        double amountToBe = 269_403.7;
        double amountAsIs = converter.convert(10, "BTC", "USD");
        assertEquals(amountToBe, amountAsIs);
    }

    @Test
    public void shouldConvertBackward() {
        double amountToBe = 1;
        double amountAsIs = converter.convert(269_40.37, "USD", "BTC");
        assertEquals(amountToBe, amountAsIs);
    }

    @Test
    public void shouldConvertDifferentCurrencies() {
        double amountToBe = 0.6231;
        double amountAsIs = converter.convert(10, "DOGE", "USD");
        assertEquals(amountToBe, amountAsIs);
    }

    @Test
    public void ConvertDifferentCurrencies() {
        double amountToBe = 826.4;
        double amountAsIs = converter.convert(20, "XRP", "RUR");
        assertEquals(amountToBe, amountAsIs);
    }

    @Test
    public void shouldConvertNonIntegerValueOfCurrencies() {
        double amountToBe = 182_261.82499999998;
        double amountAsIs = converter.convert(1.25, "ETH", "RUR");
        assertEquals(amountToBe, amountAsIs);
    }

    @Test
    public void converterAssertNotNull() {
        double amountToBe = 1;
        assertNotNull(amountToBe);
    }
}