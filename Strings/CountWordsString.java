package Strings;
public class CountWordsString{
    public static void main(String[] args) {
        String s = "asfasf";
        countWords(s);
    }
    static void countWords(String str1){
        if (str1.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        int count = 0;
        boolean check = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ' && check == false ) {
                count++;
                check = true;
            }
            else if(str1.charAt(i) == ' ' && check ==true){
                check = false;
            }
        }
        System.out.println(count);
    }
}