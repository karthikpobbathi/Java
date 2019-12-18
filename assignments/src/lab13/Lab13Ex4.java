package lab13;
interface A1{
	int add(int a, int b);
}
class Ex{
	public int mul(int a, int b) {
		return a*b;
	}
}
public class Lab13Ex4 {
	public static int sub(int a, int b) {
		return b-a;
	}
	
	public static void main(String[] args) {
		
		A1 a1 = (a, b)->{
			return a+b;
		};
		System.out.println(a1.add(20, 40));
		
		A1 a2 = Lab13Ex4::sub;
		System.out.println(a2.add(30, 70));
		
		Ex e = new Ex();
		A1 a3 = e::mul;
		System.out.println(a3.add(50, 100));
	}
}
