/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntToRoman;

import java.util.ArrayList;

/**
 *
 * @author clifford.k.roberson
 */
public class Solution {
    public String intToRoman(int num) {
        String output = "";
        // digits stored smallest to largest 
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int base = 1;
        while (num > 0)
        {
            Integer curDigit = (num % 10);// * base;
            digits.add(curDigit);
            num = num / 10;
            //base = base * 10;
        }
        
        for (int i = digits.size()-1; i>=0; i--)
        {
            int curDigit = digits.get(i);
            if (i == 3) //thousands
            {
                if (curDigit == 3)
                    output += "MMM";
                else if (curDigit == 2)
                    output += "MM";
                else
                    output += "M";
            }
            else if (i == 2) //hundreds
            {
                if (curDigit == 9)
                    output += "CM";
                else if (curDigit == 8)
                    output += "DCCC";
                else if (curDigit == 7)
                    output += "DCC";
                else if (curDigit == 6)
                    output += "DC";
                else if (curDigit == 5)
                    output += "D";
                else if (curDigit == 4)
                    output += "CD";
                else
                {
                    for (int j = 0; j< curDigit;j++)
                        output += "C";
                }
            }
            else if (i == 1) //tens
            {
                if (curDigit == 9)
                    output += "XC";
                else if (curDigit == 8)
                    output += "LXXX";
                else if (curDigit == 7)
                    output += "LXX";
                else if (curDigit == 6)
                    output += "LX";
                else if (curDigit == 5)
                    output += "L";
                else if (curDigit == 4)
                    output += "XL";
                else
                {
                    for (int j = 0; j< curDigit;j++)
                        output += "X";
                }
            }
            else //ones
            {
                if (curDigit == 9)
                    output += "IX";
                else if (curDigit == 8)
                    output += "VIII";
                else if (curDigit == 7)
                    output += "VII";
                else if (curDigit == 6)
                    output += "VI";               
                else if (curDigit == 5)
                    output += "V";
                else if (curDigit == 4)
                    output += "IV";
                else
                {
                    for (int j = 0; j< curDigit;j++)
                        output += "I";
                }
            }
        }
        
        return output;
    }
    
    public static void main(String[] args) {
        String val = new Solution().intToRoman(9);
        System.out.println(val);
    }
}
