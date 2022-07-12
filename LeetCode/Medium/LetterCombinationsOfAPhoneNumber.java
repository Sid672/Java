// Q:letter-combinations-of-a-phone-number (Leetcode)
// A:
//Username: parth-gpt
import java.util.*;
class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if(digits.isEmpty())
        {
            return ans;
        }
        ans = padRet("", digits);
        return ans;

    }

    public ArrayList<String> padRet(String p, String up)
    {
        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // convert to int
        ArrayList<String> ans = new ArrayList<>();
        if(digit == 7)
        {
            for(int i=(digit-1)*3;i<=digit*3;i++)
            {
                char ch = (char) ('a' + i - 3);
                ans.addAll(padRet(p + ch, up.substring(1)));
            }
        }
        else if(digit==8)
        {
            for(int i=(digit-1)*3;i<digit*3;i++)
            {
                char ch = (char) ('a' + i - 2);
                ans.addAll(padRet(p + ch, up.substring(1)));
            }
        }
        else if(digit==9)
        {
            for(int i=(digit-1)*3;i<=digit*3;i++)
            {
                char ch = (char) ('a' + i - 2);
                ans.addAll(padRet(p + ch, up.substring(1)));
            }
        }
        else{
            for(int i=(digit-1)*3;i<digit*3;i++)
            {
                char ch = (char) ('a' + i - 3);
                ans.addAll(padRet(p + ch, up.substring(1)));
            }


        }
        return ans;
    }
}
