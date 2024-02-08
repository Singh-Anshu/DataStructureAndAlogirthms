package searching;

public class LinearSearching {

    /*

    Linear Search is a very simple search algorithm. In this type of search, a sequential search is made over all items one by one.
    Every Item is checked and if a match is found then that particular item is returned, otherwise the search continues till the end
    of the data collection.

    A simple approach for linear search as follows:-
    (arr is array and x is the variable which we have to search in an array)

    1. Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
    2. If x matches with an element, print the index position.
    3. If x doesn't match with an element, print the element not found.

    Problem of Linear searching:-

    The linear search is inefficient - If the array being searched contains 20,000 elements, the algorithm will have to look at all 20,000 elements in order
    to find a value in the last element. In an average case, an item is just as likely to be found near the beginning of the array as near the end.
    The maximum number of comparisons is always N.

    Linear search is rarely practical because other search algorithms and schemes, such as the binary search algorithm and hash tables, allow
    significantly faster searching for all but short lists.
     */

    public static void main(String[] args) {

        int[] arr = {2, 10, 4, 5, 20, 18, 7, 9, 14, 6};
        int searchItem = 9;

        String[] names = {"amit", "saurabh", "girish", "mayur", "anshu", "dheeraj", "deepak"};
        String searchNames = "anshu";

        LinearSearching linearSearching = new LinearSearching();
        linearSearching.findIntegerItem(arr, searchItem);
        linearSearching.findStringItem(names, searchNames);
    }


    private void findStringItem(String[] arr, String searchNames){
        boolean itemMatch = false;

        for(int i=0; i < arr.length; i++){

            if(arr[i].equalsIgnoreCase(searchNames)){
                itemMatch = true;
                System.out.println("Name "+ arr[i] +" present at "+ i +" index position");
                break;
            }
        }

        if(!itemMatch){
            System.out.println("Names is not found in array");
        }
    }


    private void findIntegerItem(int[] arr, int searchItem){
        boolean itemMatch = false;

        for(int i=0; i < arr.length; i++){

            if(arr[i] == searchItem){
                itemMatch = true;
                System.out.println("The value "+ arr[i] +" present at "+ i +" index position");
                break;
            }
        }

        if(!itemMatch){
            System.out.println("Element is not found in array");
        }
    }
}
