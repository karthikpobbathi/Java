package simple;

public class Split {
public static void main(String[] args) {
	String str="hello.gg";
	String[]b ;
	b=str.split(".",5);
	/*for(int i=0;i<b.length;i++){
		System.out.println(b[i]);
	}*/
	for(String a:b){
		System.out.println(a);
	}
}
}
