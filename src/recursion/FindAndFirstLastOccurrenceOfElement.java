package recursion;

public class FindAndFirstLastOccurrenceOfElement {

    public static int firstIndex = -1;
    public static int LastIndex = -1;

    public static void main(String[] args) {
        String str = "abhhhaabhhas";

        findOccurrence(str, 0, 'a');
    }

    private static void findOccurrence(String str, int idx, char element) {

        if(idx== str.length()){
            System.out.println(firstIndex);
            System.out.println(LastIndex);
            return;
        }

        char currChar = str.charAt(idx);

        if(currChar == element){
            if(firstIndex == -1){
                firstIndex = idx;
            }else{
                LastIndex = idx;
            }
        }
        findOccurrence(str, idx+1, element);

    }
}
