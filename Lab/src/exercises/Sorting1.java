package exercises;

public class Sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkNumber(123));

	} static boolean checkNumber(int input){
		int x;
		int y;
		while(input!=0){
			x=input%10;
			input=input/10;
			y=input%10;
			input=input/10;
			if(x>y){
				continue;
			}
			else{
				return false;
			}
	}return true;}
}
