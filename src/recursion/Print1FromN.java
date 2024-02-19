package recursion;

public class Print1FromN {

    public static void main(String[] args) {

        printN(10, 1);
    }

    private static void printN(int n, int i){

        if(i == n+1)
            return ;
        System.out.println(i);
        printN(n, i+1);
    }
}
