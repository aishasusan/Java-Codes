import java.util.*;
public class Toggle {
    public static void main(String args[]) {

        String str = "ApPLless";
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i); //current character
            if(ch >='A' && ch <= 'Z') {
                res.append((char)(ch + 32));
            } else if(ch >='a' && ch<='z') {
                res.append((char)(ch - 32));
            } else {
                res.append(ch);
            }
        }

        String ans = res.toString();
        System.out.println("The string after toggling becomes: " + ans);
    }
}