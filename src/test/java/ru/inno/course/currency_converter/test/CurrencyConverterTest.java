package ru.inno.course.currency_converter.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.inno.course.currency_converter.Converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}