import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String item = in.nextLine();
        int i = 1;
        System.out.println(i + " " + item);
        while (in.hasNext() == true){
            String next = in.nextLine();
            i+=1;
            System.out.println(i + " " + next);
        }
    }
}
