
package bubblesort;

public class BubbleSort {

    private int temp;
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i <n-1; i++)
            for (int j = 0;j <n-i-1;j++)
                if (arr[j]> arr[j+1])
                {
                    // swap arr [j+1] and arr[i]
                    int tempt = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    
    /*Prints the array */
    void printlnArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i<n; ++i)
            System.out.println(arr[i]+ "");
        System.out.println();
    }
    
    //Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5,3,1,9,8,2,4,7};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printlnArray(arr);
    }
    }
    
    

