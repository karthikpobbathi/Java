package assignments;
import java.util.Scanner;
public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[4];
		Scanner sc=new Scanner(System.in);
				for(int i=0;i<4;i++){
					arr[i]=sc.next();}
				sc.close();
				bubbleSort(arr);
				arr=manupulating(arr);
				for(int i=0;i<4;i++){
System.out.println(arr[i]);}
	}
	static void bubbleSort(String arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if ((arr[j].toUpperCase()).charAt(0) >(arr[j+1].toUpperCase()).charAt(0))
                {
                    // swap temp and arr[i]
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        
        
    }
	static String[] manupulating(String[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr.length%2!=0){
			if(i<(arr.length/2)+1){
				arr[i]=arr[i].toUpperCase();}
			else{
			arr[i]=arr[i].toLowerCase();}}
			else{
				if(i<(arr.length/2)){
					arr[i]=arr[i].toUpperCase();}
				else{
				arr[i]=arr[i].toLowerCase();}}}
			
			return arr; }
	
}	


