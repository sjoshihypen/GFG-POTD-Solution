Compare Two Fractions

You are given a string str containing two fractions a/b and c/d, compare them and return the greater. If they are equal, then return "equal".
Note: The string str contains "a/b, c/d"(fractions are separated by comma(,) & space( )). 

Examples

Input: str = "5/6, 11/45"
Output: 5/6
Explanation: 5/6=0.8333 and 11/45=0.2444, So 5/6 is greater fraction.

Input: str = "8/1, 8/1"
Output: equal
Explanation: We can see that both the fractions are same, so we'll return a string "equal".

Input: str = "10/17, 9/10"
Output: 9/10
Explanation: 10/17 = 0.588 & 9/10 = 0.9, so the greater fraction is "9/10".

Expected Time Complexity: O(len|str|)
Expected Auxiliary Space: O(1)

Constraints:
0<=a,c<=10^3
1<=b,d<=10^3

Solution : 

class Solution {

    String compareFrac(String str) {
        // Code here
        // Split the input string by ", "
        String[] fractions = str.split(", ");
        // Split the first fraction by "/"
        String[] frac1 = fractions[0].split("/");
        int num1 = Integer.parseInt(frac1[0]);
        int den1 = Integer.parseInt(frac1[1]);
        double val1 = (double) num1 / den1;
        
        // Split the second fraction by "/"
        String[] frac2 = fractions[1].split("/");
        int num2 = Integer.parseInt(frac2[0]);
        int den2 = Integer.parseInt(frac2[1]);
        double val2 = (double) num2 / den2;
        
        // Compare the two fraction values
        if (val1 == val2) {
            return "equal";
        }
        if (val1 > val2) {
            return fractions[0];
        }
        return fractions[1];

    }
}

Solution Designed & Developed By Sushant Joshi In Java.