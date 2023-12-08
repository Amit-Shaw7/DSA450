package RecursionBasic;

public class O04SumTillN {
    public static void main(String[] args) {
        long n = 5;
        System.out.println(sumFirstN(n));
    }

    public static long sumFirstN(long n) {
        // Write your code here.
        long sum = add(n , 0);
    
        return sum;
    }

    public static long add(long n , long sum){
        if(n == 0){
            return sum;
        }
        sum += n;
        return add(n-1 , sum);
    }
}


// Formula for TC - O(1) = n*(n+1)/2
