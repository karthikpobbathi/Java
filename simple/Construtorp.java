package simple;

public class Construtorp {
public static void main(String[] args) {
Simplee simple=new Simplee();
Simplee simple1=new Simplee("karthik","Karhik");
System.out.println(simple1.password+simple1.usetrname);
System.out.println(simple.usetrname+simple.password);}
}
class Simplee{

	String usetrname;
	String password;
	public Simplee() {
		super();
		usetrname="karthik";
		password="isGreat";
		// TODO Auto-generated constructor stub
	}
	public Simplee(String usetrname, String password) {
		super();
		this.usetrname = usetrname;
		this.password = password;
	}
	
	
}
