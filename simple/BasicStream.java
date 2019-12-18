package simple;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class BasicStream {
	public static void main(String[] args) {
		
		Stream <String> stream=Stream.of("A","S","D","F","G");
		stream.forEach((location)->System.out.print(location));
		
		List<String> locations= Arrays.asList(new String[]{"qwe","rty","uio","asd","fgh"});
		stream = locations.stream();
		stream.forEach(System.out::println);
		List<String> words = Arrays.asList("karthik","rehman","Bhanu");
		words.stream().map(str->str.length()).forEach(System.out::println);
		List<Integer> listint = Arrays.asList(11,3,44,5,66,33,44);
		listint.stream().map(num->num>10).forEach(num->System.out.println(num));
		listint.stream().distinct().forEach(num->System.out.println(num));
	       
	       
        listint.stream().limit(2).forEach(num->System.out.println(num));
		List <Integer> intlist= Arrays.asList(500,23,44,3423);
		Optional<Integer> result =intlist.stream().reduce((a,b)->a+b);
		if(result.isPresent()){
			System.out.println("Result:"+result.get());
		}
	}}
