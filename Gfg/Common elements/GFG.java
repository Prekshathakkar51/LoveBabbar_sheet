// { Driver Code Starts
    //Initial Template for Java
    
    import java.util.*;
    
    public class GFG
    {
        public static void main(String args[]) 
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) 
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int n3 = sc.nextInt();
                
                int A[] = new int[n1];
                int B[] = new int[n2];
                int C[] = new int[n3];
                
                for (int i = 0;i < n1;i++)
                {
                    A[i] = sc.nextInt();
                }
                for (int i = 0;i < n2;i++)
                {
                    B[i] = sc.nextInt();
                }
                for (int i = 0;i < n3;i++)
                {
                    C[i] = sc.nextInt();
                }
                
                Solution sol = new Solution();
                ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
                if (res.size() == 0)
                {
                    System.out.print(-1);
                }
                else 
                {
                    for (int i = 0;i < res.size();i++)
                    {
                        System.out.print(res.get(i) + " ");
                    }    
                }
                System.out.println();
            }
        }
    }
    
    
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    //     class Solution {
    //     ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
    //         ArrayList<Integer> result = new ArrayList<>();
    
    //         for (int i = 0; i < n1; i++) {
    //             for (int j = 0; j < n2; j++) {
    //                 for (int k = 0; k < n3; k++) {
    //                     if (A[i] == B[j] && B[j] == C[k]) {
                            
    //                         result.add(A[i]);
    //                     }
    //                 }
    //             }
    //         }
            
            
    
    //         return result;
    //     }
    // }
    
    
    
    
    
    // class Solution {
    //     ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
    //         ArrayList<Integer> result = new ArrayList<>();
    
    //         int i = 0, j = 0, k = 0;
    
    //         while (i < n1 && j < n2 && k < n3) {
    //             if (A[i] == B[j] && B[j] == C[k]) {
    //                 // Found a common element
    //                 result.add(A[i]);
    //                 i++;
    //                 j++;
    //                 k++;
    //             } else if (A[i] < B[j]) {
    //                 i++;
    //             } else if (B[j] < C[k]) {
    //                 j++;
    //             } else {
    //                 k++;
    //             }
    //         }
    
    //         return result;
    //     }
    // }
    
    
    
    
    
    
    class Solution {
        ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
            ArrayList<Integer> result = new ArrayList<>();
    
            int i = 0, j = 0, k = 0;
    
            while (i < n1 && j < n2 && k < n3) {
                if (A[i] == B[j] && B[j] == C[k]) {
                    // Found a common element
                    result.add(A[i]);
                    i++;
                    j++;
                    k++;
                } else if (A[i] < B[j]) {
                    i++;
                } else if (B[j] < C[k]) {
                    j++;
                } else {
                    k++;
                }
            }
            
            int n = result.size();
            for (i = 0; i < n - 1; i++) {
                if (result.get(i).equals(result.get(i + 1))) {
                    result.remove(i);
                    i--;
                    n--;
                }
            }
    
            return result;
        }
    }
    
    // time complexity of this code is O(n1 + n2 + n3)
    // space complexity of this code is O(1) 
    
    
    
    
    