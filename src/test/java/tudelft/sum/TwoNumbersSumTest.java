package tudelft.sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class TwoNumbersSumTest {

    @Test
    public void Test1()
    {
        TwoNumbersSum Operation = new TwoNumbersSum();

        ArrayList Result = new ArrayList(3);
        ArrayList ResultExpected = new ArrayList(3);
        ArrayList ToBeSum = new ArrayList(3);
        ArrayList ToBeSum2 = new ArrayList(3);
        ToBeSum.add(2);
        ToBeSum.add(4);
        ToBeSum.add(3);

        ToBeSum2.add(5);
        ToBeSum2.add(6);
        ToBeSum2.add(4);

        ResultExpected.add(7);
        ResultExpected.add(0);
        ResultExpected.add(8);

        Result = Operation.addTwoNumbers(ToBeSum,ToBeSum2);
        Assertions.assertEquals(ResultExpected,Result);

    }

    @Test
    public void Test2()
    {
        TwoNumbersSum Operation = new TwoNumbersSum();

        ArrayList Result = new ArrayList(2);
        ArrayList ResultExpected = new ArrayList(2);
        ArrayList ToBeSum = new ArrayList(2);
        ArrayList ToBeSum2 = new ArrayList(2);
        ToBeSum.add(0);
        ToBeSum2.add(0);
        ResultExpected.add(0);

        Result = Operation.addTwoNumbers(ToBeSum,ToBeSum2);
        Assertions.assertEquals(ResultExpected,Result);

    }

    @Test
    public void Test3()
    {
        TwoNumbersSum Operation = new TwoNumbersSum();

        ArrayList Result = new ArrayList(7);
        ArrayList ResultExpected = new ArrayList(7);
        ArrayList ToBeSum = new ArrayList(7);
        ArrayList ToBeSum2 = new ArrayList(7);
        ToBeSum.add(9);
        ToBeSum.add(9);
        ToBeSum.add(9);
        ToBeSum.add(9);
        ToBeSum.add(9);
        ToBeSum.add(9);
        ToBeSum.add(9);


        ToBeSum2.add(9);
        ToBeSum2.add(9);
        ToBeSum2.add(9);
        ToBeSum2.add(9);

        ResultExpected.add(8);
        ResultExpected.add(9);
        ResultExpected.add(9);
        ResultExpected.add(9);
        ResultExpected.add(0);
        ResultExpected.add(0);
        ResultExpected.add(0);
        ResultExpected.add(1);

        Result = Operation.addTwoNumbers(ToBeSum,ToBeSum2);
        Assertions.assertEquals(ResultExpected,Result);

    }


}
