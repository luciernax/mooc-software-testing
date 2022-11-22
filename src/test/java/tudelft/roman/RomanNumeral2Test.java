package tudelft.invoice.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral2;

public class RomanNumeral2Test {


    @Test
    public void singleNumber() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert2("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert2("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert2("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert2("XLIV");
        Assertions.assertEquals(44, result);
    }


    @Test
    public  void Verybignumber()
    {
      RomanNumeral2 roman2= new RomanNumeral2();
      int result = roman2.convert2("XXDCIII");
      Assertions.assertEquals(603,result);
    }

}
