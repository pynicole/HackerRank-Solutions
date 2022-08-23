import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i=0; i<n; i++){
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        
    }
}
