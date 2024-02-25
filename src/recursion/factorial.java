package recursion;

public class factorial {

    public static void main(String[] args) {

        System.out.println(findFactorial(4));
    }

    private static int findFactorial(int num){
        if(num == 0){
            return 1;
        }
       int  sum = findFactorial(num-1);
        int ans = num * sum;

        return ans;
    }
}
