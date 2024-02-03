package java8Features;

//import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMainClass2 
{
	public static void main(String[] args) 
	{
		Stream<String> names = Stream.of("Guru","Sanjay","Sathish","Sanjay","Vigesh","Vicky");
		//long count = names.filter((s)->s.charAt(0)=='S').count();
		//long count = names.filter((s)->s.startsWith("V")).count();
		
		//System.out.println(names.filter((s)->s.startsWith("S")).findFirst());
		
		//System.out.println(count);
		
		//List<String>namesWithS = names.filter((s)->s.startsWith("S")).collect(Collectors.toList());
		
		Set<String> namesWithS = names.filter((s)->s.startsWith("S")).collect(Collectors.toSet());
		
		System.out.println(namesWithS);
		
	}
}
