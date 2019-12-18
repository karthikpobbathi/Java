package lab13;

import java.util.Scanner;

interface Format {
	void form(String str);
}
public class Lab13Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
			
		Format f = (st)->{
			
				char[] ch = st.toCharArray();
				char[] res = new char[st.length()*2];
				int j=0;
				
				for(int i=0;i<st.length();i++) {
					
					if(i>0) {
						
						res[j++] = ' ';
						res[j++] = ch[i];
					}
					else {
						res[j++] = ch[i];
					}
				}
				
				System.out.println(res);
			};
			f.form(str);
			
		}
}
