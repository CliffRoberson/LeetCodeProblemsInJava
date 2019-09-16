package ImplementStrstr;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        else if (needle.length() > haystack.length())
            return -1;
        else
        {
            for (int i =0;i<haystack.length()-needle.length()+1;i++)
            {
                int count =0;
                for (int j =0;j<needle.length();j++)
                {
                    if (haystack.charAt(i+j) == needle.charAt(j))
                    {
                        count++;
                    }
                    
                    if (count == needle.length())
                        return i;
                }
            }
            return -1;
        }
    }


    public static void main(String[] args) {
        int val = new Solution().strStr("mississippi","issipi");
        System.out.println(val);
    }
}