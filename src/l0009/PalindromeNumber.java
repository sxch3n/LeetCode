package l0009;

/**
 * In this case, I assume the negative numbers are not palindromic
 */
public class PalindromeNumber {
    public static boolean solution(int x){
        int temp=0,num=x;
        while (num!=0){
            temp = temp*10+num%10;
            num/=10;
        }
        return temp == x;
    }
    public static void main(String args[]){
        System.out.println(solution(1001));
    }
}

/*
# My Python Solution:

class Solution:
        def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        reverse = 0
        number = x
        while(x>0):
        reverse = reverse*10 + x%10
        x=x//10
        if reverse == number:
        return True
        else:
        return False
*/
