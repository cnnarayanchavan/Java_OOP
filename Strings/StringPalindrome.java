package Strings;

public class StringPalindrome {
    public static void main(String[]args){
        String str1 = "Nitin";
        String original = str1.toLowerCase();
        StringBuffer sb = new StringBuffer(original);
        String reverse = sb.reverse().toString();
        String result = (original.equals(reverse))?"is is palindrome":"it is not palindrome";
        System.out.println(result);
        
    }
}
