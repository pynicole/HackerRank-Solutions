import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = new StringBuffer(a).reverse().toString();
        if(a.compareTo(b) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
