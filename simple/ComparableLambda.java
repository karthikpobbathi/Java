package simple;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> comp=(s1,s2)->
		Integer.compare(s1.length(),s2.length());
		String[] values={"****","***","*","**"};
		Collections.sort(Arrays.asList(values),comp);
		for(String value:values){
			System.out.println(value);
		}
		}
	}


