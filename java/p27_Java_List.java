import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /*System.out.println(n);*/
        List<Integer> list = new ArrayList<Integer>();
        while(n>0) {
            int num = in.nextInt();
            list.add(num);
            n--;
        }
        /*System.out.println(list);*/
        int q = in.nextInt();
        String insert = "Insert";
        String remove = "Delete";
        while(q>0) {
            in.nextLine();
            String t = in.nextLine();
            /*System.out.println(t);*/
            if(t.equals(insert)) {
                /*System.out.println("Here");*/
                int x = in.nextInt();
                int y = in.nextInt();
                list.add(x,y);
            }
            if(t.equals(remove)) {
                /*System.out.println("There");*/
                int z = in.nextInt();
                list.remove(z);
            }
            q--;
        }
        /*System.out.println(list.toString());*/
        for(int m : list) {
            System.out.print(m + " ");
        }
    }
}
