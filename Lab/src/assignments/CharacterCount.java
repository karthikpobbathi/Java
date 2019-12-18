package assignments;

import java.util.Scanner;

public class CharacterCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String c="adsddfffhjhjh";
	char[] chars = c.toCharArray();
	bubbleSort(chars);
	count(chars);
	sc.close();
		
}
static void bubbleSort(char arr[])
{
    int n = arr.length;
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if ((arr[j]) >(arr[j+1]))
            {
                // swap temp and arr[i]
                 char temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
    
    
}
static void count(char[] a){
	int count;
	for(int i=0;i<a.length;i=i+count){
		count=0;
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]){
				count++;
			}
			else{
				break;
			}
		}
		System.out.println(a[i]+" "+ ++count);
	}
}
}
