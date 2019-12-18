package simple;
interface Sayable{
	void say();
}
public class HelloImp implements {
public void saySomething(){
	System.out.println("hello this is not a static method.");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloImp ref=new HelloImp();
		Sayable sayable = ref::saySomething;
		sayable.say();
		Sayable sayable2= new HelloImp()::saySomething;
		sayable2.say();
	}

}
