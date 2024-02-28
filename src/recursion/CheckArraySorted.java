package recursion;

public class CheckArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,0,3,4,5};

        System.out.println(checkArrayIsSortedOrNot(arr, 0));
    }


    private static boolean checkArrayIsSortedOrNot(int[] arr, int index){

        //i=4
        if(index == arr.length-1){
            return true;
        }

        if(arr[index] <= arr[index+1]){

           return checkArrayIsSortedOrNot(arr,  index+1);
        }else{
            System.out.println("Element not sorted");
            return  false;
        }

    }
}
