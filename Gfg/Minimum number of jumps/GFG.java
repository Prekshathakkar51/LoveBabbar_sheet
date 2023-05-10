//{ Driver Code Starts
    import java.lang.*;
    import java.io.*;
    import java.util.*;
    class GFG
     {
        public static void main (String[] args) throws IOException
         {
         
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine()); 
    
            while(t-- > 0){
                int size = Integer.parseInt(br.readLine());
                String[] arrStr = ((String)br.readLine()).split("\\s+");
                int[] arr= new int[size];
                for(int i = 0;i<size;i++){
                    arr[i] = Integer.parseInt(arrStr[i]);
                }
                System.out.println(new Solution().minJumps(arr));
            }
         }
         
    }
    
    // } Driver Code Ends
    
    
    // this code assume that there is always a solution bt it cannot be the case everytime, henc eit is not able to pass all test cases
    // class Solution{
    //     static int minJumps(int[] arr){
    //         // your code here
    //         int n = arr.length;
    //         if(arr[0] == 0){
    //             return -1;
    //         }
            
    //         if(n==1){
    //             return 0;
    //         }
            
    //         int jump = 0;
    //         int posi = 0;
    //         int desti = 0;
            
    //         for(int i = 0; i<n-1; i++){
                
    //             desti = Math.max(desti, arr[i]+i);
                
    //             if(posi == i){
    //                 posi = desti;
    //                 jump++;
    //             }
    //         }
            
    //         return jump;
    //     }
    // }
    
    
    class Solution {
        static int minJumps(int[] arr) {
            int n = arr.length;
            if (arr[0] == 0) {
                return -1;
            }
            int jump = 0;
            int posi = 0;
            int desti = 0;
            for (int i = 0; i < n - 1; i++) {
                desti = Math.max(desti, arr[i] + i);
                if (desti >= n - 1) {
                    jump++;
                    break;
                }
                if (i == desti) {
                    return -1;
                }
                if (i == posi) {
                    posi = desti;
                    jump++;
                }
            }
            return jump;
        }
    }
    