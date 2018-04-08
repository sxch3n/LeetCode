package l0007;

//Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output:  321
//
//        Example 2:
//
//        Input: -123
//        Output: -321
//
//        Example 3:
//
//        Input: 120
//        Output: 21
//
//        Note:
//        Assume we are dealing with an environment which could
//        only hold integers within the 32-bit signed integer range.
//        For the purpose of this problem,
//        assume that your function returns 0 when the reversed integer overflows.

public class ReverseInteger {
    public static int reverse(int x){
        int reversed_x=0;
        char[] num;
        boolean isNegetive=false;

        if(x> Integer.MIN_VALUE && x<Integer.MAX_VALUE){
            if(x>0) {
                num = String.valueOf(x).toCharArray();
            }else{
                num = String.valueOf(-x).toCharArray();
                isNegetive = true;
            }
            StringBuilder temp = new StringBuilder();
            for (int i = 0;i<num.length;i++) {
                temp.append(num[num.length - i - 1]);
            }
            try {
                reversed_x = Integer.valueOf(temp.toString());
            }catch (java.lang.NumberFormatException e){
                return 0;
            }
            if(isNegetive){
                reversed_x=-reversed_x;
            }
        }


        return reversed_x;
    }
    public static void main(String args[]){
        int i = Integer.MIN_VALUE+7;
        String num = String.valueOf(-i);
        System.out.println(Integer.MIN_VALUE +" "+Integer.MAX_VALUE);
        System.out.println(i);
        System.out.println(-i);
        System.out.println(ReverseInteger.reverse(i));

    }
}
