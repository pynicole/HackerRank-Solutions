import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numOfPairs = in.nextInt();
        in.nextLine();
        
        Set<String> namePairSet = new HashSet<String>();
        
        while(in.hasNext()) {
            String namePair = in.nextLine();
            if(namePairSet.contains(namePair)) {
                System.out.println(namePairSet.size());
                continue;
            } else {
                namePairSet.add(namePair);
                System.out.println(namePairSet.size());
                
            }
            
            
        }
    }
}
