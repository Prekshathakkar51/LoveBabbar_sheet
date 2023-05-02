//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        
// Approach 1: O(n log(n))
        // Arrays.sort(a);


// Approach 2: O(2n)
        // int zeros = 0;
        // int ones = 0;
        // int twos = 0;
        
        // for(int i = 0; i<n; i++){
        //     if(a[i] == 0){
        //         zeros++;
        //     }
        //     if(a[i] == 1){
        //         ones++;
        //     }
        //     if(a[i] == 2){
        //         twos++;
        //     }
        // }
        
        // for(int i = 0; i< zeros; i++){
        //     a[i] = 0;
        // }
        // for(int i = zeros+1; i<zeros+ones; i++){
        //     a[i] = 1;
        // }
        // for(int i = zeros+ones+1; i<n; i++ ){
        //     a[i] = 2;
        // }

// Approach 3 : O(n) 
// USing Dutch NAtional Flag Algorithm

        int low = 0;
        int mid = 0;
        int high = n-1;
        int temp;
        
        while(mid<=high){
            switch(a[mid]){
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                
                case 1:{
                    mid++;
                    break;
                }
                
                case 2:{
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }
        
        
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends