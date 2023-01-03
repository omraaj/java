class Solution {
       static long gcd(long A, long B){
       if(B==0)
       return A;
       else
       return gcd(B,A%B);
   }
    
    static long lcm(long A, long B){
        return (A/gcd(A,B))*B;
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
            long gcd =gcd(A,B);
           long lcm = lcm(A,B);
           return new Long[] {lcm, gcd};
    }
};