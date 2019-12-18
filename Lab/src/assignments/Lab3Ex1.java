package assignments;

public class Lab3Ex1 {
public static void main(String[] args) {
	int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	bubbleSort(intArray);
	System.out.println(getSecondSmallest(intArray));
}
static int getSecondSmallest(int[] input){
	return input[1];
}
static void bubbleSort(int arr[])
{
    int n = arr.length;
    for (int i = 0; i < 2; i++)// Sort upto third element
        for (int j = 0; j < n-i-1; j++)
            if (arr[j] > arr[j+1])
            {
                // swap temp and arr[i]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
}
}
