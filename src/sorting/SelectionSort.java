package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {11,6,9,1,7,5};

        for(int i=0; i<array.length; i++){
            int index = i;
            for(int j=i + 1; j<array.length; j++)
                if(array[j]<array[index])
                    index = j;
                    int smallestNumberSoFar = array[index];
                    array[index] = array[i];
                    array[i] = smallestNumberSoFar;
        }

        //after sorting is done, print the numbers to the console
        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }

    }

}
