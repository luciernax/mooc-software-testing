package tudelft.mirror;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MirrorTest {

    @Test
    public void Test1()
        {
            String result = new Mirror().mirrorEnds("abXYZba");
            Assertions.assertEquals("ab",result);
        }
    @Test
    public void Test2()
    {
        String result = new Mirror().mirrorEnds("abca");
        Assertions.assertEquals("a",result);
    }
    @Test
    public void Test3()
    {
        String result = new Mirror().mirrorEnds("aba");
        Assertions.assertEquals("aba",result);
    }

    @Test
    public void Test4()
    {
        String result = new Mirror().mirrorEnds("abc");
        Assertions.assertEquals("",result);
    }

    @Test
    public void Test5()
    {
        String result = new Mirror().mirrorEnds("");
        Assertions.assertEquals("",result);
    }

    @Test
    public void Test6()
    {
        String result = new Mirror().mirrorEnds("XYZ");
        Assertions.assertEquals("",result);
    }
    @Test
    public void Test7()
    {
        String result = new Mirror().mirrorEnds("Y");
        Assertions.assertEquals("Y",result);
    }

    @Test
    public void Test8()
    {
        String result = new Mirror().mirrorEnds("YYB");
        Assertions.assertEquals("",result);
    }

    @Test
    public void Test9()
    {
        String result = new Mirror().mirrorEnds("AAAA");
        Assertions.assertEquals("AAAA",result);
    }
}
