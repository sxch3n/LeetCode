package l0006;
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

        P   A   H   N
        A P L S I I G
        Y   I   R
        And then read line by line: "PAHNAPLSIIGYIR"
        Write the code that will take a string and make this conversion given a number of rows:

        string convert(string text, int nRows);
        convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/
public class ZigZagConversation {
    public static String convert(String s, int numRows) {
        int gap = numRows /2;
        StringBuilder converted = new StringBuilder();


        return String.valueOf(converted);
    }
    public static void pop(){}
    private static void main(String args[]){
       String input = "PAYPALISHIRING";
       int numRows = 3;
       System.out.println(convert(input,numRows));

    }
}
