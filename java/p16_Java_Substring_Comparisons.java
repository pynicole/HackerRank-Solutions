import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
    
        List<String> sList = new ArrayList<String>();
        int i = 0;
        while(k<=s.length()) {
            sList.add(s.substring(i,k));
            i+=1;
            k+=1;
        }
        Collections.sort(sList);
        System.out.println(sList.get(0) + "\n" + sList.get(sList.size()-1));
        
        
        
    }
}
