class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i = 0; i<=(n/2)-1; i++){
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }

        // 2 pointers approach

        // int i = 0;
        // while(i<n){

        //     char temp = s[i];
        //     s[i] = s[n-1];
        //     s[n-1] = temp;
        //     i++;
        //     n--;

        // }
        System.out.println(s);
        
    }
}