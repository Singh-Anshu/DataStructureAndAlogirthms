package array;

public class FindMiniAndMAxiElement {
    public static void main(String[] args) {

        int[] arr = {5,4,10,18,15,9,20};
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i <arr.length; i++){
             if(arr[i] > max){
                 max= arr[i];
             }

             if(arr[i] < min){
                 min = arr[i];
             }
        }
        System.out.println("Min= "+min + " Max= "+max);
    }
}
