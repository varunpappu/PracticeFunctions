##Challenge 
##Given an unsorted list of integers, output the integers in order.

##Hint: You can use your previous code that counted the items to print out the actual values in order.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] count = new int[100];
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            count[arr[i]]++;
        }
    
        for(int i = 0; i < n; i++){
            while(count[i] > 0){
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}
