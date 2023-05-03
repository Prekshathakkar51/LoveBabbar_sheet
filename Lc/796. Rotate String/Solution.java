class Solution {
    public boolean rotateString(String s, String goal) {

        int n = s.length();
        int m = goal.length();

        if(n !=m){
            return false;
        }

        s = s.concat(s);

        if(s.contains(goal)){
            return true;
        }
        else{
            return false;
        }

        // return s.length()==goal.length() && (s+s).contains(goal);
    }
}