package simple;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class UserInterface {



	public static void main(String[] args) {


		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Shop obj=new Shop();

		System.out.println("Enter the no of Face Creams you want to store");

		int number=sc.nextInt();
		//int[] a= new int[number];
		String[] value= new String[number];
		int[] key= new int[number];
		
		for(int i=0;i<number;i++){
			System.out.println("Enter the Key"+i);
			key[i]=sc.nextInt();
			System.out.println("Enter the value"+i);
			sc.nextLine();
			value[i]=sc.nextLine();

		}
		HashMap<Integer,String> hash= new HashMap<>();
		obj.setProductMap(hash);

		for(int i=0;i<number;i++){
			obj.addProductDetails(key[i],value[i]);
		}for(int i=0;i<number;i++){
			System.out.println(key[i]+" "+obj.getProductMap().get(key[i]));
		}
		System.out.println("Enter the product type to be searched");
		String d=sc.next();
		Iterator<String> i = obj.searchBasedOnproduct(d).iterator();
		System.out.println("The ArrayList elements are:");
		while (i.hasNext()) {
			System.out.println(i.next());
		}


	}}