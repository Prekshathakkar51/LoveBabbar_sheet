//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        
        int flag = 0;
        int n = S.length();
        String rev = "";
        
        for(int i = (n-1); i>=0; i--){
            rev = rev + S.charAt(i);
        }
        
        if(S.equals(rev)){
            flag = 1;
        }
        else{
            flag = 0;
        }
        
        return flag;
        
    }
};