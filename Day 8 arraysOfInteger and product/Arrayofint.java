class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> sol = new ArrayList<>();
        int i = num.length-1;
       int c=0;
       while(i>0  || k>=0){
        int numval=0;
        if(i>=0){
            numval=num[i];
        } int d=k%10;
        int sum = numval+d+c;
        int s=sum%10;
        c=sum/10;
        sol.add(s);
        i--;
        k=k/10;
    }
    if(c>0){
        sol.add(c);
    }
    Collections.reverse(sol);
    return sol;
}
}