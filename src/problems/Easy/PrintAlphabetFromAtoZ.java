package problems.Easy;

public class PrintAlphabetFromAtoZ {

    public static void main(String[] args) {
        // Print the letters
        System.out.println("Alphabets from A to Z and a to z are:");

        // Using for loop to traverse each character.
        //Capital Letters
        for(char i = 'A'; i<= 'Z'; i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        //Small Letters
        for(char i = 'a'; i<= 'z'; i++){
            System.out.print(i+ " ");
        }
    }
}
