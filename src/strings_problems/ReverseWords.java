package strings_problems;

public class ReverseWords {

    public static void main(String[] args) {


        String[] inputs = "i want to learn android development".split(" ");
        String result = "";

        for (int i = inputs.length - 1; i >= 0;  i--) {

            result += inputs[i]+" ";
        }

        //System.out.println(result.trim());
        System.out.println(result.substring(0, result.length() - 1));

    }
}
