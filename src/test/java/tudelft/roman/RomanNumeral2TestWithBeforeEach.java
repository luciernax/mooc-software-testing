package tudelft.invoice.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral2;

public class RomanNumeral2TestWithBeforeEach {

    private RomanNumeral2 roman2;

    @BeforeEach
    public void initialize() {
        this.roman2 = new RomanNumeral2();
    }

    @Test
    public void singleNumber() {
        int result = roman2.convert2("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman2.convert2("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman2.convert2("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman2.convert2("XLIV");
        Assertions.assertEquals(44, result);
    }
}
