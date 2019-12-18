package simple;

public class Nullp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ptr=null;
		try{
			ptr.length();
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
	}

}
