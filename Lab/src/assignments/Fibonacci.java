package assignments;

public class Fibonacci {
public static void main(String[] args) {
	System.out.println(recursive(5));
	System.out.println(nonRecursive(5));
}
static int recursive(int n){
	if(n<=2)
		return 1;
		return recursive(n-1)+recursive(n-2);
}
static int nonRecursive(int n){
	int first=1;
	int second=1,num=0;
	for (int i = 2; i < n; i++) {
		 num=first+second;
		first=second;
		second=num;
	}return num;
}
}
