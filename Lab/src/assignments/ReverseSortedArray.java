package assignments;

public class ReverseSortedArray {
public static void main(String[] args) {
	int[] arr= new int[]{23,34,21,25,55};
	arr=revSortArray(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
static int[] revSortArray(int[] arr){
	int temp=0;
	for (int i = 0; i < arr.length; i++) {
		while(arr[i]!=0){
			temp=temp*10+arr[i]%10;
			arr[i]=arr[i]/10;
		}arr[i]=temp;
		temp=0;
	}
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-i-1; j++) {
			if(arr[j]>arr[j+1]){
				temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
			}
		}
	}
	return arr;
}
}
