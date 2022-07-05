import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.trim();
        if(s.length()==0 || s.length()>400000) {
            System.out.println(0);
        } else {
            String[] wordArray = s.split("[\\s,?'!_.@]+");
            List<String> wordList = Arrays.asList(wordArray);
            System.out.println(wordArray.length);
            wordList.forEach(System.out::println);
        }
        
        
        
    }
}
