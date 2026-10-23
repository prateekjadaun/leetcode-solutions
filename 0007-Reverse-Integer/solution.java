class Solution{
    public int reverse(int n){
        long rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev>=Integer.MIN_VALUE && rev<= Integer.MAX_VALUE){
            return(int) rev;
        }
        return 0;
    }
}