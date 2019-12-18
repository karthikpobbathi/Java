package lab13;
interface Power {
	double calulatePower(int x,int y);
}
public class Lab13Ex1 {
	public static void main(String args[]) {
        Power p=(x,y)->Math.pow(x, y);
        double d=p.calulatePower(2, 3);
        System.out.println(d);
            	 
}
}
