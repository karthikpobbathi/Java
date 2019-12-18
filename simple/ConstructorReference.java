package simple;

import java.util.function.Supplier;

public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Supplier<Item> s1=Item::new;
			s1.get().setName("mobiles");
			System.out.println(s1.get().getName());
	}

}
