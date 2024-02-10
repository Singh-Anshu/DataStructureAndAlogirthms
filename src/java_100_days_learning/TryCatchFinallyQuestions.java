package java_100_days_learning;

public class TryCatchFinallyQuestions {
    public static void main(String[] args) {
        int result = excute();
        System.out.println(result);
    }

    private static int excute(){
        try {
            System.out.println("Try");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("Catch");
            return 1;
        } finally {
            System.out.println("Finally");
            return 3;
        }
    }
}
