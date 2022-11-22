package tudelft.roman;
/*
i is 1,
v is 5,
x is 10,
l is 50,
c is 100,
d is 500,
m is 1000.
*/

public class RomanNumeral2
{
public int convert2(String romanNumeral)
{
    int dec_num=0;
    int count =0;
    int current_val=0;
    int previous_val=0;

    System.out.println("Roman Number:"+romanNumeral);
    System.out.println("LENG:"+romanNumeral.length());

    for(count=1; count< romanNumeral.length()+1; count++)
    {
        System.out.println("Roman LETTER:"+romanNumeral.charAt(romanNumeral.length()-count));
        if (romanNumeral.charAt(romanNumeral.length()-count)=='I') {current_val=1;}
        if (romanNumeral.charAt(romanNumeral.length()-count)=='V') {current_val=5;}
        if (romanNumeral.charAt(romanNumeral.length()-count)=='X') {current_val=10;}
        if (romanNumeral.charAt(romanNumeral.length()-count)=='L') {current_val=50;}
        if (romanNumeral.charAt(romanNumeral.length()-count)=='C') {current_val=100;}
        if (romanNumeral.charAt(romanNumeral.length()-count)=='D') {current_val=500;}
        if (romanNumeral.charAt(romanNumeral.length()-count)=='M') {current_val=1000;}

        if (current_val >= previous_val) dec_num+=current_val;
        else dec_num-=current_val;

        previous_val=current_val;
    }
    return dec_num;
}
}