package strings_problems;
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
        System.out.print(s);
    }
}
