import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ShortByLambda {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("Abdus");
	names.add("Cinthia");
	names.add("Aarshiya");
	names.add("Billu");
	names.add("Tillu");
	names.add("Gullu");
	Collections.sort(names, (s1,s2)->s1.compareTo(s2));
	names.forEach(System.out::println);
	
}
}
