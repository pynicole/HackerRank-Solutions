import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            arr[i] = a;
        }
        
        int result=0;
        
        for(int j=0; j<arr.length; j++){
            int sum=0;
            for(int k=j; k<arr.length; k++){
                sum+=arr[k];
                if(sum<0){
                    result++;
                }
            }
        }
        
        System.out.println(result);
        
    }
}

