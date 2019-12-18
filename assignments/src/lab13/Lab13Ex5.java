package lab13;
interface ABC{
	int factorial(int a);
}
public class Lab13Ex5 {
static ABC abc;
	
	public static int factorial(int a) {
		
		if(a==0||a==1) {
		return 1;
		}
		else {
		return a*factorial(a-1);
		}
	}
	
public static void main(String[] args) {
		
	abc = (a)->{
	if(a==0 || a==1) {
		return 1;
		}
		else {
			return a * abc.factorial(a-1);
		}
		};
		
		System.out.println(abc.factorial(10));
		ABC ans = Lab13Ex5::factorial;
		System.out.println(ans.factorial(6));
	}
}
