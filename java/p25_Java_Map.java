import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        while(n>0) {
            String name = in.nextLine();
            int number = in.nextInt();
            in.nextLine();
            phoneBook.put(name, number);
            n--;
        }
        while(in.hasNext()) {
            String lookUp = in.nextLine();
            if(phoneBook.containsKey(lookUp)) {
                System.out.println(lookUp + "=" + phoneBook.get(lookUp));
            } else {
                System.out.println("Not found");
            }
            
        }
    }
}
