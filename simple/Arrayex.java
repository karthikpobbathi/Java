package simple;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		a[0]=1;
		a[1]=1;
		a[2]=1;
		a[3]=1;
		try {
			for(int i=0;i<=5;i++){
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("error");
			
		}
	}

}
