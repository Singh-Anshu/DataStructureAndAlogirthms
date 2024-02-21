package recursion;

public class Print1FromN {

    public static void main(String[] args) {

        printN(10, 1);
        printNReverse(10, 1);
    }

    private static void printN(int n, int i){

        if(i == n+1)
            return ;
        System.out.println(i);
        printN(n, i+1);
    }

    private static void printNReverse(int n, int i){

        if(n == i-1)
            return ;
        System.out.println(n);
        printNReverse(n-1, i);
    }
}
