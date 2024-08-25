class Solution {
    public String reverseWords(String s) {
        String[] arrr=s.split("\\s+"); // split on the basis of spaces between
        StringBuilder sb = new StringBuilder("");
        for(int i = arrr.length-1;i>=0;i--){
            sb.append(arrr[i]+" ");
        }
        // trim function----> remove trailing and leading spaces
        String ans=sb.toString();
        ans=ans.trim();

        return ans;
    }
}