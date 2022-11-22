package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.mirror.Mirror;

public class GHappyTest {

    @Test
    public void Test1()
    {
        Boolean result = new GHappy().gHappy("xxggxx");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void Test2()
    {
        Boolean result = new GHappy().gHappy("xxgxx");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void Test3()
    {
        Boolean result = new GHappy().gHappy("xxggyygxx");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void Test4()
    {
        Boolean result = new GHappy().gHappy("gxggyygxx");
        Assertions.assertEquals(false,result);
    }


}
